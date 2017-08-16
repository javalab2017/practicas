package com.javalab.empleado;

public class Operario extends Empleado {

	@Override
	public String toString() {
		return super.toString() + "-> Operario";
	}

	public Operario(String nombre, Integer antiguedad, Double sueldoBase) {
		super(nombre, antiguedad, sueldoBase);
		// TODO Auto-generated constructor stub
	}

}
