package com.tecnm.campusuruapan.formutecfisica.UtilidadesConversor;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Velocidad extends Magnitud{

    @Override
    public String getConversion(String valorOriginal, String operacion) {
        BigDecimal opc;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(15);
        double aux = 0.0;

        switch (operacion){
            case "m/s,km/h":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(3.6)).toPlainString());

            case "m/s,km/s":
                aux = Double.parseDouble(valorOriginal) / 1000.0;
                break;

            case "m/s,kn":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1.944)).toPlainString());

            case "m/s,mph":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(2.237)).toPlainString());

            case "km/h,m/s":
                aux = Double.parseDouble(valorOriginal) / 3.6;
                break;

            case "km/h,km/s":
                aux = Double.parseDouble(valorOriginal) / 3600.0;
                break;

            case "km/h,kn":
                aux = Double.parseDouble(valorOriginal) / 1.852;
                break;

            case "km/h,mph":
                aux = Double.parseDouble(valorOriginal) / 1.609;
                break;

            case "km/s,m/s":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1000.0)).toPlainString());

            case "km/s,km/h":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(3600.0)).toPlainString());

            case "km/s,kn":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1944.0)).toPlainString());

            case "km/s,mph":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(2237.0)).toPlainString());

            case "kn,m/s":
                aux = Double.parseDouble(valorOriginal) / 1.944;
                break;

            case "kn,km/h":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1.852)).toPlainString());

            case "kn,km/s":
                aux = Double.parseDouble(valorOriginal) / 1944.0;
                break;

            case "kn,mph":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1.151)).toPlainString());

            case "mph,m/s":
                aux = Double.parseDouble(valorOriginal) / 2.237;
                break;

            case "mph,km/h":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1.609)).toPlainString());

            case "mph,km/s":
                aux = Double.parseDouble(valorOriginal) / 2237.0;
                break;

            case "mph,kn":
                aux = Double.parseDouble(valorOriginal) / 1.151;
                break;

            default:
                return valorOriginal;
        }


        return (nf.format(aux));
    }
}
