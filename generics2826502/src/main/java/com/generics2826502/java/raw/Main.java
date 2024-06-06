package com.generics2826502.java.raw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tipo raw
        // Define cada elemento como de tipo object
        List<String> nombres = new ArrayList<>();

        nombres.add("45");
        nombres.add("2.3");
        // Sacar a una index de la lista
        // casting

        String num = nombres.get(0);
        
        for (Object o : nombres) {
            System.out.println(o);
        }

    }
}
