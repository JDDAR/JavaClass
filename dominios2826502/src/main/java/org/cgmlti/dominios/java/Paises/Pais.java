package org.cgmlti.dominios.java.Paises;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    String nombrePais;

    List<Ciudad> listaCiudad = new ArrayList<Ciudad>();

    public Pais() {
        System.out.println(" ******** Constructor PAIS por defecto ********** ");
    }

    public Pais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

}
