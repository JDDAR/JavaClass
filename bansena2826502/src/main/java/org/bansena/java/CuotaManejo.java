package org.bansena.java;

import java.time.LocalDate;

public class CuotaManejo {
	private double valor;
	private LocalDate fecha;

	public CuotaManejo(double valor, LocalDate fecha) {
		this.valor = valor;
		this.fecha = fecha;
	}

	public double getValor() {
		return valor;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

}
