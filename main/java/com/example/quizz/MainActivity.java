package com.example.quizz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup1, radioGroup2, radioGroup3;
    private Button buttonVerificar, buttonLimpar;
    private TextView textViewFeedback1, textViewFeedback2, textViewFeedback3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup2 = findViewById(R.id.radioGroup2);
        radioGroup3 = findViewById(R.id.radioGroup3);
        buttonVerificar = findViewById(R.id.buttonVerificar);
        buttonLimpar = findViewById(R.id.buttonLimpar);
        textViewFeedback1 = findViewById(R.id.textViewFeedback1);
        textViewFeedback2 = findViewById(R.id.textViewFeedback2);
        textViewFeedback3 = findViewById(R.id.textViewFeedback3);

        buttonVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificarRespostas();
            }
        });

        buttonLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limparRespostas();
            }
        });
    }

    private void verificarRespostas() {
        // Pergunta 1 - Correta: "Bowser"
        int selectedId1 = radioGroup1.getCheckedRadioButtonId();
        RadioButton radioButton1 = findViewById(selectedId1);
        if (radioButton1 != null && radioButton1.getText().equals("Bowser")) {
            textViewFeedback1.setText("Pergunta 1: Correto!");
        } else {
            textViewFeedback1.setText("Pergunta 1: Errado! A resposta correta é 'Bowser'.");
        }

        // Pergunta 2 - Correta: "Minecraft"
        int selectedId2 = radioGroup2.getCheckedRadioButtonId();
        RadioButton radioButton2 = findViewById(selectedId2);
        if (radioButton2 != null && radioButton2.getText().equals("Minecraft")) {
            textViewFeedback2.setText("Pergunta 2: Correto!");
        } else {
            textViewFeedback2.setText("Pergunta 2: Errado! A resposta correta é 'Minecraft'.");
        }

        // Pergunta 3 - Correta: "PUBG"
        int selectedId3 = radioGroup3.getCheckedRadioButtonId();
        RadioButton radioButton3 = findViewById(selectedId3);
        if (radioButton3 != null && radioButton3.getText().equals("PUBG")) {
            textViewFeedback3.setText("Pergunta 3: Correto!");
        } else {
            textViewFeedback3.setText("Pergunta 3: Errado! A resposta correta é 'PUBG'.");
        }
    }

    private void limparRespostas() {
        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();
        textViewFeedback1.setText("");
        textViewFeedback2.setText("");
        textViewFeedback3.setText("");
    }
}
