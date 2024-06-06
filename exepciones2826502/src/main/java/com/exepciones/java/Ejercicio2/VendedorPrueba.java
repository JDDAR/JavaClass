package com.exepciones.java.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendedorPrueba {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		List<Vendedor> listaVendedor = new ArrayList<>(); // Crear Variable de lista
		String flag = "y";

		do {
			try {
				System.out.println("*** NUEVO VENDEDOR ***");

				System.out.println("Ingrese codigo del vendedor");
				int codigoVendedor = in.nextInt();
				IntDate(codigoVendedor, listaVendedor);
				in.nextLine();

				System.out.println("Ingrese el nombre del Vendedor ");
				String nombreVendedor = in.nextLine();
				StringDate(nombreVendedor, nombreVendedor);

				System.out.println("Ingrese el apellido del vendedor ");
				String apellidoVendedor = in.nextLine();
				StringDate(apellidoVendedor, apellidoVendedor);

				System.out.println("Ingrese el numero de identificación cel vendedor ");
				int numeroIdentifica = in.nextInt();

				listaVendedor.add(new Vendedor(codigoVendedor, nombreVendedor, apellidoVendedor, numeroIdentifica));
				System.out.println("Vendedor ingresado exitosamente");

			} catch (IntDate e) {
				System.err.println(e.getMessage());
				continue;
			} catch (StringDate e) {
				System.err.println(e.getMessage());
				continue;
			}

			System.out.println("Desea ingresar otro Vendedor ? y/n");
			flag = in.next();

		} while (flag.equals("y"));

		in.close();

		for (Vendedor vendedores : listaVendedor) {
			System.out.println("ID Vendedor: " + vendedores.getId() + " || Nombre vendedor" + vendedores.getNombre());
		}
	}

	private static void IntDate(int codigoVendedor, List<Vendedor> listaVendedor) throws IntDate {
		for (Vendedor vendedor : listaVendedor) {
			if (codigoVendedor == vendedor.getId()) {
				throw new IntDate("El codigo ya existe", "El Usuario ya existe");
			}
		}
	}

	private static void StringDate(String nombreVendedor, String apellidoVendedor) throws StringDate {
		// \\d que sirve para identificar dígitos del 0 al 9
		if (nombreVendedor.matches(".*\\d.*") || apellidoVendedor.matches(".*\\d.*")) {
			throw new StringDate("Lo siento dato invalido", "el dato no puede ser un numero");
		}
	}
}
