package com.programacionfuncional.java.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntegerStreams {

	public static void main(String[] args) {

		Predicate<Integer> mayores5 = (Integer z) -> {
			return z > 50;
		};
		Predicate<Integer> mayoresA5 = (Integer z) -> {
			return z > 5;
		};

		// Creando una lista de enteros
		List<Integer> listaInteger = List.of(1, 5, 6, 5, 10, 50);
		// Crear un Stream para la lista
		Stream<Integer> streamEnteros = listaInteger.stream();
		int cuantos = (int) streamEnteros.filter(mayores5).forEach(null);
		;

		System.out.println(cuantos);

	}
}
