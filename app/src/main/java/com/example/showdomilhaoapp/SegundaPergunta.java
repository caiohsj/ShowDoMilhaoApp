package com.example.showdomilhaoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SegundaPergunta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pergunta);

        ListView lv = (ListView) findViewById(R.id.pergunta2);

        final String[] respostas = {
                "50",
                "100",
                "1000",
                "1500"
        };

        final String respostCerta = "100";

        ArrayAdapter adapter = new ArrayAdapter(SegundaPergunta.this,android.R.layout.simple_list_item_1,respostas);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(respostas[position].equals(respostCerta)){
                    Intent proxima  = new Intent(SegundaPergunta.this,TerceiraPergunta.class);

                    startActivity(proxima);
                } else {
                    Toast.makeText(SegundaPergunta.this,"Resposta erra :(", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
