package com.javalab.empleado;

public class Directivo extends Empleado {

	public Directivo(String nombre, Integer antiguedad, Double sueldoBase) {
		super(nombre, antiguedad, sueldoBase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + "-> Directivo";
	}

}
