package com.exepciones.java.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendedorPrueba {
	public static final String ANSY_RESET = "\033[0;0m";
	public static final String ANSY_WHITE = "\033[0;1m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\033[0;32m";
	public static final String ANSY_ORANGE = "\033[0;36m";
	public static final String ANSY_RESALT_RED = "\033[0;41m";
	public static final String ANSY_RESALT = "\033[0;42m";

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		List<Vendedor> listaVendedor = new ArrayList<>(); // Crear Variable de lista
		String flag = "y";

		do {
			try {
				System.out.println(ANSY_WHITE + "\n*******************************");
				System.out.println("******** NUEVO VENDEDOR *******\n" + ANSY_RESET);

				System.out.println(ANSI_GREEN + "-> Ingrese codigo del vendedor" + ANSY_WHITE);
				int codigoVendedor = in.nextInt();
				IntDate(codigoVendedor, listaVendedor);
				in.nextLine();

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

			} catch (IntDate e) {
				System.err.println(e.getMessage());
				continue;
			} catch (StringDate e) {
				System.err.println(e.getMessage());
				continue;
			}

			System.out.println(ANSY_ORANGE + "--> ¿ Desea ingresar otro Vendedor ? y/n");
			flag = in.next();
			in.nextLine();

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
