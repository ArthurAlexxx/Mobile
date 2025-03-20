package com.example.Exercicio2; // Altere para o nome do seu pacote

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.calculadorasimples.R;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNum1, editTextNum2;
    private Button buttonSoma, buttonSubtracao, buttonMultiplicacao, buttonDivisao;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializando os componentes
        editTextNum1 = findViewById(R.id.editTextNum1);
        editTextNum2 = findViewById(R.id.editTextNum2);
        buttonSoma = findViewById(R.id.buttonSoma);
        buttonSubtracao = findViewById(R.id.buttonSubtracao);
        buttonMultiplicacao = findViewById(R.id.buttonMultiplicacao);
        buttonDivisao = findViewById(R.id.buttonDivisao);
        textViewResultado = findViewById(R.id.textViewResultado);

        // Configurando os listeners dos botões
        buttonSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular('+');
            }
        });

        buttonSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular('-');
            }
        });

        buttonMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular('*');
            }
        });

        buttonDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular('/');
            }
        });
    }

    private void calcular(char operacao) {
        // Verifica se os campos estão vazios
        if (editTextNum1.getText().toString().isEmpty() || editTextNum2.getText().toString().isEmpty()) {
            textViewResultado.setText("Por favor, insira ambos os números.");
            return;
        }

        double num1 = Double.parseDouble(editTextNum1.getText().toString());
        double num2 = Double.parseDouble(editTextNum2.getText().toString());
        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    textViewResultado.setText("Erro: Divisão por zero");
                    return;
                }
                break;
        }

        textViewResultado.setText("Resultado: " + resultado);
    }
}