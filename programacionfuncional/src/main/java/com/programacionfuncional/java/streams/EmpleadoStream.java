package com.programacionfuncional.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.programacionfuncional.java.Empleado;

public class EmpleadoStream {
	public static void main(String[] args) {

		Predicate<Empleado> mayor1billon = (empleadoSelect) -> empleadoSelect.getSalario() > 1.0;

		Function<Empleado, String> soloNombre = (empleadoSelect) -> empleadoSelect.getNombre();
		Function<Empleado, Double> soloSalario = (empleadoSelect) -> empleadoSelect.getSalario();

		BinaryOperator<Double> suma = (salario1, salario2) -> salario1 + salario2;

		List<Empleado> empleados = Arrays.asList(
				new Empleado("jose Anacona", 1.9, "Programacion"),
				new Empleado("Maroia", 1.2, "R.H"),
				new Empleado("Camila", 1.0, "Cafeteria"),
				new Empleado("Andres", 0.5, "Ingenieria"));

		// Crando Streams
		Stream<Empleado> streamEmpleados = empleados.stream();
		streamEmpleados.filter(mayor1billon)
				.map(soloNombre)
				.sorted()
				.forEach(System.out::println);

		Optional<Double> sumatoria = streamEmpleados.map(soloSalario).reduce(suma);

		//
		System.out.println(sumatoria.orElseThrow());

	}
}
