package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class SegitigaActivity extends AppCompatActivity {

    EditText edtAlas,edtTinggi;
    TextView txtAlas, txtTinggi, txtBidangMiring, txtLuas, txtKeliling;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        initComponent();
    }

    private void initComponent() {
        edtAlas=findViewById(R.id.edtAlas);
        edtTinggi=findViewById(R.id.edtTinggi);
        txtAlas=findViewById(R.id.txtAlas);
        txtTinggi=findViewById(R.id.txtTinggi);
        txtBidangMiring=findViewById(R.id.txtBidangMiring);
        txtLuas=findViewById(R.id.txtLuas);
        txtKeliling=findViewById(R.id.txtKeliling);
    }


    public void hitungSegitiga(View v){

        String alas = edtAlas.getText().toString();
        String tinggi = edtTinggi.getText().toString();

        Double a = Double.parseDouble(alas);
        Double t = Double.parseDouble(tinggi);

        double bm = Math.sqrt(Math.pow(a,2)+Math.pow(t,2));
        double luas = 0.5*a*t;
        double keliling = a+t+bm;

        txtAlas.setText(alas);
        txtTinggi.setText(tinggi);
        txtBidangMiring.setText(String.valueOf(bm));
        txtLuas.setText(String.valueOf(luas));
        txtKeliling.setText(String.valueOf(keliling));
    }

}

