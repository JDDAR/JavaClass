package org.citasmedicas.java.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class Consultorio {
    private Integer id;
    private String direccion;
    private SedeConsultorio sedeConsultorio;
    private Integer numeroConsultorio;
}
