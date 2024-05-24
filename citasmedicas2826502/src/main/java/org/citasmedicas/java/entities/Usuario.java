package org.citasmedicas.java.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {

    //de una clase abstracta no se pueden crear objetos 
    //no se puyede instanciar 
    //ejemplo el usuario u = new usuaruo (No se puede haer)

    protected Integer id;
    protected String nombres;
    protected String apellidos;
    protected TipoIdentificacion tipoIdentificacion;
    protected Integer numeroIdentificacion;

    public Usuario() {
    }

    public Usuario(Integer id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Integer numeroIdentificacion) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
    }
}
