package org.cgmlti.dominios.java.ejercicio4;

import java.time.LocalDateTime;

public class PruebasVehiculos {
    public static void main(String[] args) {
        // Instaciando Tipo de vehiculos

        // Creando viaje

        Viaje v = new Viaje();
        v.fechaInicio = LocalDateTime.of(2024, 4, 4, 22, 30, 0);
        v.fechaFinal = LocalDateTime.of(2024, 4, 4, 6, 30, 0);

        Camion camion1 = new Camion();
        camion1.diponibilidad = true;

        // establecer el viaje del camion

        camion1.elViajeDelCamion = v;

        CamionConRemolque camionRemolque1 = new CamionConRemolque();
        camionRemolque1.capcidadCargaExtra = 10;

        System.out.println("El viaje del camion " +
                "tiene fecha d inicio: " + camion1.elViajeDelCamion.fechaInicio);
        System.out.println("El viaje del camion " +
                "tiene fecha de fin: " + camion1.elViajeDelCamion.fechaFinal);

    }
}
