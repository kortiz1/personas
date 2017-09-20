package com.example.android.personas;

import java.util.ArrayList;

/**
 * Created by Android on 19/09/2017.
 */

public class Datos {

    private static ArrayList<Persona> personas= new ArrayList<>();

    public static void guardar(Persona p) {
        personas.add(p);
    }

    public static ArrayList<Persona> obetener(){
        return personas;
    }

}
