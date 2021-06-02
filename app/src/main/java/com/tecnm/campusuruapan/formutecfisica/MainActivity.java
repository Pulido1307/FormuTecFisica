package com.tecnm.campusuruapan.formutecfisica;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.tecnm.campusuruapan.formutecfisica.Adaptadores.AdaptadorTema;
import com.tecnm.campusuruapan.formutecfisica.Auxiliares.LlenarRecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView_Temas;
    private FloatingActionButton floatingActionButton_Conversor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView_Temas = findViewById(R.id.recyclerView_TemasFisica);
        floatingActionButton_Conversor = findViewById(R.id.floatingActionButton_Conversor);
        initRecyclerView();

        floatingActionButton_Conversor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ConversorActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initRecyclerView() {
        LlenarRecyclerView llenarRecyclerView = new LlenarRecyclerView();

        //Se utiliza esta linea por que sabe que el contenido no cambia en el recyclerView
        recyclerView_Temas.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView_Temas.setLayoutManager(layoutManager);

        RecyclerView.Adapter adapter = new AdaptadorTema(llenarRecyclerView.getListaTemas());
        recyclerView_Temas.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.opc, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.item_about:
                Toast.makeText(MainActivity.this, "Acerca de...", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
                break;

            case R.id.item_quejas_sugerencias:
                Toast.makeText(MainActivity.this, "Quejas y sugerencias...", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this, ComplaintSuggestionsActivity.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}