package pruebas;

import lombok.ToString;

@ToString
class Animal {
    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }
}

@ToString
class Perro extends Animal {

    private String NombrePerro;

    public Perro(String especie) {
        super(especie);
        this.NombrePerro = NombrePerro;
    }

}

public class ClassCastExeptionTest {
    public static void main(String[] args) {
        Animal animal01 = new Animal("ave");
        try {
            Perro animal001 = (Perro) animal01;
            System.out.println(animal001);
        } catch (ClassCastException e) {
            System.out.println(animal001);
        }

    }
}
