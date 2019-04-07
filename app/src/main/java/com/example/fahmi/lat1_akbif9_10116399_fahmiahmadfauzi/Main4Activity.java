package com.example.fahmi.lat1_akbif9_10116399_fahmiahmadfauzi;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    TextView tV1, tV2, tV3, tV4, tV5;
    Typeface boldd, regular;

    String nama;
    TextView txtnama;
    private String KEY_NAMA = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        tV1 = findViewById(R.id.txt1);
        tV2 = findViewById(R.id.txt2);
        tV3 = findViewById(R.id.txt3);
        tV4 = findViewById(R.id.txt4);
        tV5 = findViewById(R.id.txt5);
        txtnama = findViewById(R.id.txtNama);

        boldd = Typeface.createFromAsset(getAssets(), "font/nunito_bold.ttf");
        regular = (Typeface.createFromAsset(getAssets(), "font/rubik_regular.ttf"));


        Bundle extra = getIntent().getExtras();

        nama = extra.getString(KEY_NAMA);

        txtnama.setText(nama);


        tV1.setTypeface(boldd);
        tV2.setTypeface(boldd);
        tV3.setTypeface(boldd);
        tV4.setTypeface(boldd);
        tV5.setTypeface(boldd);
        txtnama.setTypeface(boldd);
    }
}
