package com.example.Exercicio5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.preferenciasusuario.R;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxNotificacoes, checkBoxModoEscuro, checkBoxLembrarLogin;
    private Button buttonSalvarPreferencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        checkBoxNotificacoes = findViewById(R.id.checkBoxNotificacoes);
        checkBoxModoEscuro = findViewById(R.id.checkBoxModoEscuro);
        checkBoxLembrarLogin = findViewById(R.id.checkBoxLembrarLogin);
        buttonSalvarPreferencias = findViewById(R.id.buttonSalvarPreferencias);


        buttonSalvarPreferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvarPreferencias();
            }
        });
    }

    private void salvarPreferencias() {

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


        if (preferencias.length() == 0) {
            preferencias.append("Nenhuma preferência foi escolhida");
        }


        Toast.makeText(this, preferencias.toString(), Toast.LENGTH_LONG).show();
    }
}