package com.generics2826502.java.Suma;

public class Main {

    private static <T extends Number> Double sumar(T a, T b) {
        Double resultado = a.doubleValue() + b.doubleValue();
        return resultado;
    }

    public static void main(String[] args) {
        // invocando el metodo
        System.out.println(sumar(2.3, 3.2));
        System.out.println(sumar(2.5f, 3.6f));
        System.out.println(sumar(2.3, 6));
        System.out.println(sumar(4L, 6L));
    }
}
