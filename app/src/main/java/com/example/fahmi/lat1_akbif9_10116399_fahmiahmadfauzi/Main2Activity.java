package com.example.fahmi.lat1_akbif9_10116399_fahmiahmadfauzi;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8;
    Typeface boldd, regular;

    Button btnmasuk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = findViewById(R.id.tV1);
        tv2 = findViewById(R.id.tV2);
        tv3 = findViewById(R.id.tV3);
        tv4 = findViewById(R.id.tV4);
        tv5 = findViewById(R.id.tV5);
        tv6 = findViewById(R.id.tV6);
        tv7 = findViewById(R.id.tV7);
        tv8 = findViewById(R.id.tV8);
        btnmasuk = findViewById(R.id.btnMasuk);
        boldd = Typeface.createFromAsset(getAssets(), "font/nunito_bold.ttf");
        regular = (Typeface.createFromAsset(getAssets(), "font/rubik_regular.ttf"));

        tv1.setTypeface(boldd);
        tv2.setTypeface(regular);
        tv3.setTypeface(regular);
        tv4.setTypeface(boldd);
        tv5.setTypeface(regular);
        tv6.setTypeface(boldd);
        tv7.setTypeface(regular);
        tv8.setTypeface(regular);

        btnmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goMasuk = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(goMasuk);
            }
        });
    }
}
