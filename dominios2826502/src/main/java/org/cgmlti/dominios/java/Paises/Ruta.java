package org.cgmlti.dominios.java.Paises;

import java.util.ArrayList;
import java.util.List;

public class Ruta {
    Long numero;

    List<Ciudad> listaCiudad = new ArrayList<Ciudad>();

    public Ruta() {
        System.out.println("******* RUTAS Constructor Por defecto **************");
    }

    public Ruta(Long numero, List<Ciudad> listaCiudad) {
        this.numero = numero;
    }

}
