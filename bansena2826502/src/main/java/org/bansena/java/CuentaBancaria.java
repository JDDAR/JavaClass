package org.bansena.java;

import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria {

	private String numeroCuenta;
	private double saldo;
	private String divisa;
	private Titular titular;
	private List<CuotaManejo<? extends Habilitante>> cuotaManejo; // Lista para almacenar las cuotas de manejo
	private static List<CuentaBancaria> todasLasCuentas = new ArrayList<>(); // lista estatica para todas las cuentas

	// Creando el constructor con parametro de saldoInicial y cuotaInicial

	public CuentaBancaria(String numeroCuenta, double saldoInicial, String divisa, Titular titular, double cuotaInicial) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldoInicial;
		this.divisa = divisa;
		this.titular = titular;
		this.cuotaManejo = new ArrayList<>();

		titular.agregarCuenta(this);
		todasLasCuentas.add(this);
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getDivisa() {
		return divisa;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setDivisa(String divisa) {
		this.divisa = divisa;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	// Metodo para obtener la lista de las cuotas de manejo
	public List<CuotaManejo<? extends Habilitante>> getCuotaManejo() {
		return cuotaManejo;
	}

	// Metodo para agregar la cuota de menajo
	public void agregarCuotaManejo(Habilitante habilitante) {
		// Crea una nueva cuota de manejo con el valor y la fecha actual .now
		CuotaManejo<? extends Habilitante> cuota = new CuotaManejo<>(habilitante);
		cuotaManejo.add(cuota);
	}

	// Metodo para listar las cuentas existentes
	public static List<CuentaBancaria> listarCuentas() {
		return todasLasCuentas;
	}

	/*
	 * // metodo para imprimir todas las cuotas bancarias
	 * 
	 * public static void verCuentas(List<CuentaBancaria> cuentas, Scanner in) {
	 * 
	 * for (CuentaBancaria cuenta : cuentas) {
	 * System.out
	 * .println(
	 * "----------------------------------------------------------------------------------------------\n"
	 * );
	 * System.out
	 * .println("Numero cuenta: " + cuenta.getNumeroCuenta() + " || Titular: " +
	 * cuenta.getTitular().getNombre()
	 * + " || saldo:  " + cuenta.getSaldo() + "\n");
	 * System.out
	 * .println(
	 * "----------------------------------------------------------------------------------------------\n"
	 * );
	 * }
	 * String accion;
	 * do {
	 * System.out.println("¿Que acción desea realizar?");
	 * System.out.println(
	 * "------------------------------------------------------------------------");
	 * System.out.println(
	 * "Ver detalles de cuenta (Ingrese el número de cuenta) || Ver Lista de cuentas (ll)  || Volver al menú principal (Ingrese 'menu') || Salir (Ingrese 'ex')"
	 * );
	 * System.out.println(
	 * "-------------------------------------------------------------------------");
	 * accion = in.next();
	 * 
	 * if (accion.equals("ex")) {
	 * System.out.println("SALIENDO");
	 * System.exit(0);
	 * } else if (accion.equals("menu")) {
	 * return;
	 * } else if (accion.equals("ll")) {
	 * for (CuentaBancaria cuenta : cuentas) {
	 * System.out
	 * .println(
	 * "----------------------------------------------------------------------------------------------\n"
	 * );
	 * System.out
	 * .println("Numero cuenta: " + cuenta.getNumeroCuenta() + " || Titular: " +
	 * cuenta.getTitular().getNombre()
	 * + " || saldo:  " + cuenta.getSaldo() + "\n");
	 * System.out
	 * .println(
	 * "----------------------------------------------------------------------------------------------\n"
	 * );
	 * }
	 * } else {
	 * for (CuentaBancaria nCuenta : cuentas) {
	 * if (nCuenta.getNumeroCuenta().equals(accion)) {
	 * System.out.println("\n****************************************************\n"
	 * );
	 * System.out.println("DETALLES DE LA CUENTA " + nCuenta.getNumeroCuenta());
	 * System.out.println(
	 * "\n----------------------------------------------------------\n");
	 * System.out.println(" Nombre del titular:  " +
	 * nCuenta.getTitular().getNombre() + "\n N° Identificacion: "
	 * + nCuenta.getTitular().getNumIdentidficacion());
	 * System.out.println(" Saldo: " + nCuenta.getSaldo() + " || Divisa: " +
	 * nCuenta.getDivisa() + "\n");
	 * }
	 * }
	 * }
	 * } while (!accion.equals("menu"));
	 * }
	 */
}
