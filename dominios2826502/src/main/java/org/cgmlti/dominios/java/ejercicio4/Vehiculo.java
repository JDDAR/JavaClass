package org.cgmlti.dominios.java.ejercicio4;

public class Vehiculo {
    Long codigo;
    boolean diponibilidad;
    Integer capacidadCarga;

    // un constructor es aquel que no tiene parametros 
    public Vehiculo() {
        System.out.println("Ingreso al constructor " );
    }

    public Vehiculo(Long codigo, boolean diponibilidad, Integer capacidadCarga) {
        this.codigo = codigo;
        this.diponibilidad = diponibilidad;
        this.capacidadCarga = capacidadCarga;
    }
    

}
