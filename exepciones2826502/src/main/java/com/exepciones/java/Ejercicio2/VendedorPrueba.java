package com.exepciones.java.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendedorPrueba {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String flag = "y";
		List<Vendedor> listaVendedor = new ArrayList<>(); // Crear Variable de lista

		do {
			System.out.println("*** NUEVO VENDEDOR ***");

			System.out.println("Ingrese codigo del vendedor");
			int codigoVendedor = in.nextInt();
			in.nextLine();

			System.out.println("Ingrese el nombre del Vendedor ");
			String nombreVendedor = in.nextLine();

			System.out.println("Ingrese el apellido del vendedor ");
			String apellidoVendedor = in.nextLine();

			System.out.println("Ingrese el numero de identificación cel vendedor ");
			int numeroIdentifica = in.nextInt();

			try {
				StringDate(nombreVendedor);

			} catch (StringDate e) {
				System.err.println(e.getMessage());
				System.out.println("debe ingresar texto");
			}

			System.out.println("Desea ingresar otro Vendedor ? y / n");
			flag = in.nextLine();
			in.nextLine();

		} while (flag.equals("y"));

	}

	private static void StringDate(String nombreVendedor) throws StringDate {
		if (nombreVendedor != null && !nombreVendedor.matches(".*\\d.*")) {
			return;
		}
		throw new StringDate("Lo siento dato invalido", "el dato no puede ser un numero");
	}

}
