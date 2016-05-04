package org.ip.sesion01;

import java.util.Scanner;

public class DivisionPorCero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		* Haz un programa que muestre por pantalla el cociente y el resto de una 
		* división por cero con enteros y reales.
		*/
		System.out.println ("Ejemplo para mostrar el cociente y el resto de una division por 0 de enteros y reales");
		System.out.println ("Introduzca el numerador");
		/*
		 * Pedimos al usuario que introduzca el dato que desea para usarlo como numerador.
		 */
		float numeradorReal = 0;
		@SuppressWarnings("resource")
		Scanner num 		= new Scanner(System.in);
		numeradorReal		= num.nextInt();
		
		/*
		 * Nuestro denominador siempre será el 0, solo debemos distinguir entre el 0 real y el 0 entero.
		 */
		float denominadorReal 	= 0;
		int denominadorEntero	= (int) denominadorReal;
		// igualmente necesitamos un numerador entero
		int numeradorEntero 	= (int) numeradorReal;
		
		/*
		 * Ahora podemos realizar nuestras operaciones:
		 */
		
		// operaciones reales
		System.out.println("Las operaciones Reales son:");
		System.out.println(numeradorReal + "/" + denominadorReal + "=" + numeradorReal / denominadorReal);
		System.out.println(numeradorReal + "%" + denominadorReal + "=" + numeradorReal % denominadorReal);
		
		// operaciones enteras
		System.out.println("Las operaciones Enteras son:");
		System.out.println(numeradorEntero + "/" + denominadorEntero + "=" + numeradorEntero / denominadorEntero);
		System.out.println(numeradorEntero + "%" + denominadorEntero + "=" + numeradorEntero % denominadorEntero);
	}
}
