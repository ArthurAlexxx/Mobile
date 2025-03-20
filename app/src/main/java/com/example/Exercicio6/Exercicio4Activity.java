package com.example.Exercicio6; // Altere para o nome do seu pacote

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class Exercicio4Activity extends AppCompatActivity {

    private EditText editTextNome;
    private Button buttonGerarCheckBoxes;
    private LinearLayout linearLayoutCheckBoxes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio4);

        // Inicializando os componentes
        editTextNome = findViewById(R.id.editTextNome);
        buttonGerarCheckBoxes = findViewById(R.id.buttonGerarCheckBoxes);
        linearLayoutCheckBoxes = findViewById(R.id.linearLayoutCheckBoxes);

        // Configurando o listener do botão
        buttonGerarCheckBoxes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gerarCheckBoxes();
            }
        });
    }

    private void gerarCheckBoxes() {
        // Limpa os checkboxes anteriores
        linearLayoutCheckBoxes.removeAllViews();

        // Captura o nome digitado
        String nome = editTextNome.getText().toString();

        // Verifica se o nome não está vazio
        if (nome.isEmpty()) {
            return;
        }

        // Cria um checkbox para cada letra do nome
        for (int i = 0; i < nome.length(); i++) {
            char letra = nome.charAt(i);

            // Cria um novo CheckBox
            CheckBox checkBox = new CheckBox(this);
            checkBox.setText(String.valueOf(letra)); // Define o texto do CheckBox como a letra
            checkBox.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));

            // Adiciona o CheckBox ao LinearLayout
            linearLayoutCheckBoxes.addView(checkBox);
        }
    }
}