package com.programacionfuncional.java.lambdas;

//Interfaz funcional generica 
public interface Imprimir<T> {
	public void impresion(T imprimible);

	// POJO Plain Old Java objet
	// el objeto deja nde ser generico para ser normal
}
