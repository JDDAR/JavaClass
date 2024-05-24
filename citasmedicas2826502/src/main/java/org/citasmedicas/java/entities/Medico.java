package org.citasmedicas.java.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Medico extends Usuario {

    // el modificador de acceso se pone antes del tipo de atrbuto
    private Integer registroMedico;
    private Especialidad especialidad;

    public Medico(Integer id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Integer numeroIdentificacion, Integer registroMedico, Especialidad especialidad) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

}
