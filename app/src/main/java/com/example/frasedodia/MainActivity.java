package com.example.frasedodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {

        String[] frases = {
                "Não deixe o medo ser maior do que seu sonho",
                "Só quem corre atrás dos seus objetivos é capaz de atingir o sucesso",
                "Sucesso é a combinação de fracassos, erros, confusão e da determinação de continuar",
                "Cada sonho que você deixa pra trás, é um pedaço do seu futuro que deixa de existir",
                "Tenha fome de vida, sede de descobrir",
                "Não desista nas primeiras tentativas, a persistência é amiga da conquista",
                "Seus clientes mais insatisfeitos são sua melhor fonte de aprendizado",
                "Se você quer chegar onde a maioria não chega, faça o que a maioria não faz",
                "É mais fácil ser o primeiro, do que continuar a ser o primeiro",
                "A paciência é um elemento fundamental do sucesso",
                "É bom celebrar o sucesso, mas é mais importante escutar as lições do fracasso"};

        int numero = new Random().nextInt(frases.length); // Gera número aleatório de 0 a 10

        TextView texto = findViewById(R.id.textoResultado);
        texto.setText(frases[numero]);
    }
}
