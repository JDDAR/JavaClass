package pruebas;

public class ArithmeticExeptionTest {
    public static void main(String[] args) {

        int divisor = 1;
        int dividendo = 8;
        int resultado = 0;

        try {
            // Flujo principal del caso de uso 
            resultado = dividendo / divisor;
        } catch (ArithmeticException e) {
            //flujo alterno o exepcion (cristerios de aceptacion)
            System.out.println("Division por cero");
        } finally {
            System.out.println(resultado);
        }

    }
}
