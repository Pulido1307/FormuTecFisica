package com.tecnm.campusuruapan.formutecfisica.UtilidadesConversor;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Densidad extends Magnitud {

    @Override
    public String getConversion(String valorOriginal, String operacion) {
        BigDecimal opc;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(15);
        double aux = 0.0;

        switch (operacion){
            case "g/cm³,kg/m³":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1000.0)).toPlainString());

            case "g/cm³,lb/ft³":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(62.428)).toPlainString());

            case "g/cm³,lb/galón":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(8.345)).toPlainString());

            case "kg/m³,g/cm³":
                aux = Double.parseDouble(valorOriginal) / 1000.0;
                break;

            case "kg/m³,lb/ft³":
                aux = Double.parseDouble(valorOriginal) / 16.018;
                break;

            case "kg/m³,lb/galón":
                aux = Double.parseDouble(valorOriginal) / 120.0;
                break;

            case "lb/ft³,g/cm³":
                aux = Double.parseDouble(valorOriginal) / 62.428;
                break;

            case "lb/ft³,kg/m³":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(16.018)).toPlainString());

            case "lb/ft³,lb/galón":
                aux = Double.parseDouble(valorOriginal) / 7.481;
                break;

            case "lb/galón,g/cm³":
                aux = Double.parseDouble(valorOriginal) / 8.345;
                break;

            case "lb/galón,kg/m³":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(120.0)).toPlainString());

            case "lb/galón,lb/ft³":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(7.481)).toPlainString());
        }

        return (nf.format(aux));
    }
}
