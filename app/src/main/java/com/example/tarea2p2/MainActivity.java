package com.example.tarea2p2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BOTONES();

        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText("Integrantes del grupo: \n" +
                "- Olvin Figueroa (201320070010)\n" +
                "- Melvin Orellana (201110510061)\n" +
                "- Victor Madrid (202110010471)\n" +
                "- Emely Alexandra Vallecillo (202110120024)\n" +
                "- Dennis Antonio Landero Ramos(201910070086)\n" +
                "- Daisy Carolina Pérez Betanco (202010060081) \n" +
                "- Kevin Orlando Paredes Funez (202130020046)\n" +
                "- Yisela Diney Molina Sosa (202010010089)");

    }

    private void BOTONES() {
        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityPlaceHolder.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityPlaceHolderBuscar.class);
                startActivity(intent);
            }
        });
    }
}