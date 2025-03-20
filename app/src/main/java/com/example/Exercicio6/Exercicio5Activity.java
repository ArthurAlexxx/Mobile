package com.example.Exercicio6; // Altere para o nome do seu pacote

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Exercicio5Activity extends AppCompatActivity {

    private CheckBox checkBoxNotificacoes, checkBoxModoEscuro, checkBoxLembrarLogin;
    private Button buttonSalvarPreferencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio5);

        // Inicializando os componentes
        checkBoxNotificacoes = findViewById(R.id.checkBoxNotificacoes);
        checkBoxModoEscuro = findViewById(R.id.checkBoxModoEscuro);
        checkBoxLembrarLogin = findViewById(R.id.checkBoxLembrarLogin);
        buttonSalvarPreferencias = findViewById(R.id.buttonSalvarPreferencias);

        // Configurando o listener do botão
        buttonSalvarPreferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvarPreferencias();
            }
        });
    }

    private void salvarPreferencias() {
        // Verifica quais checkboxes estão marcados
        StringBuilder preferencias = new StringBuilder();

        if (checkBoxNotificacoes.isChecked()) {
            preferencias.append("Receber notificações\n");
        }
        if (checkBoxModoEscuro.isChecked()) {
            preferencias.append("Modo escuro\n");
        }
        if (checkBoxLembrarLogin.isChecked()) {
            preferencias.append("Lembrar login\n");
        }

        // Verifica se nenhuma preferência foi escolhida
        if (preferencias.length() == 0) {
            preferencias.append("Nenhuma preferência foi escolhida");
        }

        // Exibe as preferências em um Toast
        Toast.makeText(this, preferencias.toString(), Toast.LENGTH_LONG).show();
    }
}