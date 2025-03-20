package com.example.Exercicio1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.maioridadeapp.R;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNome, editTextIdade;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializando os componentes
        editTextNome = findViewById(R.id.editTextNome);
        editTextIdade = findViewById(R.id.editTextIdade);
        Button buttonVerificar = findViewById(R.id.buttonVerificar);
        textViewResultado = findViewById(R.id.textViewResultado);

        // Configurando o listener do botão
        buttonVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificarMaioridade();
            }
        });
    }

    private void verificarMaioridade() {
        // Pegando os valores digitados pelo usuário
        String nome = editTextNome.getText().toString();
        String idadeStr = editTextIdade.getText().toString();

        // Verificando se a idade foi digitada
        if (!idadeStr.isEmpty()) {
            int idade = Integer.parseInt(idadeStr);

            // Verificando se é maior de idade
            if (idade >= 18) {
                textViewResultado.setText(nome + ", você é maior de idade.");
            } else {
                textViewResultado.setText(nome + ", você é menor de idade.");
            }
        } else {
            textViewResultado.setText("Por favor, digite sua idade.");
        }
    }
}