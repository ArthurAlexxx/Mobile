package com.example.Exercicio6; // Altere para o nome do seu pacote

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Exercicio1Activity extends AppCompatActivity {

    private EditText editTextNome, editTextIdade;
    private Button buttonVerificar;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1);

        // Inicializando os componentes
        editTextNome = findViewById(R.id.editTextNome);
        editTextIdade = findViewById(R.id.editTextIdade);
        buttonVerificar = findViewById(R.id.buttonVerificar);
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
        // Captura o nome e a idade
        String nome = editTextNome.getText().toString();
        String idadeStr = editTextIdade.getText().toString();

        // Verifica se os campos estão preenchidos
        if (nome.isEmpty() || idadeStr.isEmpty()) {
            textViewResultado.setText("Por favor, preencha todos os campos.");
            return;
        }

        // Converte a idade para inteiro
        int idade = Integer.parseInt(idadeStr);

        // Verifica se é maior de idade
        if (idade >= 18) {
            textViewResultado.setText(nome + ", você é maior de idade.");
        } else {
            textViewResultado.setText(nome + ", você é menor de idade.");
        }
    }
}