package com.tecnm.campusuruapan.formutecfisica.UtilidadesConversor;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Masa extends Magnitud {
    @Override
    public String getConversion(String valorOriginal, String operacion) {
        BigDecimal opc;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(15);
        double aux = 0.0;

            if(operacion.equals("g,kg")){
                aux = Double.parseDouble(valorOriginal) / 1000.0;
            } else if(operacion.equals("g,oz")) {
                aux = Double.parseDouble(valorOriginal) / 28.35;
            } else if(operacion.equals("g,lb")){
                aux = Double.parseDouble(valorOriginal) / 454.0;
            }else if (operacion.equals("g,tc")){
                aux = Double.parseDouble(valorOriginal) / 907185.0;
            }else if (operacion.equals("g,t")) {
                aux = Double.parseDouble(valorOriginal) / 1000000.0;
            }else if(operacion.equals("kg,g")) {
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1000.0)).toPlainString());
            }else if(operacion.equals("kg,oz")) {
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(35.274)).toPlainString());
            }else if (operacion.equals("kg,lb")) {
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(2.205)).toPlainString());
            }else if(operacion.equals("kg,tc")){
                aux = Double.parseDouble(valorOriginal) / 907.0;
            }else if(operacion.equals("kg,t")){
                aux = Double.parseDouble(valorOriginal) / 1000.0;
            } else if (operacion.equals("oz,g")){
                aux = Double.parseDouble(valorOriginal) / 28.35;
            } else if(operacion.equals("oz,kg")){
                aux = Double.parseDouble(valorOriginal) / 35.274;
            } else if(operacion.equals("oz,lb")){
                aux = Double.parseDouble(valorOriginal) / 16.0;
            } else if(operacion.equals("oz,tc")){
                aux = Double.parseDouble(valorOriginal) / 32000.0;
            } else if(operacion.equals("oz,t")){
                aux = Double.parseDouble(valorOriginal) / 35274.0;
            } else  if(operacion.equals("lb,g")){
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(454.0)).toPlainString());
            } else if(operacion.equals("lb,kg")){
                aux = Double.parseDouble(valorOriginal) / 2.205;
            } else if(operacion.equals("lb,oz")){
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(16.0)).toPlainString());
            } else if(operacion.equals("lb,tc")){
                aux = Double.parseDouble(valorOriginal) / 2000.0;
            } else if(operacion.equals("lb,t")){
                aux = Double.parseDouble(valorOriginal) / 2205.0;
            } else if(operacion.equals("tc,g")){
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(907185.0)).toPlainString());
            }else if(operacion.equals("tc,kg")){
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(907.185)).toPlainString());
            } else if(operacion.equals("tc,oz")){
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(32000.0)).toPlainString());
            } else if(operacion.equals("tc,lb")){
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(2000.0)).toPlainString());
            } else if(operacion.equals("tc,t")){
                aux = Double.parseDouble(valorOriginal) / 1.102;
            } else if(operacion.equals("t,g")){
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1000000.0)).toPlainString());
            } else if(operacion.equals("t,kg")){
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1000)).toPlainString());
            } else if(operacion.equals("t,oz")){
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(35274.0)).toPlainString());
            } else if (operacion.equals("t,lb")){
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(2205.0)).toPlainString());
            } else if(operacion.equals("t,tc")){
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(1.102)).toPlainString());
            }

        return (nf.format(aux));
    }
}
