package com.tecnm.campusuruapan.formutecfisica.UtilidadesConversor;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Superficie extends Magnitud {
    @Override
    public String getConversion(String valorOriginal, String operacion) {
        BigDecimal opc;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(15);
        double aux = 0.0;

        switch (operacion){
            case "cm²,m²":
                aux = Double.parseDouble(valorOriginal) / 10000.0;
                break;

            case "cm²,in²":
                aux = Double.parseDouble(valorOriginal) / 6.452;
                break;

            case "cm²,ft²":
                aux = Double.parseDouble(valorOriginal) / 929.0;
                break;

            case "cm²,yd²":
                aux = Double.parseDouble(valorOriginal) / 8361.0;

            case "cm²,mi²":
                aux = Double.parseDouble(valorOriginal) / 25900000000.0;
                break;

            case "m²,cm²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(10000.0)).toPlainString());

            case "m²,in²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1550.0)).toPlainString());

            case "m²,ft²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(10.764)).toPlainString());

            case "m²,yd²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1.196)).toPlainString());

            case "m²,mi²":
                aux = Double.parseDouble(valorOriginal) / 2590000.0;
                break;

            case "in²,cm²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(6.452)).toPlainString());

            case "in²,m²":
                aux = Double.parseDouble(valorOriginal) / 1550.0;
                break;

            case "in²,ft²":
                aux = Double.parseDouble(valorOriginal) / 144.0;
                break;

            case "in²,yd²":
                aux = Double.parseDouble(valorOriginal) / 1296.0;
                break;

            case "in²,mi²":
                aux = Double.parseDouble(valorOriginal) / 4014000000.0;
                break;

            case "ft²,cm²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(929.0)).toPlainString());

            case "ft²,m²":
                aux = Double.parseDouble(valorOriginal) / 10.764;
                break;

            case "ft²,in²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(144.0)).toPlainString());

            case "ft²,yd²":
                aux = Double.parseDouble(valorOriginal) / 9.0;
                break;

            case "ft²,mi²":
                aux = Double.parseDouble(valorOriginal) / 27880000.0;
                break;

            case "mi²,cm²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(25900000000.0)).toPlainString());

            case "mi²,m²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(2590000.0)).toPlainString());

            case "mi²,in²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(4014000000.0)).toPlainString());

            case "mi²,ft²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(27880000.0)).toPlainString());

            case "mi²,yd²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(3098000.0)).toPlainString());

        }


        return (nf.format(aux));
    }
}
