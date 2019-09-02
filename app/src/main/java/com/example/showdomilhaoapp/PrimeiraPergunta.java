package com.example.showdomilhaoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class PrimeiraPergunta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_pergunta);

        ListView lv = (ListView) findViewById(R.id.pergunta1);

        final String[] respostas = {
                "10",
                "11",
                "20",
                "21"
        };

        final String respostaCerta = "10";

        ArrayAdapter adapter = new ArrayAdapter(PrimeiraPergunta.this,android.R.layout.simple_list_item_1,respostas);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(respostas[position].equals(respostaCerta)){
                    Intent proxima = new Intent(PrimeiraPergunta.this,SegundaPergunta.class);

                    startActivity(proxima);
                } else {
                    Toast.makeText(PrimeiraPergunta.this,"Resposta errada :(",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
