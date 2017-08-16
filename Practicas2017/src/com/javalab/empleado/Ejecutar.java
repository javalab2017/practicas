package com.javalab.empleado;

public class Ejecutar {
	
	public static void main(String[] args) {
		 
		Empleado E1 = new Empleado("Rafa", 1, 1000.00);
		Directivo D1 = new Directivo("Mario", 5, 1030.50);
		Operario OP1 = new Operario("Alfonso", 10, 1200.00);
		
		System.out.println(E1);
		System.out.println(D1);
		System.out.println(OP1);
		
	}
}
