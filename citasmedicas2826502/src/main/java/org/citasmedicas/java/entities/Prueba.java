package org.citasmedicas.java.entities;

import java.time.LocalDate;
import java.time.Month;

public class Prueba {
    public static void main(String[] args) {
        Medico m = new Medico();
        m.setId(1);

        System.out.println(m.getId());
        // aacediendo atributos con defaul

        Paciente p1 = new Paciente(01,
                "Pepito",
                "Perez",
                TipoIdentificacion.CEULA_CIUDADANIA,
                2121212123,
                "Pepito@gmail.com",
                1010221215,
                LocalDate.of(2024, Month.APRIL, 13),
                1.72,
                65.2,
                TipoSangre.A,
                '-');

        // utilizar geters y setters de lombok
        System.out.println("Nombre Paciente: " + p1.getNombres());
        System.out.println("Apellido Paciente: " + p1.getApellidos());

        // CONSULTORIO
        Consultorio c1 = new Consultorio(01,
                "calle 73 sur #45",
                SedeConsultorio.SUR,
                205);

        System.out.println("Numero consultorio: " + c1.getNumeroConsultorio() + " || Dirección: " + c1.getDireccion());

    }
}
