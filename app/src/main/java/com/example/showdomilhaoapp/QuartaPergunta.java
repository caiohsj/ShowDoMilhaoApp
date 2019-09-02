package com.example.showdomilhaoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class QuartaPergunta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarta_pergunta);

        ListView lv = (ListView) findViewById(R.id.pergunta4);

        final String[] respostas = {
                "Negra",
                "De Sherwood",
                "Da Tijuca",
                "Amazônica"
        };

        final String respostaCerta = "Amazônica";

        ArrayAdapter adapter = new ArrayAdapter(QuartaPergunta.this,android.R.layout.simple_list_item_1,respostas);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(respostas[position].equals(respostaCerta)){
                    Intent proxima = new Intent(QuartaPergunta.this,QuintaPergunta.class);

                    startActivity(proxima);
                } else {
                    Toast.makeText(QuartaPergunta.this,"Resposta errada :(", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
