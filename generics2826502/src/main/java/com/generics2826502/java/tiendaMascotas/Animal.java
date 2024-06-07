package com.generics2826502.java.tiendaMascotas;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public abstract class Animal {

    private String nombre;
    private String raza;
    private Integer edad;

    // Metodo abstracto Para alimentar mascotas
    // se Define en interfaces y clases abstractas unicamente
    // la idea es que la clase que implemente ese metodo le pongan las unstrucciones
    // que quieran
    public abstract void alimentar();

}
