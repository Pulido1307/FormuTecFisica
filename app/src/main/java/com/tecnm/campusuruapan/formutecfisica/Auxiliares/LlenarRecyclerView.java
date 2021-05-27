package com.tecnm.campusuruapan.formutecfisica.Auxiliares;

import com.tecnm.campusuruapan.formutecfisica.Modelos.Tema;
import com.tecnm.campusuruapan.formutecfisica.R;

import java.util.ArrayList;
import java.util.List;

public class LlenarRecyclerView {
    private List<Tema> listaTemas = new ArrayList<>();

    public List<Tema> getListaTemas()
    {
        listaTemas.add(new Tema(R.drawable.cinematica,R.string.Cinematica, Subtemas.cinematica));
        listaTemas.add(new Tema(R.drawable.constantes2,R.string.Constantes, Subtemas.constantes));
        listaTemas.add(new Tema(R.drawable.dinamica,R.string.Dinamica, Subtemas.dinamica));
        listaTemas.add(new Tema(R.drawable.electricidad,R.string.Electricidad, Subtemas.electricidad));
        listaTemas.add(new Tema(R.drawable.electromagnetismo,R.string.Electromagnetismo, Subtemas.electromagnetismo));
        listaTemas.add(new Tema(R.drawable.equivalencias,R.string.Equivalencias, Subtemas.equivalencias));
        listaTemas.add(new Tema(R.drawable.estatica,R.string.Estatica, Subtemas.estatica));
        listaTemas.add(new Tema(R.drawable.hidrodinamica,R.string.Hidrodinamica, Subtemas.hidrodinamica));
        listaTemas.add(new Tema(R.drawable.hidrodinamica,R.string.Hidrostatica, Subtemas.hidrostatica));
        listaTemas.add(new Tema(R.drawable.optica,R.string.Optica, Subtemas.optica));
        listaTemas.add(new Tema(R.drawable.termodinamica,R.string.Termodinamica, Subtemas.termodinamica));
        listaTemas.add(new Tema(R.drawable.vectores,R.string.Vectores, Subtemas.vectores));
        return  listaTemas;
    }
}
