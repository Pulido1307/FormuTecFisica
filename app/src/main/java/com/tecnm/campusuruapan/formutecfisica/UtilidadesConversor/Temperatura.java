package com.tecnm.campusuruapan.formutecfisica.UtilidadesConversor;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Temperatura extends Magnitud{
    @Override
    public String getConversion(String valorOriginal, String operacion) {
        BigDecimal opc;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(15);
        double aux = 0.0;

        switch (operacion){
            case "°C,°F":
                return ((Double.parseDouble(valorOriginal)*1.8)+32.0)+"";

            case "°C,K":
                return (Double.parseDouble(valorOriginal)+273.15)+"";

            case "°C,°K":
                return ((Double.parseDouble(valorOriginal)*1.8)+491.67)+"";

            case "°F,°C":
                return ((Double.parseDouble(valorOriginal)-32.0)*(5.0/9.0))+"";

            case "°F,K":
                double resta = (Double.parseDouble(valorOriginal)-32);
                double mul = resta*(5.0/9.0);
                return (mul + 273.15) + "";

            case "°F,°R":
                return (Double.parseDouble(valorOriginal)+459.67)+"";

            case "K,°C":
                return (Double.parseDouble(valorOriginal)-273.15)+"";

            case "K,°F":
                double resta_a = (Double.parseDouble(valorOriginal)-273.15);
                double mul_a = resta_a * (9.0/5.0);
                return (mul_a+32)+"";

            case "K,°R":
                return (Double.parseDouble(valorOriginal)*1.8)+"";

            case "°R,°C":
                return ((Double.parseDouble(valorOriginal)-491.67)*(5.0/9.0))+"";

            case "°R,°F":
                return (Double.parseDouble(valorOriginal)-459.67)+"";

            case "°R,K":
                return (Double.parseDouble(valorOriginal)*(5.0/9.0))+"";


        }

        if (operacion.equals("°C,°C") || operacion.equals("°F,°F") || operacion.equals("K,K") || operacion.equals("°R,°R")){
            return valorOriginal;
        }

        return (nf.format(aux));
    }
}
