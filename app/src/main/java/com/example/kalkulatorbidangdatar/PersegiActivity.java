package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class PersegiActivity extends AppCompatActivity {

    EditText edtPanjang, edtLebar;
    TextView txtLebar, txtPanjang, txtLuas, txtKeliling;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        initComponent();
    }

    private void initComponent() {
        edtPanjang=findViewById(R.id.edtPanjang);
        edtLebar=findViewById(R.id.edtLebar);
        txtPanjang=findViewById(R.id.txtPanjang);
        txtLebar=findViewById(R.id.txtLebar);
        txtLuas=findViewById(R.id.txtLuas);
        txtKeliling=findViewById(R.id.txtKeliling);
    }


    public void hitungPersegi(View v){

        String panjang = edtPanjang.getText().toString();
        String lebar = edtLebar.getText().toString();

        Integer p = Integer.parseInt(panjang);
        Integer l = Integer.parseInt(lebar);

        int luas = p*l;
        int keliling = 2*(p+l);

        txtPanjang.setText(panjang);
        txtLebar.setText(lebar);
        txtLuas.setText(String.valueOf(luas));
        txtKeliling.setText(String.valueOf(keliling));
    }

}
