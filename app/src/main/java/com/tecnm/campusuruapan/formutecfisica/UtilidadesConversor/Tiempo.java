package com.tecnm.campusuruapan.formutecfisica.UtilidadesConversor;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class Tiempo extends Magnitud {

    @Override
    public String getConversion(String valorOriginal, String operacion) {
        BigDecimal opc;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(15);
        double aux = 0.0;
        switch (operacion){
            case "ms,s":
                aux = Double.parseDouble(valorOriginal) / 1000.0;
                break;

            case "ms,min":
                aux = Double.parseDouble(valorOriginal) / 60000.0;
                break;

            case "ms,h":
                aux = Double.parseDouble(valorOriginal) / 3600000.0;
                break;

            case "s,ms":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1000.0)).toPlainString());


            case "s,min":
                    aux = Double.parseDouble(valorOriginal) / 60.0;
                    break;

            case "s,h":
                aux = Double.parseDouble(valorOriginal) / 3600.0;
                break;

            case "min,ms":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(60000.0)).toPlainString());

            case "min,s":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(60.0)).toPlainString());

            case "min,h":
                aux = Double.parseDouble(valorOriginal) / 60.0;
                break;

            case "h,ms":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(3600000.0)).toPlainString());

            case "h,s":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(3600.0)).toPlainString());


            case "h,min":
                aux = Double.parseDouble(valorOriginal) * 60.0;
                break;

            default:
                return valorOriginal;
        }



        return (nf.format(aux));
    }

}
