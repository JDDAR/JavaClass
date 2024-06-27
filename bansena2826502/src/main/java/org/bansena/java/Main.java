package org.bansena.java;

import java.util.ArrayList;
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

        List<CuentaBancaria> cuentas = new ArrayList<>();
        cuentas.add(cuenta01);
        cuentas.add(cuenta02);
        cuentas.add(cuenta03);

        CuentaMenu MostrandoCuentas = new CuentaMenu(cuentas);

        // Agrego otra cuota de manejo a la primera cuenta
        System.out.println("\n**********************************************");
        System.out.println("**           BIENVENIDO A BANSENA           **");
        System.out.println("**********************************************\n");

        do {
            // Mostrando información del titular y sus cuentas
            System.out.println("******************************************** MENÚ PRINCIPAL ***\n");
            System.out.println("¿Qué deseas hacer hoy?\nSelecciona el valor predeterminado ej: cx");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("|| (Ver Cuentas) cx || (Titulares existentes) tx ||");
            System.out.println("|| (Agregar Habilitante a una cuenta) ha || (Salir) ex ||");
            System.out.println("-------------------------------------------------------------------\n");

            String opcion = in.next();

            switch (opcion) {
                case "cx":
                    MostrandoCuentas.mostrarMenu(in); // Llama al método de instancia mostrarMenu
                    break;
                case "ha":
                    MostrandoCuentas.agregarHabilitante(in); // Llama al método de instancia agregarHabilitante
                    break;
                case "tx":
                    // Aquí puedes implementar la lógica para agregar habilitantes si lo deseas
                    System.out.println("Opción aún no implementada.");
                    break;
                case "ex":
                    System.out.println("Saliendo del programa...");
                    flag = "n";
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (flag.equals("s"));

        in.close();
    }
}
