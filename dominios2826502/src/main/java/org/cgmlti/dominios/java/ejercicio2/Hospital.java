package org.cgmlti.dominios.java.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    // atributos
    String nombre;
    String direccion;
    Long telefono;

    // Lista de medicos
    // Tambien es un atributo de los objetos de hospital
    List<Medico> listaMedicos = new ArrayList<Medico>();
    List<SalaHospital> listaSaList = new ArrayList<SalaHospital>();
}
