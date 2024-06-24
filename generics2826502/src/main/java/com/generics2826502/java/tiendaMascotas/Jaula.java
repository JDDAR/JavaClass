package com.generics2826502.java.tiendaMascotas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
/// El tipo generico Limitado
class Jaula<T extends Animal> {
    private T Animal1;
    private T Animal2;

}
