package selectiva2826502.java;

public class Main {

    public static void main(String[] args) {
        // creando estudiante con nota
        Student estudiante = new Student(2);
        // Si la calificacion del estudidiante es mayo o igual a tres el estudiante
        if (estudiante.nota == 5) {
            System.out.println("APROBADO");
            System.out.println("NOTA : " + estudiante.nota + " E ");
        } else if (estudiante.nota >= 4 && estudiante.nota < 4.9) {
            System.out.println("APROBADO");
            System.out.println("NOTA : " + estudiante.nota + " B ");
        } else if (estudiante.nota >= 3 && estudiante.nota < 3.9) {
            System.out.println("APROBADO");
            System.out.println("NOTA : " + estudiante.nota + " A ");
        } else {
            if (estudiante.nota <= 1) {
                System.out.println("REPROBADO");
                System.out.println("NOTA : " + estudiante.nota + " D ");
                System.out.println("SE VA A COMITE");
            } else if (estudiante.nota >= 1.1 && estudiante.nota < 2) {
                System.out.println("REPROBADO");
                System.out.println("NOTA : " + estudiante.nota + " I ");
                System.out.println("VAN HACER PLAN DE MEJORAMIENTO ");
            } else if (estudiante.nota >= 2.1 && estudiante.nota < 3) {
                System.out.println("REPROBADO");
                System.out.println("NOTA : " + estudiante.nota + " D ");
                System.out.println("LLAMADO DE ATENCION ");
            }
        }
    }
}