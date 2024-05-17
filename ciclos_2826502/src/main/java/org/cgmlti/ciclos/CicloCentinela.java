package org.cgmlti.ciclos;

import java.util.Scanner;

public class CicloCentinela {

    public static void main(String[] args) {
        // Objeto que se llama scanner

        Scanner entrada = new Scanner(System.in);

        // lectura de notas por teclado
        System.out.println("Ingrese la Nota, Porfavor");
        Double nota = entrada.nextDouble(); // Conversion de string a numeros(doble, capacidad de almacenamiento mayor )
        System.out.println("Nota Guardada: " + nota);

        while (nota != 0) {
            // lectura de notas por teclado
            System.out.println("Ingrese la Nota, Porfavor");
            nota = entrada.nextDouble();
            System.out.println("Nota Guardada: " + nota);
        }
        System.out.println("Termiamos");
        entrada.close(); // Cerrar el teclado
    }

}
