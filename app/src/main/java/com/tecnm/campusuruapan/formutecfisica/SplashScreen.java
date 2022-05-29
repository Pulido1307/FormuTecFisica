package com.tecnm.campusuruapan.formutecfisica;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Layout;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class SplashScreen extends AppCompatActivity {
    private ImageView imageView_splash_Screen;
    private ImageView imageView_splash_screen2;
    private ImageView imageView_splash_screen3;
    private ConstraintLayout constraintLayout;
    private TextView textView_datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Objects.requireNonNull(getSupportActionBar()).hide();
        imageView_splash_Screen = findViewById(R.id.imageView_splash_screen);
        imageView_splash_screen2 = findViewById(R.id.imageView_splash_screen2);
        imageView_splash_screen3 = findViewById(R.id.imageView_splash_screen3);
        textView_datos = findViewById(R.id.textView_datos);
        constraintLayout = findViewById(R.id.activity);

        setInfo();

       new Handler().postDelayed(() ->{
            try {
                imageView_splash_Screen.setImageResource(R.drawable.formutecfis);
                textView_datos.setVisibility(View.INVISIBLE);
                imageView_splash_screen2.setVisibility(View.INVISIBLE);
                imageView_splash_screen3.setVisibility(View.INVISIBLE);
                constraintLayout.setBackground(getDrawable(R.drawable.bg_formutec));
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
                finish();
            }catch (Exception ignored){}
        }, 3500);
    }
    
    @SuppressLint("WrongConstant")
    private void setInfo(){
        String titulo = "FormuTec Física";
        String texto = " es una app desarrollada por alumnos y docentes de la carrera de Ingeniería en Sistemas Computacionales y el departamento " +
                "Ciencias Básicas del Instituto Tecnológico Superior de Uruapan.";
        textView_datos.setText(titulo +texto, TextView.BufferType.SPANNABLE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            textView_datos.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);
        }
        Spannable s = (Spannable)textView_datos.getText();
        int start = titulo.length();
        s.setSpan(new ForegroundColorSpan(0xFF16318A), 0, start, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
    }


}