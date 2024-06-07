package com.generics2826502.java.Ejercicio1;

public class Main {
    public static <V> void metodo(V obj1, V obj2) {
        if (obj1.equals(obj2)) {
            System.out.println("Los objetos son iguales ");
            System.out.println("-----------------");
        } else {
            System.out.println("son diferentes");
            System.out.println("-----------------");
        }
    }

    public static void main(String[] args) {
        String obj1 = "string";
        String obj2 = "string";
        Integer obj3 = 5;
        Integer obj4 = 5;
        Float obj5 = 1.5f;
        Float obj6 = 1.5f;

        metodo(obj5, obj6);
        metodo(obj1, obj6);
        metodo(obj1, obj2);
        metodo(obj3, obj4);
    }
}