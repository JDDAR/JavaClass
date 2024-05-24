package org.citasmedicas.java.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CitaEnfermero extends Citas {
    private String procedimiento;
    private Paciente paciente;
    private Enfermero enfermero;

    public CitaEnfermero(int id, LocalDate fecha, LocalTime hora, EstadoCita estadoCita, String procedimiento,
            Paciente paciente, Enfermero enfermero) {
        super(id, fecha, hora, estadoCita);
        this.procedimiento = procedimiento;
        this.paciente = paciente;
        this.enfermero = enfermero;
    }

}
