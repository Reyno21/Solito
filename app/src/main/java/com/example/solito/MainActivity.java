package com.example.solito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnacceso, btnsalir;
    TextView usuario, contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.usuario);
        contrasena = findViewById(R.id.password);

        btnacceso = findViewById(R.id.Entrar);
        btnacceso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(usuario.getText().toString().equals("Reyno") && contrasena.getText().toString().equals("123")){
                    Intent intent = new Intent(view.getContext(), botones2.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this, "Usuario o contraseña incorrecta", Toast.LENGTH_LONG).show();
                    usuario.setText("");
                    contrasena.setText("");
                }
            }
        });

        btnsalir = findViewById(R.id.Salir);
        btnsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "¡Cerrando aplicación, nos vemos!", Toast.LENGTH_SHORT).show();
                finishAffinity();
            }
        });
    }
}