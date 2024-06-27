package com.programacionfuncional.java.Funcionales;

import java.util.Arrays;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		List<String> nombresLista = Arrays.asList("Juan", "María", "Pedro", "Ana");

		nombresLista.forEach(System.out::println);
	}
}
