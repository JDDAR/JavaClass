package com.exepciones.java.portencia;

public class NegativoExeption extends Exception {

    private String mensaje;

    public NegativoExeption(String message, String mensaje) {
        super(message);
        this.mensaje = mensaje;
    }

}
