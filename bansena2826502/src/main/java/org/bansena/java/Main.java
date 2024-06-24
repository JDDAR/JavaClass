package org.bansena.java;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String flag = "s";

        Titular titular01 = new Titular("Jose Anacona", 1010218106);
        Titular titular02 = new Titular("Alejandra Martinez", 124535568);

        // Creando cuentas bancarias para el mismo titular
        CuentaBancaria cuenta01 = new CuentaBancaria("1001", 2.154, "pesos", titular01, 1.0222);
        CuentaBancaria cuenta02 = new CuentaBancaria("1002", 1.02200, "pesos", titular01, 1.245);
        CuentaBancaria cuenta03 = new CuentaBancaria("1003", 1.2154, "Dolares", titular02, 53.2145);

        // Agrego otra cuota de manejo a la primera cuenta

        cuenta01.agregarCuotaManejo(500.265);
        cuenta02.agregarCuotaManejo(7.012356456);

        System.out.println("\n**********************************************");
        System.out.println("**           BIENVENIDO A BANSENA           **");
        System.out.println("**********************************************\n");

        do {
            // Mostrando informacion del titular y sus cuentas
            System.out.println("\n**********************************************");
            System.out.println("**              MENÚ PRINCIPAL                **");
            System.out.println("**********************************************\n");

            System.out.println("¿Que deseas hacer hoy?\nselecciona el valor predeterminado ej: cx");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("|| (Cuentas Existentes) cx || (Titulares existentes) tx ||  ");
            System.out.println("-------------------------------------------------------------------\n");
            String opcion = in.nextLine();

            switch (opcion) {
                case "cx":
                    System.out.println("Estas son las cuentas existentes : ");
                    // obtener la lista de todas las cuentas
                    List<CuentaBancaria> cuentas = CuentaBancaria.listarCuentas();
                    // Utilizando el metodo para imprimir la lista de cuentas
                    CuentaBancaria.verCuentas(cuentas, in);
                    continue;
                case "tx":
                    System.out.println("Estos son los Titulares registradoes en el banco: ");
                    break;
                default:
                    break;
            }
            System.out.println("¿DESEA SEGUIR EN EL PROGRAMA? s/n ");
            flag = in.nextLine();
        } while (flag.equals("s"));
        in.close();

    }

}