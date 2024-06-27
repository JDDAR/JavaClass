package org.bansena.java;

import java.util.ArrayList;
import java.util.List;

public class Titular {
	private String nombre;
	private int numIdentidficacion;
	private List<CuentaBancaria> cuentas;

	public Titular(String nombre, int numIdentidficacion) {
		this.nombre = nombre;
		this.numIdentidficacion = numIdentidficacion;
		this.cuentas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumIdentidficacion() {
		return numIdentidficacion;
	}

	public void agregarCuenta(CuentaBancaria cuenta) {
		this.cuentas.add(cuenta);
	}

}
