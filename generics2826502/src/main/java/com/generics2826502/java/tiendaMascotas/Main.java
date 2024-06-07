package com.generics2826502.java.tiendaMascotas;

public class Main {
    public static void main(String[] args) {

        Cat c1 = new Cat("Miles", "Golden", 1);
        Cat c2 = new Cat("Pacha", "Callejera", 15);

        Dog p1 = new Dog("Miles", "Golden", 1);
        Dog p2 = new Dog("Pacha", "Callejera", 15);

        Jaula<Cat> cat = new Jaula<Cat>(c1, c2);
        Jaula<Dog> dogs = new Jaula<Dog>(p1, p2);

        System.out.println(cat);
        System.out.println(dogs);

        // Alimentar la mascotas de la jaula de Dogs
        dogs.getAnimal1().alimentar();
        cat.getAnimal2().alimentar();

    }
}
