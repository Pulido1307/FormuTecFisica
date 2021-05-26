package com.tecnm.campusuruapan.formutecfisica;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.opc,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;
        switch (item.getItemId()){
            case R.id.item_about:
                Toast.makeText(MainActivity.this, "Acerca de...", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this, ConversorActivity.class);
                startActivity(intent);
                break;

            case R.id.item_quejas_sugerencias:
                /*Toast.makeText(MainActivity.this, "Quejas y sugerencias...", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this, ComplaintSuggestionsActivity.class);
                startActivity(intent);*/
                intent = new Intent(MainActivity.this, Formulas.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}