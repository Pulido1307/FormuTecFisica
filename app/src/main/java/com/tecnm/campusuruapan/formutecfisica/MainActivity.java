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

import com.tecnm.campusuruapan.formutecfisica.controllers.ComplaintSuggestionsActivity;

public class MainActivity extends AppCompatActivity {

    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.opc, menu);
        MenuItem menuItem = menu.findItem(R.id.item_buscar);
        searchView = (SearchView) MenuItemCompat.getActionView(menuItem);
        searchView.setQueryHint(getResources().getString(R.string.buscar));
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.item_about:
                Toast.makeText(MainActivity.this, "Acerca de...", Toast.LENGTH_SHORT).show();
                break;

            case R.id.item_quejas_sugerencias:
                Toast.makeText(MainActivity.this, "Quejas y sugerencias...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ComplaintSuggestionsActivity.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}