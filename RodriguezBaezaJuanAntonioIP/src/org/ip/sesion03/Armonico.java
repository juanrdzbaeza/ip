package org.ip.sesion03;

import java.util.Scanner;

public class Armonico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numArmonico, numero;
		numArmonico=0;
		do {
			System.out.println("Introduzca un numero (>1) para saber si es Armonico");
			@SuppressWarnings("resource")
			Scanner n	= new Scanner(System.in);
			numero		= n.nextInt();
		} while (numero <= 1);// cierre del while de introducción del dato
		
		/*
		 * con un bucle vamos a hacer un sumatorio de fracciones 1/1+1/2+1/3...+1/n
		 */
		for (double i = 1; i <=numero ; i++) {
			numArmonico = numArmonico+(1/i);
		}
		System.out.println("El valor del numero armónico es "+numArmonico);

	}//cierre del main

}//cierre del public
