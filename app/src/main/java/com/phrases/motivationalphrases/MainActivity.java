package com.phrases.motivationalphrases;

import  androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView frases;
    private Button gerarFrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //pegando o id da textViw e do button
        frases = findViewById(R.id.frases);
        gerarFrases = findViewById(R.id.gerarFrases);

        //evento de click no button
        gerarFrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] frasesMotivacionais =
                        {
                                "A função da liderança é produzir mais líderes, não seguidores!\n" + "\n" + " - Ralph Nader",
                                "[Em arte] o impossível verosímil é preferível ao possível não acreditável.\n" + "\n" + " - Aristóteles",
                                "Se você não esta disposto a arriscar o habitual, você terá que se contentar com o normal!\n" + "\n" + " - Jim Rohn",
                                "Desenvolver o sucesso a partir de suas falhas. O desânimo e fracasso são dois dos degraus mais seguro para o sucesso!\n" + "\n" + " - Dale Carnegie",
                                "Lute com determinação, abrace a vida com paixão, perca com classe e vença com ousadia, porque o mundo pertence a quem se atreve e a vida é muito para ser insignificante!\n" + "\n" +" - Augusto Branco",
                                "Só é possível ensinar uma criança a amar, amando-a!\n" + "\n" +" - Johann Goethe",
                                "A impaciência é um grande obstáculo para o bom êxito.\n" + "\n" + " - Napoleão Bonaparte",
                                "Eu descobri que quanto mais eu trabalho, mais sorte eu pareço ter\n" + "\n" + " - Thomas Jefferson",
                                "O êxito da vida não se mede pelo caminho que você conquistou, mas sim pelas dificuldades que superou no caminho.\n" + "\n" + " - Abraham Lincoln",
                                "Se você quer alcançar a grandeza, pare de pedir permissão.\n" + "\n" + " - Anonymous",
                                "Suba o primeiro degrau com fé. Não é necessário que você veja toda a escada. Apenas dê o primeiro passo.\n" + "\n" + " - Martin Luther King",
                                "Todo progresso ocorre fora da zona de conforto.\n" + "\n" + " - Michael John Bobak"
                        };

                //instanciando a class Random
                Random random = new Random();

                int numerosAleatorios = random.nextInt(frasesMotivacionais.length);
                frases.setText(frasesMotivacionais[numerosAleatorios]);
            }
        });
    }
}