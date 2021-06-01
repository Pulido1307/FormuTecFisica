package com.tecnm.campusuruapan.formutecfisica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.RadioButton;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;
import com.tecnm.campusuruapan.formutecfisica.Auxiliares.EnviarEmail;
import com.tecnm.campusuruapan.formutecfisica.R;

import java.util.Properties;
import java.util.regex.Pattern;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class ComplaintSuggestionsActivity extends AppCompatActivity {

    private String EXREGEMAIL="([a-z,0-9]+((\\.|_|-)[a-z0-9]+)*)@([a-z,0-9]+(\\.[a-z0-9]+)*)\\.([a-z]{2,})(\\.([a-z]{2}))?";
    private TextInputLayout editText_Nombre,editText_Email,editText_Mensaje;
    private RadioButton radioButton_Queja,radioButton_Sugerencia;
    private MaterialButton button_Enviar;
    private String nombre, email, mensaje;
    boolean tipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint_suggestions);
        setTitle(R.string.quejas_y_sugerencias);
        editText_Email = findViewById(R.id.editText_Email);
        editText_Mensaje = findViewById(R.id.editText_Mensaje);
        editText_Nombre = findViewById(R.id.editText_Nombre);
        radioButton_Queja = findViewById(R.id.radioButton_Queja);
        radioButton_Sugerencia = findViewById(R.id.radioButton_Sugerencia);
        textWachers();
        button_Enviar = findViewById(R.id.button_Enviar);
        button_Enviar.setOnClickListener(view ->
        {
            nombre = editText_Nombre.getEditText().getText().toString();
            email = editText_Email.getEditText().getText().toString();
            mensaje = editText_Mensaje.getEditText().getText().toString();
            tipo=evaluarEmailPattern(email);
            if(tipo)
            {
                if (!nombre.equals("")  && !mensaje.equals(""))
                {
                    if (radioButton_Sugerencia.isChecked() || radioButton_Queja.isChecked())
                    {
                        tipo = radioButton_Queja.isChecked();
                        sendEmailWithGmail(email, mensaje, nombre, tipo);
                        cleanCasillas();
                    }
                    else {
                        Snackbar.make(view, "Tiene que seleccionar queja o sugerencia", Snackbar.LENGTH_SHORT).show();
                    }
                }
                else {
                    Snackbar.make(view, "Nombre o mensaje están vacíos", Snackbar.LENGTH_SHORT).show();
                }
            }
            else
            {
                Snackbar.make(view, "El email introducido no es una dirección valida", Snackbar.LENGTH_SHORT).show();
            }
        });

    }
    private void sendEmailWithGmail(String to, String message,String nombre, boolean tipo) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("", "");
            }
        });

        /*EnviarEmail enviarEmail = new EnviarEmail(session,StaticsMenus.EMAILSENDER,to,message,ComplaintSuggestionsActivity.this,nombre,tipo);
        enviarEmail.execute();*/
    }
    public boolean evaluarEmailPattern(String email)
    {
        return Pattern.matches(EXREGEMAIL,email);
    }
    @Deprecated
    private boolean evaluarEmail(String email)
    {
        String[] vectorEmail = email.split("@");
        boolean bandera;
        if(vectorEmail.length==2)
        {
            if(vectorEmail[1].equals("gmail.com"))
            {
                bandera=true;
                Log.e("1","1"+bandera);
            }
            else
            {
                bandera=false;
                Log.e("1","2"+bandera);
            }
        }
        else
        {
            bandera=false;
            Log.e("1","3"+bandera);
        }
        return bandera;

    }
    private  void cleanCasillas()
    {
        editText_Nombre.getEditText().setText("");
        editText_Email.getEditText().setText("");
        editText_Mensaje.getEditText().setText("");
        editText_Mensaje.setError(null);
        editText_Email.setError(null);
        editText_Nombre.setError(null);
        radioButton_Queja.setChecked(false);
        radioButton_Sugerencia.setChecked(false);
    }
    private void textWachers()
    {
        editText_Email.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!evaluarEmailPattern(charSequence.toString()))
                {
                    editText_Email.setError("Eso no es un email");
                }
                else
                {
                    editText_Email.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        editText_Nombre.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(editText_Nombre.getEditText().getText().length()==0)
                {
                    editText_Nombre.setError("Campo vacío");
                }
                else
                {
                    editText_Nombre.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        editText_Mensaje.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(editText_Mensaje.getEditText().getText().length()==0)
                {
                    editText_Mensaje.setError("Campo vacío");
                }
                else
                {
                    editText_Mensaje.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
}