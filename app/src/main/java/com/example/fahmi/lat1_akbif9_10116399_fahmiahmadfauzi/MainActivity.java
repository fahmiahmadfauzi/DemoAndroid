package com.example.fahmi.lat1_akbif9_10116399_fahmiahmadfauzi;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tV1, tV2;
    Typeface boldd, regular;
    Button btnStar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tV1 = findViewById(R.id.textView);
        tV2 = findViewById(R.id.textView2);
        boldd = Typeface.createFromAsset(getAssets(), "font/nunito_bold.ttf");
        regular = (Typeface.createFromAsset(getAssets(), "font/rubik_regular.ttf"));

        tV1.setTypeface(boldd);
        tV2.setTypeface(boldd);

        btnStar = findViewById(R.id.btnMulai);

        btnStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goMain2 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(goMain2);
            }
        });
    }
}
