package com.exepciones.java.Ejercicio2;

public class IntDate extends Exception {
	private String mensaje;

	public IntDate(String arg0, String mensaje) {
		super(arg0);
		this.mensaje = mensaje;
	}

}
