package com.tecnm.campusuruapan.formutecfisica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.github.barteksc.pdfviewer.PDFView;

import java.util.Objects;

public class Formulas extends AppCompatActivity {

    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String tema = Objects.requireNonNull(Objects.requireNonNull(intent.getExtras()).get("tema")).toString();
        String subtema = Objects.requireNonNull(Objects.requireNonNull(intent.getExtras()).get("subtema")).toString();
        Log.e("Valores ",tema +", "+subtema);

        pdfView = findViewById(R.id.pdfView);
        setContentView(R.layout.activity_formulas);
        setTitle(tema);

        String file = subtema+".pdf";
        Log.e("Valores ",file);
        pdfView.fromAsset(file)
                .enableSwipe(true) // allows to block changing pages using swipe
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .defaultPage(0)
                .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
                .enableAntialiasing(true) // improve rendering a little bit on low-res screens
                // spacing between pages in dp. To define spacing color, set view background
                .spacing(0)
                .load();

    }
}