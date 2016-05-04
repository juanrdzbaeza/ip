package org.ip.sesion03;

import java.util.Scanner;

public class ConjeturaUlam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * pedimos al usuario que introduzca un numero entero positivo, si el
		 * número introducido no es correcto, el programa lo detectará y volverá
		 * a solicitar la cifra
		 */
		int cifraUlam;
		do {
			System.out
					.println("Introduzca un valor entero positivo para generar la sucesion de Ulam");
			@SuppressWarnings("resource")
			Scanner cifU = new Scanner(System.in);
			cifraUlam = cifU.nextInt();
		} while (cifraUlam <= 0);// cierre del while de introducción del dato
		
		/*
		 * ahora vamos a realizar un buble que en cada vuelta controle si la cifra es par o impar
		 * y segun sea así, realice la operacion que corresponda a cada caso con un if
		 */
		System.out.println("sucesion de Ulam generada a partir de "+ cifraUlam);
		while (cifraUlam != 1){
			if (cifraUlam % 2 == 0){
				cifraUlam = cifraUlam/2;
				System.out.print(cifraUlam+" ");
			}//cierre de la condicion impar
			else{
				cifraUlam = (cifraUlam * 3) + 1;
				System.out.print(cifraUlam+" ");
			}//cierre del la condicion par
		}//cierre del wuile
		
	}// cierre del main

}//cierre del public
