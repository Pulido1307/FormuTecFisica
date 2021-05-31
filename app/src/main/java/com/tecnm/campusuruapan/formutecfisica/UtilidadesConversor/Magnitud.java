package com.tecnm.campusuruapan.formutecfisica.UtilidadesConversor;

public abstract class Magnitud {
    private double valorOriginal;
    private double valorResultante;
    private String unidadOriginal;
    private String unidadResultante;

    public Magnitud(){}

    public abstract String getConversion(String valorOriginal, String operacion);
}
