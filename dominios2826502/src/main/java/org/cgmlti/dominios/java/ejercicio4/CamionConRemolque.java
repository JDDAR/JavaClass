package org.cgmlti.dominios.java.ejercicio4;

public class CamionConRemolque extends Vehiculo {
    Integer capcidadCargaExtra;
    String descripcion;

    // creando un metodo
    // Calculando el todal de carga

    public Integer totalCarga() {
        Integer totalCargaOperacion = capacidadCarga + capcidadCargaExtra;
        return totalCargaOperacion;
    }

    

}
