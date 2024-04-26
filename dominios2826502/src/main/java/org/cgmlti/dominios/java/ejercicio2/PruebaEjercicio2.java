package org.cgmlti.dominios.java.ejercicio2;

public class PruebaEjercicio2 {
    public static void main(String[] args) {
        // crear dos instancias de cada entidad
        // Crear dos objetos de cada instancia o entidad
        // 1- nombre de la calase a instanciar
        // 2- Nombre del objeto (identificador)
        // 3- operdor de asignacion
        // 4 - Referencia (new)
        // 5- nombre de clase
        // 6- parentesis (Constructor ) :
        Hospital hospital1 = new Hospital();
        Hospital hospital2 = new Hospital();

        // accseder a los atributos del objeto
        // operador .
        // 1- identificador del objeto
        // 2. el punto
        // 3- El atributo a trabajar
        // 4- el operador de asignacion
        // 5- El valor a aignar al atributo

        hospital1.direccion = "Calle 74 a N 34 B 13 ";
        hospital2.nombre = "San Juan de Dios";
        hospital1.telefono = 718665545L;

        // Creando medicos

        Medico medico = new Medico();
        medico.nombre = "Jose Anacona";
        medico.cedula = 1010218106L;
        medico.especialidad = "PSICOLOGIA";

        Medico medico1 = new Medico();
        medico1.nombre = "Katalina ortiz";
        medico1.cedula = 452125456L;
        medico1.especialidad = "PEDIATRIA";

        Medico medico2 = new Medico();
        medico2.nombre = "patricio Perez";
        medico2.cedula = 7894123L;
        medico2.especialidad = "NEUROLOGIA";

        // creando salas

        SalaHospital sala = new SalaHospital();
        sala.numero = 123;
        sala.cantidadCamas = 13;

        SalaHospital sala1 = new SalaHospital();
        sala1.numero = 789;
        sala1.cantidadCamas = 5;

        SalaHospital sala2 = new SalaHospital();
        sala2.numero = 963;
        sala2.cantidadCamas = 10;
        /*
         * System.out.println("Hospital: " + hospital2.nombre);
         * System.out.println("Direccion: " + hospital1.direccion);
         * System.out.println("Telefono: " + hospital1.telefono);
         */
        // añadir medicos
        hospital1.listaMedicos.add(medico);
        hospital1.listaMedicos.add(medico1);
        hospital1.listaMedicos.add(medico2);

        // añadir salas

        hospital1.listaSaList.add(sala);
        hospital1.listaSaList.add(sala1);
        hospital1.listaSaList.add(sala2);

        // Recorrer la lista d emedicos del hospital 1

        System.out.println("Nombre del hospital: " + hospital2.nombre);

        System.out.println("***** Nombre medicos: ");
        for (Medico medicoR : hospital1.listaMedicos) {
            System.out.println(" Medico: " + medicoR.nombre);
        }
        System.out.println("***** Información salas: ");
        for (SalaHospital salasR : hospital1.listaSaList) {
            System.out.println(" Numero de sala: " + salasR.numero + " Cantidad de camas " + salasR.cantidadCamas);
        }
    }
}
