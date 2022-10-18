package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class LingkaranActivity extends AppCompatActivity {

    EditText edtDiameter;
    TextView txtDiameter, txtJari, txtLuas, txtKeliling;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        initComponent();
    }

    private void initComponent() {
        edtDiameter=findViewById(R.id.edtDiameter);
        txtJari=findViewById(R.id.txtJari);
        txtDiameter=findViewById(R.id.txtDiameter);
        txtLuas=findViewById(R.id.txtLuas);
        txtKeliling=findViewById(R.id.txtKeliling);
    }


    public void hitungLingkaran(View v){

        String panjang = edtDiameter.getText().toString();

        Integer d = Integer.parseInt(panjang);

        double r = d/2;
        double luas = 3.14*r*r;
        double keliling = 2*3.14*r;

        txtDiameter.setText(panjang);
        txtJari.setText(String.valueOf(r));
        txtLuas.setText(String.valueOf(luas));
        txtKeliling.setText(String.valueOf(keliling));
    }

}
