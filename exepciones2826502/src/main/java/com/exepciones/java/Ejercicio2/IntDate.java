package com.exepciones.java.Ejercicio2;

public class IntDate extends Exception {
	private String mensaje;

	public IntDate(String message, String mensaje) {
		super(message);
		this.mensaje = mensaje;
	}

	

	
}
