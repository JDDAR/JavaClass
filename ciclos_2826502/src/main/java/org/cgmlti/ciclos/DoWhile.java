package org.cgmlti.ciclos;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        /*
         * String password = "";
         * 
         * Scanner in = new Scanner(System.in);
         * 
         * do {
         * System.out.p.rintln("Ingrese Contraseña");
         * password = in.next();
         * } while (!password.equals("secreto"));
         */
        /*********************************************************
         * 02
         * 
         * Scanner entrada = new Scanner(System.in);
         * Double nota = 0.0;
         * 
         * do {
         * System.out.println("Ingrese Nota ");
         * nota = entrada.nextDouble();
         * System.out.println(" Nota Guardada " + nota);
         * } while (nota != 0);
         * 
         * System.out.println("Terminamos");
         * entrada.close();
         */

        Scanner in = new Scanner(System.in);
        String nota = "";
        String flag = "Y";

        // Contadores para cada nota

        int contadorA = 0;
        int contadorB = 0;
        int contadorC = 0;
        int contadorD = 0;

        do {
            System.out.println("Ingrese La nota ");
            nota = in.next();
            /*
             * if (nota.equals("A")) {
             * contadorA++;
             * } else if (nota.equals("B")) {
             * contadorB++;
             * } else if (nota.equals("C")) {
             * contadorC++;
             * } else {
             * contadorD++;
             * }
             */
            switch (nota) {
                case "A":
                    contadorA++;
                    break;
                case "B":
                    contadorB++;
                    break;
                case "C":
                    contadorC += 1;
                case "D":
                    ++contadorD;
                default:
                    System.out.println("La nota no existe ");
                    break;
            }
            System.out.println(" Desea Continuar y/n");
            flag = in.next();
        } while (flag.equals("y"));

        System.out.println("El numero de notas con A es: " + contadorA);
        System.out.println("El numero de notas con B es: " + contadorB);
        System.out.println("El numero de notas con C es: " + contadorC);
        System.out.println("El numero de notas con D es: " + contadorD);

        in.close();
    }

}
