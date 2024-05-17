package org.cgmlti.ciclos;

public class OperadorTernario {
    public static void main(String[] args) {
        int cuenta = 11;
        String mensaje = "";
        mensaje = (cuenta < 10) ? "Cuenta es mayor a 10" : "Cuenta menor a 10";
        System.out.println(mensaje);

    }
}
