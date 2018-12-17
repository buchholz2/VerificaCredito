package com.br.verificacredito;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

public class LaunchActivity extends AppCompatActivity {

    ImageView logo;
    TextView nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.ivLogo);
        nome = findViewById(R.id.tvNome);

        //logo.setBackgroundResource(R.drawable.Animation);

        //AnimationDrawable animation = (AnimationDrawable) logo.getBackground();
        //animation.start();
        Animation deslocamentoN = new TranslateAnimation(0, 0, -100, 100);
        Animation deslocamento = new TranslateAnimation(0, 0, 0, -100);
        deslocamento.setDuration(5000);
        deslocamentoN.setDuration(5000);
        deslocamentoN.setFillAfter(true);
        deslocamento.setFillAfter(true);

        logo.setAnimation(deslocamento);
        nome.setAnimation(deslocamentoN);

        deslocamento.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                mostrarLogin();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

//        logo.startAnimation(deslocamento);
//        logo.setVisibility(View.INVISIBLE);
//        nome.startAnimation(deslocamentoN);
//        nome.setVisibility(View.INVISIBLE);
//
//        Handler handle = new Handler();
//        handle.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                mostrarLogin();
//            }
//        }, 5000);
    }

    private void mostrarLogin() {
        finish();
        Intent intent = new Intent(LaunchActivity.this, Activity_Login.class);
        startActivity(intent);
    }
}
