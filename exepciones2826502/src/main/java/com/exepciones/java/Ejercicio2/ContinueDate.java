package com.exepciones.java.Ejercicio2;

public class ContinueDate extends Exception {
    private String mensaje;

    public ContinueDate(String message, String mensaje) {
        super(message);
        this.mensaje = mensaje;
    }

}
