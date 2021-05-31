package com.tecnm.campusuruapan.formutecfisica.UtilidadesConversor;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Potencia extends Magnitud {
    @Override
    public String getConversion(String valorOriginal, String operacion) {
        BigDecimal opc;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(15);
        double aux = 0.0;

        switch (operacion){
            case "kcal/s,Btu/hr":
                opc = new BigDecimal(valorOriginal);
                return (opc.multiply(BigDecimal.valueOf(14276.0)).toPlainString());

            case "Btu/hr,kcal/s":
                aux = Double.parseDouble(valorOriginal) / 14276.0;
                break;

        }

        if(operacion.equals("kcal/s,kcal/s") || operacion.equals("Btu/hr,Btu/hr")){
            return valorOriginal;
        }

        return (nf.format(aux));
    }
}
