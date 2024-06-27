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
        System.out.println("\n**********************************************");
        System.out.println("**           BIENVENIDO A BANSENA           **");
        System.out.println("**********************************************\n");

        do {
            // Mostrando informacion del titular y sus cuentas
            System.out.println("******************************************** MENÚ PRINCIPAL ***\n");
            System.out.println("¿Qué deseas hacer hoy?\nSelecciona el valor predeterminado ej: cx");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("|| (Cuentas Existentes) cx || (Titulares existentes) tx ||");
            System.out.println("|| (Agregar Habilitante a una cuenta) ha || (Salir) ex ||");
            System.out.println("-------------------------------------------------------------------\n");

            String opcion = in.nextLine();

            switch (opcion) {
                case "cx":
                    System.out.println("Estas son las cuentas existentes : ");
                    // obtener la lista de todas las cuentas
                    List<CuentaBancaria> cuentas = CuentaBancaria.listarCuentas();
                    // Utilizando el metodo para imprimir la lista de cuentas
                    CuentaBancaria.verCuentas(cuentas, in);
                    break;
                case "tx":
                    System.out.println("Estos son los Titulares registradoes en el banco: ");
                    break;

                case "ha":
                    System.out.println("Estas son las cuentas existentes: ");
                    List<CuentaBancaria> cuentasEx = CuentaBancaria.listarCuentas();
                    CuentaBancaria.verCuentas(cuentasEx, in);

                    System.out.println("Ingrese el número de cuenta a la que desea agregar un habilitante:");
                    String numeroCuenta = in.nextLine();

                    CuentaBancaria cuentaSeleccionada = null;
                    for (CuentaBancaria cuenta : cuentasEx) {
                        if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                            cuentaSeleccionada = cuenta;
                            break;
                        }
                    }

                    if (cuentaSeleccionada == null) {
                        System.out.println("Numero de cuenta no encontrada ");
                    } else {
                        Habilitante habilitante = ControladorHabilitante.agregarHabilitante(in);
                        if (habilitante != null) {
                            cuentaSeleccionada.agregarCuotaManejo(habilitante);
                            System.out.println("Habilitante agregado con exito a la cuenta " + numeroCuenta);
                        }
                    }
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