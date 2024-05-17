package org.cgmlti.ciclos;

public class Estudiante {

    String nombre;
    Integer identificacion;
    Double nota;

    public Estudiante(String nombre, Integer identificacion, int i) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.nota = (double) i;
    }
}
