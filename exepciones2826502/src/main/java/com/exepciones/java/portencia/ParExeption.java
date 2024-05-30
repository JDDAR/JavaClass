package com.exepciones.java.portencia;

public class ParExeption extends Exception {

    private String mensaje;

    public ParExeption(String message, String mensaje) {
        super(message);
        this.mensaje = mensaje;
    }
    
}
