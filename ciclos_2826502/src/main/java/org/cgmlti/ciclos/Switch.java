package org.cgmlti.ciclos;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        String mes = "";
        String flag = "y";
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Ingrese el mes");
            mes = in.next();
            switch (mes) {
                case "enero":
                    System.out.println(" 30 dias");
                    break;
                case "febero":
                    System.out.println(" 28 dias");
                    break;
                case "marzo":
                    System.out.println("  30 dias");
                    break;
                case "abril":
                    System.out.println(" 30 dias");
                    break;
                case "mayo":
                    System.out.println(" 30 dias ");
                    break;
                case "junio":
                    System.out.println(" 30 dias");
                    break;
                case "julio":
                    System.out.println("  30 dias");
                    break;
                case "agosto":
                    System.out.println(" 30 dias");
                    break;
                case "octubre":
                    System.out.println(" 31 dias");
                    break;
                case "noviembre":
                    System.out.println(" 30 dias");
                    break;
                case "diciembre":
                    System.out.println(" 30 dias ");
                    break;
                default:
                    System.out.println("El mes no existe");
                    break;
            }
            System.out.println(" Desea Continuar y/n");
            flag = in.next();

        } while (!flag.equals("Y"));

        in.close();
    }
}
