package org.bansena.java;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class CuentaMenu {

	private List<CuentaBancaria> cuentas;

	public CuentaMenu(List<CuentaBancaria> cuenta) {
		this.cuentas = cuentas;
	}

	public void mostrarMenu(Scanner in) {
		for (CuentaBancaria cuenta : cuentas) {
			System.out
					.println("----------------------------------------------------------------------------------------------\n");
			System.out.println("Numero cuenta: " + cuenta.getNumeroCuenta() + " || Titular: "
					+ cuenta.getTitular().getNombre() + " || saldo:  " + cuenta.getSaldo() + "\n");
			System.out
					.println("----------------------------------------------------------------------------------------------\n");
		}
		String accion;
		do {
			System.out.println("¿Que acción desea realizar?");
			System.out.println("------------------------------------------------------------------------");
			System.out.println(
					"Ver detalles de cuenta (Ingrese el número de cuenta) || Ver Lista de cuentas (ll)  || Volver al menú principal (Ingrese 'menu') || Salir (Ingrese 'ex') || Agregar habilitante (ah)");
			System.out.println("-------------------------------------------------------------------------");
			accion = in.next();

			switch (accion) {
				case "ex":
					System.out.println("SALIENDO");
					System.exit(0);
					break;
				case "menu":
					return;
				case "ll":
					listarCuentas();
					break;
				case "ah":
					agregarHabilitante(in);
					break;
				default:
					verDetallesCuenta(accion);
					break;
			}

		} while (!accion.equals("menu"));
	}

	private void listarCuentas() {
		for (CuentaBancaria cuenta : cuentas) {
			System.out
					.println("----------------------------------------------------------------------------------------------\n");
			System.out.println("Numero cuenta: " + cuenta.getNumeroCuenta() + " || Titular: "
					+ cuenta.getTitular().getNombre() + " || saldo:  " + cuenta.getSaldo() + "\n");
			System.out
					.println("----------------------------------------------------------------------------------------------\n");
		}
	}

	void agregarHabilitante(Scanner in) {
		System.out.println("Ingrese el número de cuenta a la que desea agregar un habilitante:");
		String numeroCuenta = in.next();
		CuentaBancaria cuentaSeleccionada = null;

		for (CuentaBancaria cuenta : cuentas) {
			if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
				cuentaSeleccionada = cuenta;
				break;
			}
		}

		if (cuentaSeleccionada != null) {
			System.out.println("Seleccione el tipo de habilitante:");
			System.out.println("1. Campana ");
			System.out.println("2. Decreto ");
			System.out.println("3. Regla de negoccio ");
			int opcionHabilitante = in.nextInt();

			switch (opcionHabilitante) {
				case 1:
					System.out.println("Ingrese el monto para la Campana:");
					double montoCampana = in.nextDouble();
					LocalDate fechaInicio = LocalDate.now();
					LocalDate fechaFin = fechaInicio.plusDays(30); // Ejemplo de validez por 30 días
					Habilitante campana = new Campana(fechaInicio, fechaFin, montoCampana);
					cuentaSeleccionada.agregarCuotaManejo(campana);
					break;
				case 2:
					System.out.println("Ingrese el monto para habilitante Decreto:");
					double montoDecreto = in.nextDouble();
					LocalDate fechaInicioDecreto = LocalDate.now();
					LocalDate fechaFinDecreto = fechaInicioDecreto.plusDays(15); // Ejemplo de validez por 15 días
					Habilitante Decreto = new Decreto(fechaInicioDecreto, fechaFinDecreto, montoDecreto);
					cuentaSeleccionada.agregarCuotaManejo(Decreto);
					break;
				case 3:
					System.out.println("Ingrese el monto para Regla de negocio:");
					double montoRegla = in.nextDouble();
					LocalDate fechaInicioRegla = LocalDate.now();
					LocalDate fechaFinRegla = fechaInicioRegla.plusDays(20); // Ejemplo de validez por 20 días
					Habilitante ReglaNegocio = new ReglaNegocio(fechaInicioRegla, fechaFinRegla, montoRegla);
					cuentaSeleccionada.agregarCuotaManejo(ReglaNegocio);
					break;
				default:
					System.out.println("Opción inválida.");
					break;
			}
			System.out.println("Habilitante agregado a la cuenta " + numeroCuenta);
		} else {
			System.out.println("Cuenta no encontrada.");
		}
	}

	private void verDetallesCuenta(String numeroCuenta) {
		for (CuentaBancaria nCuenta : cuentas) {
			if (nCuenta.getNumeroCuenta().equals(numeroCuenta)) {
				System.out.println("\n****************************************************\n");
				System.out.println("DETALLES DE LA CUENTA " + nCuenta.getNumeroCuenta());
				System.out.println("\n----------------------------------------------------------\n");
				System.out.println(" Nombre del titular:  " + nCuenta.getTitular().getNombre() + "\n N° Identificacion: "
						+ nCuenta.getTitular().getNumIdentidficacion());
				System.out.println(" Saldo: " + nCuenta.getSaldo() + " || Divisa: " + nCuenta.getDivisa() + "\n");
			}
		}
	}

}
