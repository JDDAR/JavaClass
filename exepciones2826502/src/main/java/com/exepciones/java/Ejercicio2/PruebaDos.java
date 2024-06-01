package com.exepciones.java.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PruebaDos {

    public static void main(String[] args) throws com.exepciones.java.Ejercicio2.StringDate {

        Scanner in = new Scanner(System.in);
        String flag = "y";
        List<Vendedor> listaVendedor = new ArrayList<>(); // Crear Variable de lista

        String nombreVendedor;

        do {
            System.out.println("*** NUEVO VENDEDOR ***");

            System.out.println("Ingrese codigo del vendedor");
            int codigoVendedor = in.nextInt();
            in.nextLine();

            System.out.println("Ingrese el nombre del Vendedor ");
            try {
                nombreVendedor = in.nextLine();
                StringDate(nombreVendedor, nombreVendedor);

            } catch (StringDate e) {

                System.out.println(e.getMessage());
                continue;
            }

            System.out.println("Ingrese el apellido del vendedor ");
            String apellidoVendedor = in.nextLine();
            StringDate(apellidoVendedor, apellidoVendedor);

            System.out.println("Ingrese el numero de identificación cel vendedor ");
            int numeroIdentifica = in.nextInt();

            listaVendedor.add(new Vendedor(codigoVendedor, nombreVendedor, apellidoVendedor, numeroIdentifica));

            System.out.println("Desea ingresar otro Vendedor ? y / n");
            flag = in.nextLine();
            in.nextLine();

        } while (flag.equals("y"));

        in.close();

    }

    private static void StringDate(String nombreVendedor, String apellidoVendedor) throws StringDate {
        // \\d que sirve para identificar dígitos del 0 al 9
        if (nombreVendedor.matches(".*\\d.*") || apellidoVendedor.matches(".*\\d.*")) {
            throw new StringDate("Lo siento dato invalido", "el dato no puede ser un numero");
        }
    }
}
