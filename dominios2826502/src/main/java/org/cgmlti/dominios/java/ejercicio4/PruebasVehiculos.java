package org.cgmlti.dominios.java.ejercicio4;

import java.time.LocalDate;

public class PruebasVehiculos {
    public static void main(String[] args) {
        // Creano una instacia de vehiculo

        Vehiculo vehiculo1 = new Vehiculo(78954L, false, 80);

        // Creando viaje
        Viaje v = new Viaje();
        v.fechaInicio = LocalDate.of(2024, 4, 8);
        v.fechaFinal = LocalDate.of(2024, 4, 4);

        // invocando el metodo duracion del viaje

        v.duracionViaje(v.fechaFinal, v.fechaInicio);

        System.out.println("Sobrecarga:  " + v.duracionViaje());

        Camion camion1 = new Camion();
        camion1.diponibilidad = true;

        // establecer el viaje del camion

        camion1.elViajeDelCamion = v;

        CamionConRemolque camionRemolque1 = new CamionConRemolque();
        camionRemolque1.capcidadCargaExtra = 10;
        camionRemolque1.capacidadCarga = 20;

        Integer totalCarga = camionRemolque1.totalCarga();

        System.out.println("Total carga del camion: " + totalCarga + " Toneladas");
        System.out.println("Total de carga sin varible: " + camionRemolque1.totalCarga());

        System.out.println("El viaje del camion " +
                "tiene fecha d inicio: " + camion1.elViajeDelCamion.fechaInicio);
        System.out.println("El viaje del camion " +
                "tiene fecha de fin: " + camion1.elViajeDelCamion.fechaFinal);

    }
}
