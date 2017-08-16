package com.javalab.empleado;

public class Empleado {
	
	private String nombre;
	private Integer antiguedad;
	private Double sueldoBase;
	private Double sueldoActual;
	
	public Empleado(String nombre, Integer antiguedad, Double sueldoBase) {
		super();
		this.nombre = nombre;
		this.antiguedad = antiguedad;
		this.sueldoBase = sueldoBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	public Double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(Double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public Double getSueldoActual() {
		return sueldoActual;
	}

	public void setSueldoActual(Double sueldoActual) {
		this.sueldoActual = sueldoActual;
	}

	@Override
	public String toString() {
		return "Empleado: " + this.getNombre();
	}
	
}
