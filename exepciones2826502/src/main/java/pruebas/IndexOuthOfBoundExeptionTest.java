package pruebas;

import java.util.List;

public class IndexOuthOfBoundExeptionTest {
    public static void main(String[] args) {

        /* 
            Toda variable o inicializacion de objetos debe 
            de ir antes del try
        */

        // Crear lista de nombres
        List<String> listaNombre = List.of(
                "Matha",
                "Joaquin",
                "Jose");

        // Iprimir un elemento de la lista
        try {
            System.out.println(listaNombre.get(2));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Acceder a una posicion que exista");
        }
      

    }
}
