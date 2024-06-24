package org.bansena.java;

import java.time.LocalDate;
import java.time.Period;

public class ReglaNegocio extends Habilitante {

	public ReglaNegocio(LocalDate fechaInicio, LocalDate fechaFin, double monto) {
		super(fechaInicio, fechaFin, monto);
	}

	@Override
	public double calcularValor() {
		Period periodo = getFechaFin().until(getFechaFin());
		int dias = periodo.getDays() + periodo.getMonths() * 30 + periodo.getYears() * 365;
		return dias * getMonto() * 0.05;// -> regla de negocio requisito
	}

	@Override
	public String toString() {
		return "ReglaNegocio []" + super.toString();
	}

}
