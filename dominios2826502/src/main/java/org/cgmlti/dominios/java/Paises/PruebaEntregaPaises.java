package org.cgmlti.dominios.java.Paises;

public class PruebaEntregaPaises {

    public static void main(String[] args) {

        // Pais
        Pais pais = new Pais();
        Pais pais1 = new Pais("Colombia");

        System.out.println(" Pais : " + pais1.nombrePais);

        // Ciudad
        Ciudad ciudad = new Ciudad();
        Ciudad ciudad1 = new Ciudad("Bogota");
        Ciudad ciudad2 = new Ciudad("Medellin");
        Ciudad ciudad3 = new Ciudad("Pereira");
        Ciudad ciudad4 = new Ciudad("Barranquilla");
        Ciudad ciudad5 = new Ciudad("Santamarta");
        Ciudad ciudad6 = new Ciudad("Cartagena");
        Ciudad ciudad7 = new Ciudad("Cali");
        Ciudad ciudad8 = new Ciudad("Huila");
        Ciudad ciudad9 = new Ciudad("Choco");

        // lista de ciudades del pais
        pais.listaCiudad.add(ciudad1);
        pais.listaCiudad.add(ciudad2);
        pais.listaCiudad.add(ciudad3);
        pais.listaCiudad.add(ciudad4);
        pais.listaCiudad.add(ciudad5);
        pais.listaCiudad.add(ciudad6);
        pais.listaCiudad.add(ciudad7);
        pais.listaCiudad.add(ciudad8);
        pais.listaCiudad.add(ciudad9);

        System.out.println(" Listas de ciudades del pais: " + pais1.nombrePais);
        for (Ciudad ciudadPais : pais.listaCiudad) {
            System.out.println(" Ciudad: " + ciudadPais.nombreCiudad);
        }

        // Rutas

        Ruta ruta = new Ruta();

        ruta.listaCiudad.add(ciudad1);
        ruta.listaCiudad.add(ciudad8);
        ruta.listaCiudad.add(ciudad1);

        Ruta ruta1 = new Ruta(001L, ruta.listaCiudad);

        System.out.println(" Numero de Ruta: " + ruta1.numero);
        for (Ciudad rutaCiudades : ruta.listaCiudad) {
            System.out.println(" Ciudad :  " + rutaCiudades.nombreCiudad);
        }

    }

}
