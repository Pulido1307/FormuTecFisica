package com.tecnm.campusuruapan.formutecfisica.UtilidadesConversor;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Presion extends Magnitud{

    @Override
    public String getConversion(String valorOriginal, String operacion) {
        BigDecimal opc;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(15);
        double aux = 0.0;

        switch (operacion){
            case "dina/cm²,N/m²":
                aux = Double.parseDouble(valorOriginal) / 10.0;
                break;

            case "dina/cm²,atm":
                aux = Double.parseDouble(valorOriginal) / 1013000.0;
                break;

            case "dina/cm²,kg/cm²":
                aux = Double.parseDouble(valorOriginal) / 980665.0;
                break;

            case "dina/cm²,mm Hg":
                aux = Double.parseDouble(valorOriginal) / 1333.0;
                break;

            case "dina/cm²,in Hg":
                aux = Double.parseDouble(valorOriginal) / 33864.0;
                break;

            case "dina/cm²,lb/in²":
                aux = Double.parseDouble(valorOriginal) / 68948.0;
                break;

            case "N/m²,dina/cm²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(10.0)).toPlainString());

            case "N/m²,atm":
                aux = Double.parseDouble(valorOriginal) / 101325.0;
                break;

            case "N/m²,kg/cm²":
                aux = Double.parseDouble(valorOriginal) / 98067.0;
                break;

            case "N/m²,mm Hg":
                aux = Double.parseDouble(valorOriginal) / 133.0;
                break;

            case "N/m²,in Hg":
                aux = Double.parseDouble(valorOriginal) / 3386.0;
                break;

            case "N/m²,lb/in²":
                aux = Double.parseDouble(valorOriginal) / 6895.0;
                break;

            case "atm,dina/cm²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1013000.0)).toPlainString());

            case "atm,N/m²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(101325.0)).toPlainString());

            case "atm,kg/cm²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1.033)).toPlainString());

            case "atm,mm Hg":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(760.0)).toPlainString());

            case "atm,in Hg":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(29.921)).toPlainString());

            case "atm,lb/in²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(14.696)).toPlainString());

            case "kg/cm²,dina/cm²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(980665.0)).toPlainString());

            case "kg/cm²,N/m²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(98067.0)).toPlainString());

            case "kg/cm²,atm":
                aux = Double.parseDouble(valorOriginal) / 1.033;
                break;

            case "kg/cm²,mm Hg":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(736.0)).toPlainString());

            case "kg/cm²,in Hg":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(28.959)).toPlainString());

            case "kg/cm²,lb/in²":
            opc = new BigDecimal(valorOriginal);
            return (opc.multiply(BigDecimal.valueOf(14.223)).toPlainString());

            case "mm Hg,dina/cm²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1333.0)).toPlainString());

            case "mm Hg,N/m²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(133.0)).toPlainString());

            case "mm Hg,atm":
                aux = Double.parseDouble(valorOriginal) / 760.0;
                break;

            case "mm Hg,kg/cm²":
                aux = Double.parseDouble(valorOriginal) / 736.0;
                break;

            case "mm Hg,in Hg":
                aux = Double.parseDouble(valorOriginal) / 25.4;
                break;

            case "mm Hg,lb/in²":
                aux = Double.parseDouble(valorOriginal) / 51.715;
                break;

            case "in Hg,dina/cm²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(33864.0)).toPlainString());

            case "in Hg,N/m²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(3386.0)).toPlainString());

            case "in Hg,atm":
                aux = Double.parseDouble(valorOriginal) / 29.921;
                break;

            case "in Hg,kg/cm²":
                aux = Double.parseDouble(valorOriginal) / 28.959;
                break;

            case "in Hg,mm Hg":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(25.4)).toPlainString());

            case "in Hg,lb/in²":
                aux = Double.parseDouble(valorOriginal) / 2.036;
                break;

            case "lb/in²,dina/cm²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(68948.0)).toPlainString());

            case "lb/in²,N/m²":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(6895.0)).toPlainString());

            case "lb/in²,atm":
                aux = Double.parseDouble(valorOriginal) / 14.696;
                break;

            case "lb/in²,kg/cm²":
                aux = Double.parseDouble(valorOriginal) / 14.223;
                break;

            case "lb/in²,mm Hg":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(51.715)).toPlainString());

            case "lb/in²,in Hg":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(2.036)).toPlainString());

            default:
                return valorOriginal;
        }



        return (nf.format(aux));
    }
}
