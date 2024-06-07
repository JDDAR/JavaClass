package com.generics2826502.java.mostrarItem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
class Customer {
    String nombre;
    Integer identificacion;
}

public class Main {
    // Metodo generico ->
    private static <T> T showItem(T obj) {
        return obj;
    }

    public static void main(String[] args) {
        // Crear y mostrar yuun integer
        Integer i1 = showItem(50);
        System.out.println(i1);
        // Crear y mostrar un Double
        Double i2 = showItem(56d);
        System.out.println(i2);
        // Crear y mostrar un customer
        Customer i3 = showItem(new Customer("Jose", 1010218401));
        System.out.println(i3);
    }
}
