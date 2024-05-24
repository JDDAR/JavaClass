package org.cgmlti.ciclos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioVende {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List<Vendedor> listaVendedor = new ArrayList<>();

        Vendedor vendedorUnidadM = new Vendedor(0, 0);

        String flag = "y";

        do {
            System.out.println("Ingrese el codigo del VENDEDOR ");
            int codigo = in.nextInt();

            System.out.println(" Ingrese el Las unidades vendidas");
            int unidades = in.nextInt();

            Vendedor vendedorNuevo = new Vendedor(codigo, unidades);
            listaVendedor.add(vendedorNuevo);

            System.out.println("Desea ingresar nuevo Vendedor y/n ");
            flag = in.next();

        } while (flag.equals("y"));

        System.out.println("LISTA DE VENDEDORES ");

        for (Vendedor vendedor : listaVendedor) {
            System.out.println("---------------------------------------");
            System.out.println(" Codigo del Vendedor" + vendedor.codigoVendedor);
            System.out.println("Numero de ventas del vendedor " + vendedor.unidadesVendidas);
        }

        in.close();

        int maximo = 0;
        for (Vendedor unidades : listaVendedor) {
            if (unidades.unidadesVendidas > maximo) {
                maximo = unidades.unidadesVendidas;
                vendedorUnidadM = unidades;
            }
        }
        System.out.println("******************************************************************************");
        System.out.println("Codigo del vendedor con mayor ventas : " + vendedorUnidadM.unidadesVendidas);
        System.out.println("******************************************************************************");

    }
}
