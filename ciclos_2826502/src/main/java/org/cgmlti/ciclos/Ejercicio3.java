package org.cgmlti.ciclos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String flag = "y";

        Estudiante EstudianteNuevo = new Estudiante("", 0, 0);
        List<Estudiante> listaEstudiantes = new ArrayList<>();

        do {
            System.out.println("Ingrese el nombre del estudiante ");
            EstudianteNuevo.nombre = in.next();

            EstudianteNuevo.add()



            System.out.println(" ingresar otro estudiante y/n");
            flag = in.next();

        } while (flag.equals("y"));

        in.close();

        // List<Estudiante> listaEstudiantes = new ArrayList<>();

    }

}
