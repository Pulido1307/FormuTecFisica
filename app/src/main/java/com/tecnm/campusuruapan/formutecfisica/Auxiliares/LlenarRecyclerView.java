package com.tecnm.campusuruapan.formutecfisica.Auxiliares;

import com.tecnm.campusuruapan.formutecfisica.Modelos.Tema;
import com.tecnm.campusuruapan.formutecfisica.R;

import java.util.ArrayList;
import java.util.List;

public class LlenarRecyclerView {
    private List<Tema> listaTemas = new ArrayList<>();

    public List<Tema> getListaTemas()
    {
        listaTemas.add(new Tema(R.drawable.cinematica,R.string.Cinemática, Subtemas.algebra));

        return  listaTemas;
    }
}
