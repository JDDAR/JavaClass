package pruebas;

public class NullPointerExeptionTest {
    public static void main(String[] args) {
        // NullPointerExeption
        // Controla una situacion cuando una variable u objeto no tiene un
        // valor asignado o tiene un objeto de valor null

        String mensaje = null;
        // Convertir el mensaje mayusculas
        try {
            mensaje.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("Nulo");
        } finally {

            System.out.println(mensaje);

        }

    }
}
