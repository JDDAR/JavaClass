package org.citasmedicas.java.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Enfermero extends Usuario {
    private String experiencia;
    private HorarioEnfermero horarioEnfermero;
    private boolean disponibilidad;

    public Enfermero(Integer id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Integer numeroIdentificacion, String experiencia, HorarioEnfermero horarioEnfermero,
            boolean disponibilidad) {

        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        this.experiencia = experiencia;
        this.horarioEnfermero = horarioEnfermero;
        this.disponibilidad = disponibilidad;
    }

}
