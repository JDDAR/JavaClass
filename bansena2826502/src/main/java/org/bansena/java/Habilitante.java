package org.bansena.java;

import java.time.LocalDate;

/*  
 * 
 *  Un Habilitante no es más que una clase abstracta, la cual tiene los siguientes  atributos:
     	 • Fecha de inicio
			 • Fecha de fin
			 • Monto: el cual es el valor inicial a partir de cual se calculará el valor para la cuota de manejo.
	*  Todo habilitante debe tener un método para calcular el valor de la cuota de manejo retorna un double y no tiene parametros 
 */

public abstract class Habilitante {
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private double monto;

	// Voy a crear el constructor
	public Habilitante(LocalDate fechaInicio, LocalDate fechaFin, double monto) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.monto = monto;
	}

	// creo GETs y SETTERs
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public double getMonto() {
		return monto;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	// Voy a crear el Metodo
	public abstract double calcularValor();

	@Override // -> sobre escritura de metodos
	public String toString() {
		return "Habilitante [fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", monto=" + monto + "]";
	}

}
