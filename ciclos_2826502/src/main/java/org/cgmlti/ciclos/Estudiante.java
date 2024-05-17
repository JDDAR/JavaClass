package org.cgmlti.ciclos;

public class Estudiante {

    String nombre;
    int identificacion;
    Double nota;

    public Estudiante(String nombre, Integer identificacion, int nota) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.nota = (double) nota;
    }


}
