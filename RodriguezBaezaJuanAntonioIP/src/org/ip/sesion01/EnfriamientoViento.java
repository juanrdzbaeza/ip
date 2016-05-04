package org.ip.sesion01;

import java.util.Scanner;

public class EnfriamientoViento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Dada la temperatura t (en grados Fahrenheit) y la velocidad del viento 
		 * v (en millas por hora), haz un programa (EnfriamientoViento) que permita 
		 * calcular el enfriamiento del viento, w (en grados Fahrenheit), usando 
		 * la fórmula del National Weather Service :
		 *         w = 35.74 + 0.6215t + (0.4275t - 35.75) v^0.16
		 */
		/*
		 * pedimos al usuario la temperatura y la velocidad del viento con las que vamos a operar
		 */
		System.out.println ("Introduzca temperatura en ºF");
		float gradosFarenheit = 0;
		@SuppressWarnings("resource")
		Scanner numT 		= new Scanner(System.in);
		gradosFarenheit	= numT.nextInt();
		
		System.out.println ("Introduzca velocidad del viento en millas por hora");
		float velocidadViento = 0;
		@SuppressWarnings("resource")
		Scanner numV 		= new Scanner(System.in);
		velocidadViento	= numV.nextInt();
		/*
		 * calculamos el enfriamiento del viento basandonos en la formula.	
		 */
		double enfriamientoViento =
				35.74 + (0.6215*gradosFarenheit) + 
					((0.4275*gradosFarenheit) - 35.75)
					 * Math.pow(velocidadViento, 0.16);
		/*
		 * y mostramos por pantalla el resultado.
		 */
		System.out.println ("El enfriamiento del viento a velocidad " + velocidadViento + " millas/hora, y temperatura " + gradosFarenheit + " ºF, es:");
		//enfriamientoViento = (int)enfriamientoViento;
		System.out.printf("%4.2f",enfriamientoViento); System.out.println(" ºF");
	}

}
