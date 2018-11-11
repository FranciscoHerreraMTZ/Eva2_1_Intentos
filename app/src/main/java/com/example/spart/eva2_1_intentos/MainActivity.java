package com.example.spart.eva2_1_intentos;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {
    EditText editTxtNumero;
    Intent inMarcar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTxtNumero = findViewById(R.id.editTxtNumero);
    }
    public void click(View v){
        String sTel = "tel:"+editTxtNumero.getText().toString();
        inMarcar = new Intent(Intent.ACTION_DIAL, Uri.parse(sTel));
        startActivity(inMarcar);

    }
    public void clickLlamar(View v){
        String sTel = "tel:"+editTxtNumero.getText().toString();
        inMarcar = new Intent(Intent.ACTION_CALL, Uri.parse(sTel));
        startActivity(inMarcar);

    }
    public void clickBuscar(View v){
        String sTel = "tel:"+editTxtNumero.getText().toString();
        inMarcar = new Intent(Intent.ACTION_WEB_SEARCH);
        inMarcar.putExtra(SearchManager.QUERY,sTel);
        startActivity(inMarcar);

    }
}
