package org.cgmlti.dominios.java.ejercicio4;

import java.time.LocalDate;
import java.time.Period;

public class Viaje {
    LocalDate fechaInicio;
    LocalDate fechaFinal;

    // Creando un metodopara viaje

    public void duracionViaje(
            LocalDate fechaInicio,
            LocalDate fechaFin
    ) 
    {
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFin;
        Period diferencia = Period.between(fechaInicio, fechaFin);
        System.out.println(" Duracion del viaje " + diferencia.getDays() + " dias");
    }

    public Integer duracionViaje() {

        Period diferencia = Period.between(fechaInicio, fechaFinal);
        return diferencia.getDays();
    }

}
