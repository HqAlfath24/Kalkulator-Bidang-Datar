package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnPersegi, btnSegitiga, btnLingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPersegi =(Button) findViewById(R.id.btnPersegi);
        btnSegitiga =(Button) findViewById(R.id.btbSegitiga);
        btnLingkaran =(Button) findViewById(R.id.btnLingkaran);

        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                Intent intent = new Intent(asal, target);
                startActivity(intent);
                 */
                Intent PersegiAct = new Intent(getApplicationContext(),PersegiActivity.class);
                startActivity(PersegiAct);
            }
        });

        // memanggil prosedur
        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { btnSegitiga(); }
        });

        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnLingkaran();
            }
        });
    }

    // prosedur
    public void btnSegitiga(){
        Intent SegitigaAct = new Intent(getApplicationContext(),SegitigaActivity.class);
        startActivity(SegitigaAct);
    }

    public void btnLingkaran(){
        Intent LingkaranAct = new Intent(getApplicationContext(),LingkaranActivity.class);
        startActivity(LingkaranAct);
    }
}