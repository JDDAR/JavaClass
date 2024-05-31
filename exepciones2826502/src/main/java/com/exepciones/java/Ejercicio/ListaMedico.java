package com.exepciones.java.Ejercicio;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ListaMedico {

    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        List<Medico> listaMedico = new ArrayList<>();

        listaMedico.add(new Medico("Jose", "Anacona", 1010218106));
        listaMedico.add(new Medico("Joaquin", "Anacona", 12456854));
        listaMedico.add(new Medico("Jimmy", "page", 124568546));
        listaMedico.add(new Medico("Tom", "York", 789453122));

        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Ingrese la posicion en la lista:  ");
            int n = in.nextInt();

            Medico medicoConsultar = listaMedico.get(n);

            System.out.println("*** DATOS DEL MEDICO ***");
            System.out.println("El medico posicion numero  : " + n);
            System.out.println("Nombre: " + medicoConsultar.getNombre());
            System.out.println("Apellido: " + medicoConsultar.getApellido());
            System.out.println("Numero identificación:  " + medicoConsultar.getIdentificacion());
            System.out.println("**************************");

        } catch (IndexOutOfBoundsException e) {
            System.err.println(ANSI_RED + "Debe ingresar una posicion existente ente el 0 y el " + listaMedico.size());
        } catch (InputMismatchException e) {
            System.err.println(ANSI_RED + "Debe ingresar numeros enteros.");
        }
        in.close();
    }

}
