package org.citasmedicas.java.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CitaMedico extends Citas {

    private Paciente paciente;
    private Medico medico;
    private String motivoConsulta;

    public CitaMedico(int id, LocalDate fecha, LocalTime hora, EstadoCita estadoCita, Paciente paciente, Medico medico,
            String motivoConsulta) {
        super(id, fecha, hora, estadoCita);
        this.paciente = paciente;
        this.medico = medico;
        this.motivoConsulta = motivoConsulta;
    }

}
