package com.programacionfuncional.java.Funcionales;

import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {

		// Ejemplo de predicate Es para comparar
		Predicate<Integer> mayo100 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer arg0) {
				return arg0 > 100;
			}

		};
		// Ejeomplo Predicate en expresion lambda
		Predicate<Integer> menor200 = (Integer z) -> {
			return z < 200;
		};
		// Ejemplo pledicate combinado
		Predicate<Integer> entre100Y200 = mayo100.and(menor200);

		if (entre100Y200.test(150)) {
			System.out.println("Numero de rango");
		} else {
			System.out.println("numero fuera de rango");
		}

	}
}
