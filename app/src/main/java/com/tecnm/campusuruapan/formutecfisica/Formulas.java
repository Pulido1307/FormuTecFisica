package com.tecnm.campusuruapan.formutecfisica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnPageScrollListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

import java.io.File;
import java.util.Objects;

public class Formulas extends AppCompatActivity {

    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulas);
        pdfView = findViewById(R.id.pdfView);

        Intent intent = getIntent();
        String tema = Objects.requireNonNull(Objects.requireNonNull(intent.getExtras()).get("tema")).toString();
        String subtema = Objects.requireNonNull(Objects.requireNonNull(intent.getExtras()).get("subtema")).toString();
        Log.e("Valores ",tema +", "+subtema);

        setTitle(tema);

        String file = subtema+".pdf";
        Log.e("Valores ",file);
        pdfView.fromAsset(file)
                .pages(0,1,2)
                .scrollHandle(new DefaultScrollHandle(this))
                .enableSwipe(true)
                .spacing(0)
                .load();
    }
}