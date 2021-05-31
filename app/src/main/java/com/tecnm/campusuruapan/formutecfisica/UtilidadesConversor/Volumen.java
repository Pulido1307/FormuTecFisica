package com.tecnm.campusuruapan.formutecfisica.UtilidadesConversor;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Volumen extends Magnitud {
    @Override
    public String getConversion(String valorOriginal, String operacion) {
        BigDecimal opc;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(15);
        double aux = 0.0;
            if(operacion.equals("cm³,m³") ){
                aux = Double.parseDouble(valorOriginal) / 1000000.0;
            } else if(operacion.equals("cm³,l") ){
                aux = Double.parseDouble(valorOriginal) / 1000.0;
            } else if(operacion.equals("cm³,in³")) {
                aux = Double.parseDouble(valorOriginal) / 16.387;
            } else if (operacion.equals("cm³,ft³")){
                aux = Double.parseDouble(valorOriginal) / 28317.0;
            } else if (operacion.equals("cm³,gal")) {
                aux = Double.parseDouble(valorOriginal) / 3785.0;
            } else if (operacion.equals("m³,cm³")) {
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1000000.0)).toPlainString());
            } else if (operacion.equals("m³,l")) {
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1000.0)).toPlainString());
            } else if( operacion.equals( "m³,in³")) {
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(61024.0)).toPlainString());
            } else if (operacion.equals( "m³,ft³")) {
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(35.315)).toPlainString());
            } else if (operacion.equals("m³,gal")) {
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(264.173)).toPlainString());
            } else if (operacion.equals("l,cm³")) {
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1000.0)).toPlainString());
            } else if (operacion.equals("l,m³")){
                aux = Double.parseDouble(valorOriginal) / 1000.0;
            } else if (operacion.equals("l,in³")){
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(61.024)).toPlainString());
            } else if(operacion.equals("l,ft³")){
                aux = Double.parseDouble(valorOriginal) / 28.317;
            } else if(operacion.equals("l,gal")){
                aux = Double.parseDouble(valorOriginal) / 3.785;
            } else if(operacion.equals("cm³,cm³") || operacion.equals("m³,m³") || operacion.equals("l,l") || operacion.equals("in³,in³") || operacion.equals("ft³,ft³")
                    || operacion.equals("gal,gal")){
                return valorOriginal;
            }


        return (nf.format(aux));
    }
}
