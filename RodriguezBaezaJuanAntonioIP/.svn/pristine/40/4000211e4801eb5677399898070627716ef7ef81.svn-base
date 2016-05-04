package org.ip.ejerciciosResueltos01_13;

import java.util.Scanner;

public class teoremaBezout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Programa realizado por Juan Antonio Perez.
		
		/*Declaramos las variables dato1 y dato2 y le damos valor mediante escaner asegurandonos
		que los valores introducidos son correctos */
		
		System.out.println("MCD, U y V MEDIANTE EL TEOREMA DE BEZOUT");

		int dato1, dato2;

		do {
			System.out.println("Introduzca un nœmero positivo: ");
			@SuppressWarnings("resource")
			Scanner n1 = new Scanner(System.in);
			dato1 = n1.nextInt();
		} while (dato1 <= 0);

		do {
			System.out
					.println("Introduzca un nœmero positivo menor que el anterior: ");
			@SuppressWarnings("resource")
			Scanner n2 = new Scanner(System.in);
			dato2 = n2.nextInt();
		} while (dato2 >= dato1);

		// Declaramos las variables que nos har‡n faltan y las inicializamos//
		
		int x = 1;
		int vk_ = 0;
		int y = 0;
		int uk_ = 1;
		int aux1, cociente;
		
		while (dato2 != 0) {

			aux1 = dato2;
			cociente = (int) dato1 / dato2;
			dato2 = dato1 % dato2;
			dato1 = aux1;
			/* Tras este paso dato1 es igual al dato2 antes de modificarlo y dato2 es
			el resto del dato1 / dato2 antes de modificarlo */
			
			aux1 = x;
			x = vk_ - cociente * x;
			vk_ = aux1;
			/* Tras este paso x queda con el valor de vk menos el cociente por el valor de x 
			y vk queda con el valor de la x antes de modificarla */
			
			aux1 = y;
			y = uk_ - cociente * y;
			uk_ = aux1;
			/* Tras este paso x queda con el valor de uk menos el cociente por el valor de y, 
			y uk queda con el valor de la x antes de modificarla */
			}
		

		System.out.print("MCD = " + dato1 + "   U = " + uk_ + "   V = " + vk_);

	}

}
