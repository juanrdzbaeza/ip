package org.ip.sesion04;

import java.util.Scanner;

public class ConjeturaUlam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				//Inicio la variable dato cuyo valor será introducido por el usuario en un scanner, después llamo al método generarUlam y lo muestro.
				int dato;
				@SuppressWarnings("resource")
				Scanner entrada = new Scanner(System.in);
				do {
					System.out.println("Introduce un valor entero positivo para generar la sucesión de Ulam.");
					dato = entrada.nextInt();
				} while (dato <= 0);

				System.out.println("Sucesión de Ulam generada a partir de " + dato);
				while (dato != 1) {
				dato = generarUlam(dato);
				System.out.print(dato + "\t");
				}
			} //Cierre del main

			//Declaro el método generarUlam en el cual se calcula las operaciones de la sucesión.
			public static int generarUlam (int dato) {
			
					if (dato % 2 == 0) {
						return dato/2;
					} else {
						return (dato*3)+1;
					}
			} //Cierre del método generarUlam
		} //Cierre del class
