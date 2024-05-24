package org.cgmlti.ciclos;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numeroTabla = 0;
        String parada = "y";
        int numero = 1;

        // Tabla de mulñtiplicar con ciclo FOR -->

        /*
         * do {
         * 
         * System.out.println("Ingrese el numero de la tabla a multiplicar ");
         * numeroTabla = in.nextInt();
         * 
         * // Tablas con ciclo for
         * 
         * for (int i = 1; i <= 10; i++) {
         * System.out.println(numeroTabla + " x " + i + " = " + (numeroTabla * i));
         * }
         * 
         * System.out.println("Desea consultar otra tabla y/n");
         * parada = in.next();
         * 
         * } while (parada.equals("y"));
         * 
         */

        do {

            System.out.println("Ingrese el numero de la tabla a multiplicar ");
            numeroTabla = in.nextInt();

            // Tablas con ciclo for

            while (numero <= 10) {
                System.out.println(numeroTabla + " x " + numero + " = " + (numeroTabla * numero));
                numero++;
            }
            System.out.println("Desea consultar otra tabla y/n");
            parada = in.nextLine();

        } while (parada.equals("y"));

        in.close();

    }

}
