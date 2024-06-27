package org.bansena.java;

import java.time.LocalDate;
import java.util.Scanner;

public class ControladorHabilitante {
	public static Habilitante agregarHabilitante(Scanner in) {
		System.out.println("Seleccione el tipo de habilitante:");
		System.out.println("1. Campana");
		System.out.println("2. Regla de Negocio");
		System.out.println("3. Decreto Gubernamental");

		int opcion = in.nextInt();
		in.nextLine(); // Consumir la nueva linea

		System.out.println(" Ingrese la fecha de inicio (YYYY-MM-DD): ");
		LocalDate fechaInicio = LocalDate.parse(in.nextLine());

		System.out.println("Ingrese la fecha de fin (YYYY-MM-DD): ");
		LocalDate fechaFin = LocalDate.parse(in.nextLine());

		System.out.println("Ingrese el monto: ");
		double monto = in.nextDouble();

		switch (opcion) {
			case 1:
				return new Campana(fechaInicio, fechaFin, monto);
			case 2:
				return new ReglaNegocio(fechaInicio, fechaFin, monto);
			case 3:
				return new Decreto(fechaInicio, fechaFin, monto);
			default:
				System.out.println("Opcion no valida. No se creó ningún habilitante");
				return null;
		}
	}
}
