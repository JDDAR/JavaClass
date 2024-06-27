package com.programacionfuncional.java.lambdas;

import com.programacionfuncional.java.Empleado;

public class Main {
	public static void main(String[] args) {
		// Instanciar la interfaz operacion
		Operacion suma = new Operacion() {

			@Override
			public int ejecutar(Integer a, Integer b) {
				return a + b;
			}
		};
		// utilizacion:
		System.out.println(suma.ejecutar(5, 20));

		// Expresin lambda representacin de un metodo anonimo no tiene un nombre
		// o identificador

		Operacion multiplicar = (Integer a, Integer b) -> {
			return a * b;
		};
		Integer m = multiplicar.ejecutar(6, 15);
		System.out.println("Multiplicacion " + m);

		//

		Operacion dividir = (Integer a, Integer b) -> {
			return a / b;
		};
		Integer d = dividir.ejecutar(20, 5);
		System.out.println("división: " + d);

		// utilizar la interfaz funcional generica
		// en una clase anonima

		Imprimir<Empleado> i = new Imprimir<Empleado>() {

			@Override
			public void impresion(Empleado imprimible) {
				System.out.println(imprimible);
			}
		};

		i.impresion(new Empleado("Jose Anacona", 5.000000, "teleinformatica"));

		// crear la expresion lambda de Empleado clase anonima

		Empleado Nemp = new Empleado("daniela", 50.000000, "arte");

		Imprimir<Empleado> emp = (Empleado e) -> {
			System.out.println(e);
		};

		// expresion lambda con referencia a metodo println
		Imprimir<Empleado> emp2 = System.out::println;

		emp2.impresion(Nemp);

		emp.impresion(Nemp);

	}
}
