package org.ip.sesion01;

import java.util.Scanner;

public class ConvertirCelsiusFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Haz un programa que convierta grados cent�grados a Fahrenheit.
		 * F = 9 C / 5 + 32 
		 */
		System.out.println ("Ejemplo que transforma �C en �F");
		System.out.println ("que temperatura desea transformar");
		/*
		 * Pedimos al usuario que introduzca un dato pero nosotros controlaremos que sea entero.
		 */
		int gradosCentigrados = 0;
		@SuppressWarnings("resource")
		Scanner num 		= new Scanner(System.in);
		gradosCentigrados	= num.nextInt();
		
		// Calculamos la temperatura en F�
		int gradosFarenheit = ((gradosCentigrados * 9)/5) + 32;
		
		//y mostramos el resultado
		System.out.println (gradosCentigrados + " �C " + " equivalen a " + gradosFarenheit + " �F");
	}
}
