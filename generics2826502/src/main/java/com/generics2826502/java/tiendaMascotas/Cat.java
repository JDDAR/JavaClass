package com.generics2826502.java.tiendaMascotas;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Cat extends Animal {

    public Cat(String nombre, String raza, Integer edad) {
        super(nombre, raza, edad);
    }

    // Si se herefda de una clase abstract que tiene mtodos abastractos
    // se debe implementar obligatoriamente esos metodos
    @Override // este metodo esta definido en otra clase abstra acta
    public void alimentar() {
        System.out.println("Alimentando al gato ");
    }

}