package com.example.fahmi.lat1_akbif9_10116399_fahmiahmadfauzi;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    Button btnlanjut;
    EditText edtnama, edtumur;
    TextView tV1, tV2;
    Typeface boldd, regular;
    String nama, umur;
    private String KEY_NAMA = "NAMA";
    private String KEY_UMUR = "UMUR";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tV1 = findViewById(R.id.text1);
        tV2 = findViewById(R.id.text2);
        btnlanjut = findViewById(R.id.btnLanjut);
        edtnama = findViewById(R.id.edtNama);
        edtumur = findViewById(R.id.edtUmur);
        boldd = Typeface.createFromAsset(getAssets(), "font/nunito_bold.ttf");
        regular = (Typeface.createFromAsset(getAssets(), "font/rubik_regular.ttf"));

        tV1.setTypeface(boldd);
        tV2.setTypeface(boldd);


        btnlanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = edtnama.getText().toString();
                umur = edtumur.getText().toString();

                Intent goLanjut = new Intent(Main3Activity.this, Main4Activity.class);
                goLanjut.putExtra(KEY_NAMA, nama);
                goLanjut.putExtra(KEY_UMUR, umur);
                startActivity(goLanjut);
            }
        });


    }
}

