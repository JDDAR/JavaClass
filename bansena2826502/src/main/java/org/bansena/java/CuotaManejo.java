package org.bansena.java;

import java.time.LocalDate;

public class CuotaManejo<E extends Habilitante> {
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private double monto;
	private E habilitante;

	public CuotaManejo(E habilitante) {
		this.habilitante = habilitante;
		this.fechaInicio = habilitante.getFechaInicio();
		this.fechaFin = habilitante.getFechaFin();
		this.monto = habilitante.calcularValor();
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public double getMonto() {
		return monto;
	}

	public E getHabilitante() {
		return habilitante;
	}

	@Override
	public String toString() {
		return "CuotaManejo [fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", monto=" + monto + "]";
	}

}
