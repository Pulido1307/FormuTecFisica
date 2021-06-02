package com.tecnm.campusuruapan.formutecfisica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.tecnm.campusuruapan.formutecfisica.Modelos.Constantes;
import com.tecnm.campusuruapan.formutecfisica.UtilidadesConversor.Densidad;
import com.tecnm.campusuruapan.formutecfisica.UtilidadesConversor.Energia;
import com.tecnm.campusuruapan.formutecfisica.UtilidadesConversor.Longitud;
import com.tecnm.campusuruapan.formutecfisica.UtilidadesConversor.Masa;
import com.tecnm.campusuruapan.formutecfisica.UtilidadesConversor.Potencia;
import com.tecnm.campusuruapan.formutecfisica.UtilidadesConversor.Presion;
import com.tecnm.campusuruapan.formutecfisica.UtilidadesConversor.Superficie;
import com.tecnm.campusuruapan.formutecfisica.UtilidadesConversor.Temperatura;
import com.tecnm.campusuruapan.formutecfisica.UtilidadesConversor.Tiempo;
import com.tecnm.campusuruapan.formutecfisica.UtilidadesConversor.Velocidad;
import com.tecnm.campusuruapan.formutecfisica.UtilidadesConversor.Volumen;

public class ConversorActivity extends AppCompatActivity implements View.OnClickListener {
    private MaterialButton button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_punto, button_backspace, button_igual, button_ac;
    private TextInputLayout textInputLayout_ValorOriginal, textInputLayout_ValorResultante, textInputLayout_UnidadMedidaO, textInputLayout_UnidadMedidaR, textInputLayout_Magnitud;
    ArrayAdapter<String> arrayAdapter_UnidadOriginal;
    ArrayAdapter<String> arrayAdapter_UnidadResultante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor);
        setTitle("Conversor de unidades");
        button_0 = findViewById(R.id.button_0);
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);
        button_punto = findViewById(R.id.button_punto);
        button_backspace = findViewById(R.id.button_backspace);
        button_igual = findViewById(R.id.button_igual);
        button_ac = findViewById(R.id.button_ac);



        button_0.setOnClickListener(this);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_punto.setOnClickListener(this);
        button_backspace.setOnClickListener(this);
        button_igual.setOnClickListener(this);
        button_ac.setOnClickListener(this);

        textInputLayout_ValorOriginal = findViewById(R.id.textInputLayout_ValorOriginal);
        textInputLayout_ValorResultante = findViewById(R.id.textInputLayout_ValorResultante);
        textInputLayout_UnidadMedidaO = findViewById(R.id.textInputLayout_UnidadMedidaO);
        textInputLayout_UnidadMedidaR = findViewById(R.id.textInputLayout_UnidadMedidaR);
        textInputLayout_Magnitud = findViewById(R.id.textInputLayout_Magnitud);


        ArrayAdapter<String> arrayAdapter_Magnitudes = new ArrayAdapter<>(this, R.layout.custom_spinner_item, Constantes.MAGNITUDES);
        ((AutoCompleteTextView) textInputLayout_Magnitud.getEditText()).setAdapter(arrayAdapter_Magnitudes);


        ((AutoCompleteTextView) textInputLayout_Magnitud.getEditText()).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (textInputLayout_Magnitud.getEditText().getText().toString().equals("Densidad")) {
                    arrayAdapter_UnidadOriginal = new ArrayAdapter<>(ConversorActivity.this, R.layout.custom_spinner_item, Constantes.DENSIDAD);
                    ((AutoCompleteTextView) textInputLayout_UnidadMedidaO.getEditText()).setAdapter(arrayAdapter_UnidadOriginal);

                    arrayAdapter_UnidadResultante = new ArrayAdapter<>(ConversorActivity.this, R.layout.custom_spinner_item, Constantes.DENSIDAD);
                    ((AutoCompleteTextView) textInputLayout_UnidadMedidaR.getEditText()).setAdapter(arrayAdapter_UnidadResultante);
                } else if (textInputLayout_Magnitud.getEditText().getText().toString().equals("Energía")) {
                    arrayAdapter_UnidadOriginal = new ArrayAdapter<>(ConversorActivity.this, R.layout.custom_spinner_item, Constantes.ENERGIA);
                    ((AutoCompleteTextView) textInputLayout_UnidadMedidaO.getEditText()).setAdapter(arrayAdapter_UnidadOriginal);

                    arrayAdapter_UnidadResultante = new ArrayAdapter<>(ConversorActivity.this, R.layout.custom_spinner_item, Constantes.ENERGIA);
                    ((AutoCompleteTextView) textInputLayout_UnidadMedidaR.getEditText()).setAdapter(arrayAdapter_UnidadResultante);
                } else if (textInputLayout_Magnitud.getEditText().getText().toString().equals("Longitud")) {
                    arrayAdapter_UnidadOriginal = new ArrayAdapter<>(ConversorActivity.this, R.layout.custom_spinner_item, Constantes.LONGITUD);
                    ((AutoCompleteTextView) textInputLayout_UnidadMedidaO.getEditText()).setAdapter(arrayAdapter_UnidadOriginal);

                    arrayAdapter_UnidadResultante = new ArrayAdapter<>(ConversorActivity.this, R.layout.custom_spinner_item, Constantes.LONGITUD);
                    ((AutoCompleteTextView) textInputLayout_UnidadMedidaR.getEditText()).setAdapter(arrayAdapter_UnidadResultante);
                } else if (textInputLayout_Magnitud.getEditText().getText().toString().equals("Masa")) {
                    arrayAdapter_UnidadOriginal = new ArrayAdapter<>(ConversorActivity.this, R.layout.custom_spinner_item, Constantes.MASA);
                    ((AutoCompleteTextView) textInputLayout_UnidadMedidaO.getEditText()).setAdapter(arrayAdapter_UnidadOriginal);

                    arrayAdapter_UnidadResultante = new ArrayAdapter<>(ConversorActivity.this, R.layout.custom_spinner_item, Constantes.MASA);
                    ((AutoCompleteTextView) textInputLayout_UnidadMedidaR.getEditText()).setAdapter(arrayAdapter_UnidadResultante);
                } else if (textInputLayout_Magnitud.getEditText().getText().toString().equals("Potencia")) {
                    arrayAdapter_UnidadOriginal = new ArrayAdapter<>(ConversorActivity.this, R.layout.custom_spinner_item, Constantes.POTENCIA);
                    ((AutoCompleteTextView) textInputLayout_UnidadMedidaO.getEditText()).setAdapter(arrayAdapter_UnidadOriginal);

                    arrayAdapter_UnidadResultante = new ArrayAdapter<>(ConversorActivity.this, R.layout.custom_spinner_item, Constantes.POTENCIA);
                    ((AutoCompleteTextView) textInputLayout_UnidadMedidaR.getEditText()).setAdapter(arrayAdapter_UnidadResultante);
                } else if (textInputLayout_Magnitud.getEditText().getText().toString().equals("Presión")) {
                    arrayAdapter_UnidadOriginal = new ArrayAdapter<>(ConversorActivity.this, R.layout.custom_spinner_item, Constantes.PRESION);
                    ((AutoCompleteTextView) textInputLayout_UnidadMedidaO.getEditText()).setAdapter(arrayAdapter_UnidadOriginal);

                    arrayAdapter_UnidadResultante = new ArrayAdapter<>(ConversorActivity.this, R.layout.custom_spinner_item, Constantes.PRESION);
                    ((AutoCompleteTextView) textInputLayout_UnidadMedidaR.getEditText()).setAdapter(arrayAdapter_UnidadResultante);
                } else if (textInputLayout_Magnitud.getEditText().getText().toString().equals("Superficie")) {
                    arrayAdapter_UnidadOriginal = new ArrayAdapter<>(ConversorActivity.this, R.layout.custom_spinner_item, Constantes.SUPERFICIE);
                    ((AutoCompleteTextView) textInputLayout_UnidadMedidaO.getEditText()).setAdapter(arrayAdapter_UnidadOriginal);

                    arrayAdapter_UnidadResultante = new ArrayAdapter<>(ConversorActivity.this, R.layout.custom_spinner_item, Constantes.SUPERFICIE);
                    ((AutoCompleteTextView) textInputLayout_UnidadMedidaR.getEditText()).setAdapter(arrayAdapter_UnidadResultante);
                } else if (textInputLayout_Magnitud.getEditText().getText().toString().equals("Temperatura")) {
                    arrayAdapter_UnidadOriginal = new ArrayAdapter<>(ConversorActivity.this, R.layout.custom_spinner_item, Constantes.TEMPERATURA);
                    ((AutoCompleteTextView) textInputLayout_UnidadMedidaO.getEditText()).setAdapter(arrayAdapter_UnidadOriginal);

                    arrayAdapter_UnidadResultante = new ArrayAdapter<>(ConversorActivity.this, R.layout.custom_spinner_item, Constantes.TEMPERATURA);
                    ((AutoCompleteTextView) textInputLayout_UnidadMedidaR.getEditText()).setAdapter(arrayAdapter_UnidadResultante);
                } else if (textInputLayout_Magnitud.getEditText().getText().toString().equals("Tiempo")) {
                    arrayAdapter_UnidadOriginal = new ArrayAdapter<>(ConversorActivity.this, R.layout.custom_spinner_item, Constantes.TIEMPO);
                    ((AutoCompleteTextView) textInputLayout_UnidadMedidaO.getEditText()).setAdapter(arrayAdapter_UnidadOriginal);

                    arrayAdapter_UnidadResultante = new ArrayAdapter<>(ConversorActivity.this, R.layout.custom_spinner_item, Constantes.TIEMPO);
                    ((AutoCompleteTextView) textInputLayout_UnidadMedidaR.getEditText()).setAdapter(arrayAdapter_UnidadResultante);
                } else if (textInputLayout_Magnitud.getEditText().getText().toString().equals("Velocidad")) {
                    arrayAdapter_UnidadOriginal = new ArrayAdapter<>(ConversorActivity.this, R.layout.custom_spinner_item, Constantes.VELOCIDAD);
                    ((AutoCompleteTextView) textInputLayout_UnidadMedidaO.getEditText()).setAdapter(arrayAdapter_UnidadOriginal);

                    arrayAdapter_UnidadResultante = new ArrayAdapter<>(ConversorActivity.this, R.layout.custom_spinner_item, Constantes.VELOCIDAD);
                    ((AutoCompleteTextView) textInputLayout_UnidadMedidaR.getEditText()).setAdapter(arrayAdapter_UnidadResultante);
                } else if (textInputLayout_Magnitud.getEditText().getText().toString().equals("Volumen")) {
                    arrayAdapter_UnidadOriginal = new ArrayAdapter<>(ConversorActivity.this, R.layout.custom_spinner_item, Constantes.VOLUMEN);
                    ((AutoCompleteTextView) textInputLayout_UnidadMedidaO.getEditText()).setAdapter(arrayAdapter_UnidadOriginal);

                    arrayAdapter_UnidadResultante = new ArrayAdapter<>(ConversorActivity.this, R.layout.custom_spinner_item, Constantes.VOLUMEN);
                    ((AutoCompleteTextView) textInputLayout_UnidadMedidaR.getEditText()).setAdapter(arrayAdapter_UnidadResultante);
                }

                arrayAdapter_UnidadOriginal.notifyDataSetChanged();
                arrayAdapter_UnidadResultante.notifyDataSetChanged();
                textInputLayout_UnidadMedidaR.getEditText().setText("");
                textInputLayout_UnidadMedidaO.getEditText().setText("");
                textInputLayout_ValorOriginal.getEditText().setText("");
                textInputLayout_ValorResultante.getEditText().setText("");

            }
        });
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_0:
                textInputLayout_ValorOriginal.getEditText().setText(textInputLayout_ValorOriginal.getEditText().getText() + "0");
                break;

            case R.id.button_1:
                textInputLayout_ValorOriginal.getEditText().setText(textInputLayout_ValorOriginal.getEditText().getText() + "1");
                break;

            case R.id.button_2:
                textInputLayout_ValorOriginal.getEditText().setText(textInputLayout_ValorOriginal.getEditText().getText() + "2");
                break;

            case R.id.button_3:
                textInputLayout_ValorOriginal.getEditText().setText(textInputLayout_ValorOriginal.getEditText().getText() + "3");
                break;

            case R.id.button_4:
                textInputLayout_ValorOriginal.getEditText().setText(textInputLayout_ValorOriginal.getEditText().getText() + "4");
                break;

            case R.id.button_5:
                textInputLayout_ValorOriginal.getEditText().setText(textInputLayout_ValorOriginal.getEditText().getText() + "5");
                break;

            case R.id.button_6:
                textInputLayout_ValorOriginal.getEditText().setText(textInputLayout_ValorOriginal.getEditText().getText() + "6");
                break;

            case R.id.button_7:
                textInputLayout_ValorOriginal.getEditText().setText(textInputLayout_ValorOriginal.getEditText().getText() + "7");
                break;

            case R.id.button_8:
                textInputLayout_ValorOriginal.getEditText().setText(textInputLayout_ValorOriginal.getEditText().getText() + "8");
                break;

            case R.id.button_9:
                textInputLayout_ValorOriginal.getEditText().setText(textInputLayout_ValorOriginal.getEditText().getText() + "9");
                break;

            case R.id.button_punto:
                String aux[] = textInputLayout_ValorOriginal.getEditText().getText().toString().split("\\.");

                if (aux.length == 1) {
                    if (textInputLayout_ValorOriginal.getEditText().getText().length() == 0) {
                        textInputLayout_ValorOriginal.getEditText().setText("0.");
                    } else if (!textInputLayout_ValorOriginal.getEditText().getText().toString().contains(".")) {
                        textInputLayout_ValorOriginal.getEditText().setText(textInputLayout_ValorOriginal.getEditText().getText() + ".");
                    }
                }

                break;

            case R.id.button_backspace:
                if (textInputLayout_ValorOriginal.getEditText().getText().length() == 1) {
                    textInputLayout_ValorOriginal.getEditText().setText("");
                } else if (textInputLayout_ValorOriginal.getEditText().getText().length() == 2) {
                    textInputLayout_ValorOriginal.getEditText().setText(textInputLayout_ValorOriginal.getEditText().getText().charAt(0) + "");
                } else if (textInputLayout_ValorOriginal.getEditText().getText().length() > 2) {
                    textInputLayout_ValorOriginal.getEditText().setText(textInputLayout_ValorOriginal.getEditText().getText().subSequence(0, textInputLayout_ValorOriginal.getEditText().getText().length() - 1));
                }
                break;

            case R.id.button_igual:
                textInputLayout_ValorOriginal.setError(null);
                textInputLayout_UnidadMedidaO.setError(null);
                textInputLayout_UnidadMedidaR.setError(null);
                if (!textInputLayout_ValorOriginal.getEditText().getText().toString().equals("")) {
                    llamarConversor();
                } else {
                    textInputLayout_ValorOriginal.setError("Campo Obligatorio");
                    textInputLayout_UnidadMedidaO.setError("Obligatorio");
                    textInputLayout_UnidadMedidaR.setError("Obligatorio");
                }
                break;

            case R.id.button_ac:
                textInputLayout_ValorOriginal.getEditText().setText("");
                textInputLayout_ValorResultante.getEditText().setText("");
                textInputLayout_UnidadMedidaR.getEditText().setText("");
                textInputLayout_UnidadMedidaO.getEditText().setText("");
                break;
        }
    }

    private void llamarConversor() {
        textInputLayout_UnidadMedidaR.setError(null);
        textInputLayout_UnidadMedidaO.setError(null);

        if (!textInputLayout_UnidadMedidaO.getEditText().getText().toString().equals("") && !textInputLayout_UnidadMedidaR.getEditText().getText().toString().equals("")) {
            String valor = textInputLayout_ValorOriginal.getEditText().getText().toString();
            String operacion = textInputLayout_UnidadMedidaO.getEditText().getText() + "," + textInputLayout_UnidadMedidaR.getEditText().getText();
            String resultante = "";

            switch (textInputLayout_Magnitud.getEditText().getText().toString()) {

                case "Densidad":
                    resultante = new Densidad().getConversion(valor, operacion);
                    break;

                case "Energía":
                    resultante = new Energia().getConversion(valor, operacion);
                    break;

                case "Longitud":
                    resultante = new Longitud().getConversion(valor, operacion);
                    break;

                case "Masa":
                    resultante = new Masa().getConversion(valor, operacion);
                    break;

                case "Potencia":
                    resultante = new Potencia().getConversion(valor, operacion);
                    break;

                case "Presión":
                    resultante = new Presion().getConversion(valor, operacion);
                    break;

                case "Superficie":
                    resultante = new Superficie().getConversion(valor, operacion);
                    break;

                case "Temperatura":
                    resultante = new Temperatura().getConversion(valor, operacion);
                    break;

                case "Tiempo":
                    resultante = new Tiempo().getConversion(valor, operacion);
                    break;

                case "Velocidad":
                    resultante = new Velocidad().getConversion(valor, operacion);
                    break;

                case "Volumen":
                    resultante = new Volumen().getConversion(valor, operacion);
                    break;
            }

            textInputLayout_ValorResultante.getEditText().setText(resultante + "");
            textInputLayout_ValorResultante.requestFocus();

        } else {
            textInputLayout_UnidadMedidaR.setError("Obligatorio");
            textInputLayout_UnidadMedidaO.setError("Obligatorio");
        }


    }
}