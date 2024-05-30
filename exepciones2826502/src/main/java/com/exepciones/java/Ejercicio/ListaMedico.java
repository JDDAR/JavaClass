package com.exepciones.java.Ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaMedico {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el medico a consultar ");

        Medico medico01 = new Medico("Jose", "Anacona", 1010218106);
        Medico medico002 = new Medico("Joaquin", "Anacona", 12456854);

        List<Medico> listaMedico = new ArrayList<>();

        listaMedico.add(medico01);
        listaMedico.add(medico002);

        int n = in.nextInt();

        try {
            System.out.println("El nombre del medico es: " + listaMedico.get(n));
            System.out.println(listaMedico.get(n));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("debe ingresar una posicion que exista");
        }
    }

}
