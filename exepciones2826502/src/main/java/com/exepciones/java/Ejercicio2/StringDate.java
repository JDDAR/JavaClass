package com.exepciones.java.Ejercicio2;

public class StringDate extends Exception {
	private String mensaje;

	public StringDate(String arg0, String mensaje) {
		super(arg0);
		this.mensaje = mensaje;
	}

}
