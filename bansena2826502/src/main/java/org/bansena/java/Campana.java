package org.bansena.java;

import java.time.LocalDate;
import java.time.Period;// Un Period representa una cantidad de tiempo en términos de años, meses y días.

public class Campana extends Habilitante {

	public Campana(LocalDate fechaInicio, LocalDate fechaFin, double monto) { // Estos atrubutos estan heredados de
																																						// habilitante
		super(fechaInicio, fechaFin, monto);
	}

	@Override // -> SobreEscritura de metodos
	public double calcularValor() {
		/*
		 * getFechaInicio().until(getFechaFin()) Este método calcula la diferencia
		 * entre la fecha de inicio y la fecha de fin, devolviendo un objeto Period
		 */
		Period periodo = getFechaInicio().until(getFechaFin());
		/*
		 * periodo.getDays(): Devuelve el número de días en el Period.
		 * periodo.getMonths() * 30: Convierte los meses en días (aproximando cada mes a
		 * 30 días).
		 * periodo.getYears() * 365: Convierte los años en días (aproximando cada año a
		 * 365 días).
		 */
		int dias = periodo.getDays() + periodo.getMonths() * 30 + periodo.getYears() * 360;
		return (double) dias;
	}

	@Override
	public String toString() {
		return "Campana []" + super.toString();
	}

}
