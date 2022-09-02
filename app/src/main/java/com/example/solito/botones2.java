package com.example.solito;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class botones2 extends AppCompatActivity {

    Button btnCalculadora, btnSalida, btnImagenes, btnWeb, btnVideo, btnMaps, btnLoco, btnCreditos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botones2);

        btnCalculadora = findViewById(R.id.btnCalculadora);
        btnCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(view.getContext(), Calculadora.class);
                startActivity(intent);

            }
        });
        btnImagenes = findViewById(R.id.btnImagenes);
        btnImagenes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(view.getContext(), Imagenes.class);
                startActivity(intent);

            }
        });
        btnWeb = findViewById(R.id.btnWeb);
        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(view.getContext(), Web.class);
                startActivity(intent);

            }
        });
        btnVideo = findViewById(R.id.btnVideos);
        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(view.getContext(), Video.class);
                startActivity(intent);

            }
        });

        btnMaps = findViewById(R.id.btnMaps);
        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(view.getContext(), Calculadora.class);
                startActivity(intent);

            }
        });
        btnLoco = findViewById(R.id.btnLoco);
        btnLoco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(view.getContext(), Calculadora.class);
                startActivity(intent);

            }
        });
        btnCreditos = findViewById(R.id.btnAcerca_de);
        btnCreditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getCreditos();
            }
        });

        btnSalida = findViewById(R.id.btnFSalida);
        btnSalida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(botones2.this, "¡Cerrando aplicación, nos vemos!", Toast.LENGTH_SHORT).show();
                finishAffinity();
            }
        });

    }
    public void getCreditos(){
        new AlertDialog.Builder(this).setTitle("Acerca de").setMessage("" + "Gerardo Pastrana Gómez \n"
                + "Aplicación 'Un Solito'\n" + "Programación Movil en Android \n" + "Versión 1.0\n" ).setPositiveButton("Aceptar", null).show();
    }
}