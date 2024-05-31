package com.exepciones.java.Ejercicio2;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Vendedor {
	private Integer id;
	private String nombre;
	private String apellido;
	private Integer numeroContacto;

	public Vendedor() {
	}

	public Vendedor(Integer id, String nombre, String apellido, Integer numeroContacto) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroContacto = numeroContacto;
	}
}
