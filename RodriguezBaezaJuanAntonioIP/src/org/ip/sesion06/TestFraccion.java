package org.ip.sesion06;

import java.util.Scanner;

public class TestFraccion {

	static Scanner input;
	
	public static void main(String[] args) {

		int numComparaciones;
		System.out.println("¿Cuántas comparaciones de fracciones deseas hacer?");
		input = new Scanner(System.in);
		numComparaciones = input.nextInt();
		
		int i, num1, den1, num2, den2;
		for (i = 1 ; i <= numComparaciones ; i++) {
			System.out.println("\nComparación " + i);
			System.out.println("Introduce el numerador y denominador de la primera fraccion:");
			input = new Scanner(System.in);
			num1 = input.nextInt();
			den1 = input.nextInt();
			System.out.println("Introduce el numerador y denominador de la segunda fraccion:");
			input = new Scanner(System.in);
			num2 = input.nextInt();
			den2 = input.nextInt();
			
			Fraccion fracc1 = new Fraccion (num1, den1);
			Fraccion fracc2 = new Fraccion (num2, den2);
			
			if (fracc1.compareTo(fracc2) > 0)
				System.out.println(num1 + "/" + den1 + " es mayor que " + num2 + "/" + den2);
			else if (fracc1.compareTo(fracc2) == 0)
				System.out.println(num1 + "/" + den1 + " es igual que " + num2 + "/" + den2);
			else
				System.out.println(num1 + "/" + den1 + " es menor que " + num2 + "/" + den2);
		}
	}
}
