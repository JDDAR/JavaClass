package org.cgmlti.ciclos;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        double talla = 0.0;

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el numero de talla ");
        talla = in.nextDouble();

        switch (talla) {
            case "8.0":
                System.out.println(" Talla Pequeña ");
                break;
            default:
                break;
        }
        in.close();

    }

}
