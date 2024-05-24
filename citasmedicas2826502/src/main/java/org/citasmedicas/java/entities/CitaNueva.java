package org.citasmedicas.java.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class CitaNueva {

    public static void main(String[] args) {

        // CREANDO AL MEDOCO
        Medico med1 = new Medico(01, "Pepito", "perez", TipoIdentificacion.CEULA_CIUDADANIA, 12345678, 2458,
                Especialidad.ODONTOLOGIA);

        // CREANDO AL ENFERMERO

        Enfermero enf1 = new Enfermero(001,
                "Julian Esteban",
                "Anacona ramirez",
                TipoIdentificacion.CEULA_CIUDADANIA,
                10213546,
                "3 años",
                HorarioEnfermero.MAÑANA,
                true);

        // CREANDO AL PACIENTE
        Paciente pac1 = new Paciente(001,
                "Jose Daniel",
                "Anacona Ramirez",
                TipoIdentificacion.CEULA_CIUDADANIA,
                1010218106,
                "jdanaconar@gmail.com",
                21202154,
                LocalDate.of(1994, Month.OCTOBER, 26),
                1.72,
                60.0,
                TipoSangre.O,
                '+');

        // CRANDO CONSULTORIO
        Consultorio consul1 = new Consultorio(01, "Calle 73 # 45 Sur", SedeConsultorio.SUR, 201);

        // CREANDO LA CITA

        CitaMedico CitaMedico1 = new CitaMedico(001,
                LocalDate.of(2024, Month.MAY, 8),
                LocalTime.of(12, 30, 0),
                EstadoCita.AGENDADA,
                pac1,
                med1,
                "Dolor de cabeza");

        // IMPRIMIENDO CITA
        System.out.println("DATOS DE LA CITA ");
        System.out.println("Numero " + CitaMedico1.getId());
        System.out.println("fecha y hora : " + CitaMedico1.getFecha() + " || " + CitaMedico1.getHora());
        System.out.println("-----------------------------------------");
        System.out.println("DATOS DEL MEDICO");
        System.out.println("Nombre: " + CitaMedico1.getMedico().nombres);
        System.out.println("Especialidad: " + CitaMedico1.getEstadoCita());
        System.out.println("-----------------------------------------");
        System.out.println("Consultorio : " + consul1.getNumeroConsultorio());
        System.out.println("-----------------------------------------");
        System.out.println("Paciente : " + pac1.getNombres());

    }
}
