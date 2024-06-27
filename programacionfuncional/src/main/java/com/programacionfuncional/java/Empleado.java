package com.programacionfuncional.java;

public class Empleado {
	private String nombre;
	private Double salario;
	private String departamento;

	public Empleado(String nombre, Double salario, String departamento) {
		this.nombre = nombre;
		this.salario = salario;
		this.departamento = departamento;
	}

	public String getNombre() {
		return nombre;
	}

	public Double getSalario() {
		return salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", salario=" + salario + ", departamento=" + departamento + "]";
	}

}
