package com.tecnm.campusuruapan.formutecfisica.Modelos;

import java.util.List;

public class Tema {
    private int imagen;
    private int tema;
    private List<String> subtemas;
    private boolean expandido;

    public Tema(int imagen, int tema, List<String> subtemas) {
        this.imagen = imagen;
        this.tema = tema;
        this.subtemas = subtemas;
        this.expandido = false;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getTema() {
        return tema;
    }

    public void setTema(int tema) {
        this.tema = tema;
    }

    public List<String> getSubtemas() {
        return subtemas;
    }

    public void setSubtemas(List<String> subtemas) {
        this.subtemas = subtemas;
    }

    public boolean isExpandido() {
        return expandido;
    }

    public void setExpandido(boolean expandido) {
        this.expandido = expandido;
    }
}
