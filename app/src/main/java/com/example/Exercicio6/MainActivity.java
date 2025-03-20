package com.example.Exercicio6; // Altere para o nome do seu pacote

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.menuexercicios.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Botão para o Exercício 1
        Button buttonExercicio1 = findViewById(R.id.buttonExercicio1);
        buttonExercicio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Exercicio1Activity.class);
                startActivity(intent);
            }
        });

        // Botão para o Exercício 2
        Button buttonExercicio2 = findViewById(R.id.buttonExercicio2);
        buttonExercicio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Exercicio2Activity.class);
                startActivity(intent);
            }
        });

        // Botão para o Exercício 3
        Button buttonExercicio3 = findViewById(R.id.buttonExercicio3);
        buttonExercicio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Exercicio3Activity.class);
                startActivity(intent);
            }
        });

        // Botão para o Exercício 4
        Button buttonExercicio4 = findViewById(R.id.buttonExercicio4);
        buttonExercicio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Exercicio4Activity.class);
                startActivity(intent);
            }
        });

        // Botão para o Exercício 5
        Button buttonExercicio5 = findViewById(R.id.buttonExercicio5);
        buttonExercicio5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Exercicio5Activity.class);
                startActivity(intent);
            }
        });
    }
}