package org.citasmedicas.java.entities;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Paciente extends Usuario {

    private String correoPaciente;
    private Integer celular;
    private LocalDate fechaNacimiento;
    private Double altura;
    private Double peso;
    private TipoSangre tipoSangre;
    private Character factorRh;

    public Paciente(Integer id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Integer numeroIdentificacion, String correoPaciente, Integer celular, LocalDate fechaNacimiento,
            Double altura, Double peso, TipoSangre tipoSangre, Character factorRh) {

        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        this.correoPaciente = correoPaciente;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRh = factorRh;
    }

}
