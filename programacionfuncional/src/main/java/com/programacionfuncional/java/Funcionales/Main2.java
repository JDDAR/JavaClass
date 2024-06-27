package com.programacionfuncional.java.Funcionales;

import java.util.function.Function;
import java.util.function.Predicate;

import com.programacionfuncional.java.Empleado;

public class Main2 {

	public static void main(String[] args) {
		/*
		 * Predicate<Empleado> ganaMas2Millones = (Empleado e) -> {
		 * return e.getSalario() > 2000000.0;
		 * };
		 * Predicate<Empleado> ganaMenos5millones = (Empleado e) -> {
		 * return e.getSalario() < 5000000.0;
		 * };
		 */

		Predicate<Empleado> ganaMas2millones = (e) -> e.getSalario() > 2000000.0;
		Predicate<Empleado> ganamenos5millones = (e) -> e.getSalario() < 5000000.0;

		Predicate<Empleado> entreDosyCinco = ganaMas2millones.and(ganamenos5millones);

		Empleado emp01 = new Empleado("carlos", 1000000.00, "diseño");
		Empleado emp02 = new Empleado("Jose", 2500000.00, "programacion");

		if (entreDosyCinco.test(emp02)) {
			System.out.println("Gana fuera del rango");
		} else {
			System.out.println("Gana en el rango");
		}

		// Interfaz funcional Funtion()

		Function<Empleado, String> soloNombre = (e) -> {
			return e.getNombre();
		};

		System.out.println("Nombre Empleado: " + soloNombre.apply(emp02));

	}
}
