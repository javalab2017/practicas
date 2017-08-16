package com.javalab.test;

import java.util.Date;

public class PrimeraClase {
	
	// Codigo de la clase

	/**
	 * Este comentario es para generar documentación via Javadoc Describe el
	 * comportamiento de la clase.
	 */

	public static void main(String[] args) {
		
		if (args.length > 1) {
			System.out.println(args[0]);
			System.out.println(args[1]);
		}

		/*
		 * Aca ubicamos todo el código del método main.
		 */
		Date today = new Date();

		System.out.println("Primera clase laboratorio 2017.");
		System.out.println("La fecha de hoy es: " + today);
		
		int matriz[][];
		matriz = new int[4][4];
		for (int x=0; x < matriz.length; x++) {
		  for (int y=0; y < matriz[x].length; y++) {
		      System.out.println (matriz[x][y]);
		  }
		}

	}

}





