package org.cgmlti.ciclos;

public class CicloBasico {

    public static void main(String[] args) {
        // por lo general un contador es de tipo entereo, valor inicial

        /*int contador = 0;
        while (contador < 10) {
            System.out.println(contador);
            // instruccion de incremento
            // se asigna a la variable de control el mismo valor a la variable de control
            // mas el valor de incremento o decremento (Se ubica en el cilo al final de
            // bloque de codigo )
            ++contador;
        }
        */
        // de 10 a uno  
        int contador2 = 10;
        while (contador2 >= 1) {
            System.out.println(contador2);
            contador2--;
        }
    }
}
