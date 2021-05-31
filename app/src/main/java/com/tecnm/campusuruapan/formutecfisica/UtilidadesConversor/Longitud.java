package com.tecnm.campusuruapan.formutecfisica.UtilidadesConversor;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Longitud extends Magnitud {
    @Override
    public String getConversion(String valorOriginal, String operacion) {
        BigDecimal opc;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(15);
        double aux = 0.0;

        switch (operacion){
            case "cm,m":
                aux = Double.parseDouble(valorOriginal) / 100.0;
                break;

            case "cm,in":
                aux = Double.parseDouble(valorOriginal) / 2.54;
                break;

            case "cm,ft":
                aux = Double.parseDouble(valorOriginal) / 30.48;
                break;

            case "cm,yd":
                aux = Double.parseDouble(valorOriginal) / 91.44;
                break;

            case "cm,mi":
                aux = Double.parseDouble(valorOriginal) / 160934.0;
                break;

            case "m,cm":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(100.0)).toPlainString());

            case "m,in":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(39.37)).toPlainString());

            case "m,ft":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(3.281)).toPlainString());


            case "m,yd":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1.094)).toPlainString());


            case "m,mi":
                aux = Double.parseDouble(valorOriginal) / 1609.0;
                break;

            case "in,cm":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(2.54)).toPlainString());

            case "in,m":
                aux = Double.parseDouble(valorOriginal) / 39.37;
                break;

            case "in,ft":
                aux = Double.parseDouble(valorOriginal) / 12.0;
                break;

            case "in,yd":
                aux = Double.parseDouble(valorOriginal) / 36.0;
                break;

            case "in,mi":
                aux = Double.parseDouble(valorOriginal) / 63360.0;
                break;

            case "ft,cm":
                aux = Double.parseDouble(valorOriginal) / 30.48;
                break;

            case "ft,m":
                aux = Double.parseDouble(valorOriginal) / 3.281;
                break;

            case "ft,yd":
                aux = Double.parseDouble(valorOriginal) / 3.0;
                break;

            case "ft,mi":
                aux = Double.parseDouble(valorOriginal) / 5280.0;
                break;

            case "yd,cm":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(91.44)).toPlainString());


            case "yd,m":
                aux = Double.parseDouble(valorOriginal) / 1.094;
                break;

            case "yd,in":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(36.0)).toPlainString());

            case "yd,ft":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(3.0)).toPlainString());

            case "yd,mi":
                aux = Double.parseDouble(valorOriginal) / 1760.0;
                break;


            case "mi,cm":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(160934.0)).toPlainString());

            case "mi,m":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1690.0)).toPlainString());

            case "mi,in":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(63360.0)).toPlainString());

            case "mi,ft":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(5280.0)).toPlainString());

            case "mi,yd":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1760.0)).toPlainString());
        }


        return (nf.format(aux));
    }
}
