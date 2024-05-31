package com.exepciones.java.Ejercicio;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString // este lo pongo para mosttrar informacion del objeto
public class Medico {
    private String nombre;
    private String apellido;
    private int identificacion;

    public Medico() {
    }

    public Medico(String nombre, String apellido, int identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
    }

}
