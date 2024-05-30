package com.exepciones.java.portencia;

public class Potencia {
    public static void main(String[] args) {

        int numero = -7;

        /*
         * Crear un metodo para detectar si n es par
         */
        try {
            par(numero);
            negativo(numero);

            int potencia = numero * numero;
            System.out.println("La potencia es: " + potencia);

        } catch (ParExeption e) {
            System.err.println(e.getMessage());
        } catch (NegativoExeption n) {
            System.err.println("Numero negativo");
        }

    }

    private static void negativo(int numero) throws NegativoExeption {
        if (numero <= 0) {
            throw new NegativoExeption("El numero es negativo ", "El numero no puede ser negativo");
        }

    }

    private static void par(int numero) throws ParExeption {
        /*
         * Controlar si el numero ingresado es par
         */
        if (numero % 2 == 0) {
            // aqui arrojo la excepcipon de par
            throw new ParExeption("Numero invalido", "el numero debe ser par ");
        }
    }

}
