package org.cgmlti.ciclos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();
        String flag = "y"; // Centinela 

        do {

            System.out.println("Ingrese el nombre del estudiante ");
            String nombre = in.nextLine();

            System.out.println("Ingrese la identificacion del estudiante");
            int identificacion = in.nextInt();

            System.out.println("ingrese la nota del estudiante");
            int nota = in.nextInt();

            // Creamos el objeto del estudi+iante nuevo 
            Estudiante estudianteNuevo = new Estudiante(nombre, identificacion, nota);
            listaEstudiante.add(estudianteNuevo);

            System.out.println(" ingresar otro estudiante y/n");
            flag = in.next();
            in.nextLine(); /// ---->> Preguntar -bien al profesor No a Chatgpt OK?

        } while (flag.equals("y"));

        System.out.println("Lista de los estudiantes registrados : ");
        for (Estudiante estudiante : listaEstudiante) {
            System.out.println("----------------------------------");
            System.out.println(" Nombre Estudiante: " + estudiante.nombre);
            System.out.println(" Numero Identificacion: " + estudiante.identificacion);
            System.out.println(" Nota del estudiante :  " + estudiante.nota);

        }

        //Calculando los maximos y los minimos 

        if (listaEstudiante.size() > 0) { // Verifico si la lista no esta vacia 

            double notaMaxima = listaEstudiante.get(0).getNota();


        }
        
        in.close();
    }

}
