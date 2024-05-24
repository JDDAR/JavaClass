package org.citasmedicas.java;

import org.citasmedicas.java.entities.Especialidad;
import org.citasmedicas.java.entities.Medico;
import org.citasmedicas.java.entities.TipoIdentificacion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Medico m = new Medico(01,
                "Jose Anacona",
                "Anacona Ramirez",
                TipoIdentificacion.CEULA_CIUDADANIA,
                1010218106,
                45685,
                Especialidad.MEDICINA);

        // Imprimiendo instancia de medico
        System.out.println(m);

    }
}