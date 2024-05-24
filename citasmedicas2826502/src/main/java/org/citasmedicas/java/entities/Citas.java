package org.citasmedicas.java.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Citas {
    protected int id;
    protected LocalDate fecha;
    protected LocalTime hora;
    private EstadoCita estadoCita;

    public Citas() {
    }

    public Citas(int id, LocalDate fecha, LocalTime hora, EstadoCita estadoCita) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.estadoCita = estadoCita;
    }

}
