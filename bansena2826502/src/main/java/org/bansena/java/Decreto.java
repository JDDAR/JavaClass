package org.bansena.java;

import java.time.LocalDate;

public class Decreto extends Habilitante {

	public Decreto(LocalDate fechaInicio, LocalDate fechaFin, double monto) {
		super(fechaInicio, fechaFin, monto);
	}

	@Override
	public double calcularValor() {
		return 1000.0;
	}

	@Override
	public String toString() {
		return "Decreto []" + super.toString();
	}

}
