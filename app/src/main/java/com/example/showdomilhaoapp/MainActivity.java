package com.example.showdomilhaoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iniciarJogo(View view) {
        Intent abrir = new Intent(MainActivity.this,PrimeiraPergunta.class);

        startActivity(abrir);
    }
}
