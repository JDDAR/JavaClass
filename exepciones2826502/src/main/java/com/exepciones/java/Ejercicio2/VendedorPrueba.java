package com.exepciones.java.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendedorPrueba {
<<<<<<< HEAD
	public static final String ANSY_RESET = "\033[0;0m";
	public static final String ANSY_WHITE = "\033[0;1m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\033[0;32m";
	public static final String ANSY_ORANGE = "\033[0;36m";
	public static final String ANSY_RESALT_RED = "\033[0;41m";
	public static final String ANSY_RESALT = "\033[0;42m";
=======
>>>>>>> 28c6264166514792d6ee5ee03a4109a8de6945e0

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		List<Vendedor> listaVendedor = new ArrayList<>(); // Crear Variable de lista
		String flag = "y";

		do {
			try {
				System.out.println(ANSY_WHITE + "\n*******************************");
				System.out.println("******** NUEVO VENDEDOR *******\n" + ANSY_RESET);

<<<<<<< HEAD
				System.out.println(ANSI_GREEN + "-> Ingrese codigo del vendedor" + ANSY_WHITE);
=======
				System.out.println("Ingrese codigo del vendedor");
>>>>>>> 28c6264166514792d6ee5ee03a4109a8de6945e0
				int codigoVendedor = in.nextInt();
				IntDate(codigoVendedor, listaVendedor);
				in.nextLine();

<<<<<<< HEAD
				System.out.println(ANSI_GREEN + "\n-> Ingrese el nombre del Vendedor" + ANSY_WHITE);
				String nombreVendedor = in.nextLine();
				StringDate(nombreVendedor, nombreVendedor);

				System.out.println(ANSI_GREEN + "\n-> Ingrese el apellido del vendedor" + ANSY_WHITE);
				String apellidoVendedor = in.nextLine();
				StringDate(apellidoVendedor, apellidoVendedor);

				System.out.println(ANSI_GREEN + "\n-> Ingrese el numero de identificación cel vendedor" + ANSY_WHITE);
				int numeroIdentifica = in.nextInt();

				listaVendedor.add(new Vendedor(codigoVendedor, nombreVendedor, apellidoVendedor, numeroIdentifica));
				System.out.println(ANSY_RESALT + "\n Vendedor ingresado exitosamente \n" + ANSY_RESET);
=======
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
>>>>>>> 28c6264166514792d6ee5ee03a4109a8de6945e0

			} catch (IntDate e) {
				System.err.println(e.getMessage());
				continue;
			} catch (StringDate e) {
				System.err.println(e.getMessage());
				continue;
			}

			System.out.println(ANSY_ORANGE + "--> ¿ Desea ingresar otro Vendedor ? y/n");
			flag = in.next();

		} while (flag.equals("y"));

		in.close();

		for (Vendedor vendedores : listaVendedor) {
			System.out.println("ID Vendedor: " + vendedores.getId() + " || Nombre vendedor " + vendedores.getNombre());
		}
	}

	private static void IntDate(int codigoVendedor, List<Vendedor> listaVendedor) throws IntDate {
		for (Vendedor vendedor : listaVendedor) {
			if (codigoVendedor == vendedor.getId()) {
				throw new IntDate(ANSY_RESALT_RED + " El codigo ya existe " + ANSY_RESET,
						ANSY_RESALT_RED + " El Usuario ya existe " + ANSY_RESET);
			}
		}
	}

	private static void StringDate(String nombreVendedor, String apellidoVendedor) throws StringDate {
		// \\d que sirve para identificar dígitos del 0 al 9
		if (nombreVendedor.matches(".*\\d.*") || apellidoVendedor.matches(".*\\d.*")) {
			throw new StringDate(ANSY_RESALT_RED + " Lo siento dato invalido " + ANSY_RESET,
					ANSY_RESALT_RED + " El dato no puede ser un numero " + ANSY_RESET);
		}
	}
}
