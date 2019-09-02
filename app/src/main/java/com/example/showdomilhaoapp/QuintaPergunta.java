package com.example.showdomilhaoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class QuintaPergunta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quinta_pergunta);

        ListView lv = (ListView) findViewById(R.id.pergunta5);

        final String[] respostas = {
                "3",
                "7",
                "12",
                "22"
        };

        final String respostaCerta = "7";

        ArrayAdapter adapter = new ArrayAdapter(QuintaPergunta.this,android.R.layout.simple_list_item_1,respostas);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(respostas[position].equals(respostaCerta)){
                    Intent proxima = new Intent(QuintaPergunta.this,MainActivity.class);

                    startActivity(proxima);
                } else {
                    Toast.makeText(QuintaPergunta.this,"Resposta errada :(", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
