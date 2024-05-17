package org.cgmlti.ciclos;

public class VariableAcumuladora {

    public static void main(String[] args) {
        
        int contador;
        // variable acumuldora:
        // nombre significativo
        int total = 0;

        for (contador = 0; contador <= 10; contador++) {
            // instruccion de acumulacion
            // no se utiliza la variable de contador
            total += contador;

            System.out.println(contador);

        }
        // imprimir variable acumuladora
        // siempre por fuera del ciclo
        System.out.println("El resultado de la suma con FOR es " + total);

        /// EJERCICIO CON WILE

        
        int total2 =0;
        while (contador2 <= 10) {
            System.out.println(contador2);
            total += contador2;
        }

        }
    }


