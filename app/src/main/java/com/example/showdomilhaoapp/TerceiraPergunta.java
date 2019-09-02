package com.example.showdomilhaoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class TerceiraPergunta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_pergunta);

        ListView lv = (ListView) findViewById(R.id.pergunta3);

        final String[] respostas = {
                "Matilha",
                "Rebanho",
                "Cardume",
                "Manada"
        };

        final String respostaCerta = "Matilha";

        ArrayAdapter adapter = new ArrayAdapter(TerceiraPergunta.this,android.R.layout.simple_list_item_1,respostas);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(respostas[position].equals(respostaCerta)){
                    Intent proxima = new Intent(TerceiraPergunta.this,QuartaPergunta.class);

                    startActivity(proxima);
                } else {
                    Toast.makeText(TerceiraPergunta.this,"Resposta errada :(",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
