package com.example.android.personas;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CrearPersonas extends AppCompatActivity {
    private EditText cedula,nombre,apellido;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_personas);
        cedula = (EditText)findViewById(R.id.txtCedula);
        nombre = (EditText)findViewById(R.id.txtNombre);
        resources = this.getResources();

    }

    public void guardar(View view){
     String ced,nomb,apell;
        ced = cedula.getText().toString();
        nomb = nombre.getText().toString();
        apell = apellido.getText().toString();
        Persona p = new Persona(ced,nomb,apell);
                p.guardar();
        Toast.makeText(this, resources.getString(R.string.mensaje_exitoso), Toast.LENGTH_SHORT).show();
    }
}
