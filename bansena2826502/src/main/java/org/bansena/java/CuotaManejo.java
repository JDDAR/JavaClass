package org.bansena.java;

public class CuotaManejo<E extends Habilitante> {

	private E habilitante;

	public CuotaManejo(E habilitante) {
		this.habilitante = habilitante;
	}

	public E getHabilitante() {
		return habilitante;
	}

	public void setHabilitante(E habilitante) {
		this.habilitante = habilitante;
	}

	@Override
	public String toString() {
		return "Cuota de Manejo con habilitante: " + habilitante.toString();
	}

}
