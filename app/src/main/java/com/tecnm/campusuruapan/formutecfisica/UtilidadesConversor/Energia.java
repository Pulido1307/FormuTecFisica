package com.tecnm.campusuruapan.formutecfisica.UtilidadesConversor;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Energia extends Magnitud{
    @Override
    public String getConversion(String valorOriginal, String operacion) {
        BigDecimal opc;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(15);
        double aux = 0.0;

        switch (operacion){
            case "J,cal":
                aux = Double.parseDouble(valorOriginal) / 4.184;
                break;

            case "J,kcal":
                aux = Double.parseDouble(valorOriginal) / 4184.0;
                break;

            case "J,Btu":
                aux = Double.parseDouble(valorOriginal) / 1055.0;
                break;

            case "J,kw-hr":
                aux = Double.parseDouble(valorOriginal) / 3600000.0;
                break;

            case "cal,J":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(4.184)).toPlainString());

            case "cal,kcal":
                aux = Double.parseDouble(valorOriginal) / 1000.0;
                break;

            case "cal,Btu":
                aux = Double.parseDouble(valorOriginal) / 252.0;
                break;

            case "cal,kw-hr":
                aux = Double.parseDouble(valorOriginal) / 860421.0;
                break;

            case "kcal,J":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(4184.0)).toPlainString());

            case "kcal,cal":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1000.0)).toPlainString());

            case "kcal,Btu":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(3.966)).toPlainString());

            case "kcal,kw-hr":
                aux = Double.parseDouble(valorOriginal) / 860.0;
                break;

            case "Btu,J":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1055.0)).toPlainString());

            case "Btu,cal":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(252.0)).toPlainString());

            case "Btu,kcal":
                aux = Double.parseDouble(valorOriginal) / 3.966;
                break;

            case "Btu,kw-hr":
                aux = Double.parseDouble(valorOriginal) / 3412.0;
                break;

            case "kw-hr,J":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(3600000.0)).toPlainString());

            case "kw-hr,cal":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(860421.0)).toPlainString());

            case "kw-hr,kcal":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(860.0)).toPlainString());

            case "kw-hr,Btu":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(3412.0)).toPlainString());

            default:
                return valorOriginal;
        }


        return (nf.format(aux));
    }
}
