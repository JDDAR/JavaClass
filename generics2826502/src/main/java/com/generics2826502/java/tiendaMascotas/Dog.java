package com.generics2826502.java.tiendaMascotas;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Dog extends Animal {

    public Dog(String nombre, String raza, Integer edad) {
        super(nombre, raza, edad);
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando al perro");
    }

}