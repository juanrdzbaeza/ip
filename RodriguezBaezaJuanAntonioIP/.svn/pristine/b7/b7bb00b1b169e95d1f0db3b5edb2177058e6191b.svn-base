package org.ip.sesion03;

import java.util.Scanner;

public class TrianguloNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaracion de variables:
		int numero, i, j, numeroIteraciones;
		
		//inicializacion de variables:
		numero	=			0;
		i =					0;
		j =					0;
		numeroIteraciones =	0;
		
		do {
			System.out.println("Introduzca un número natural entre 1 y 20");
			@SuppressWarnings("resource")
			Scanner n	= new Scanner(System.in);
			numero		= n.nextInt();
		} while (numero < 1 || numero > 20);// cierre del while de introducción del dato
		
		/*
		 * Para conseguir contar hacia atrás lo que he hecho es construir dos bucles idénticos
		 * se trata de un bucle for anidado dentro de otro, en el externo las iteraciones
		 * las corta la el numero introducido, y en el interno las corta el número de 
		 * iteración del externo, así consigo el aspecto piramidal.
		 * la primera estructura cuenta el número de iteraciones totales, y la segunda
		 * cuenta hacia atrás desde el número de iteraciones totales.
		 */
		for ( i=1 ; i<=numero ; i++ ){
			for ( j=1 ; j<=i ; j++ ){
				numeroIteraciones++;
			}
		}//primera estructura
		for ( i=1 ; i<=numero ; i++ ){
			for ( j=1 ; j<=i ; j++ ){
				System.out.print(numeroIteraciones+"\t");
				numeroIteraciones--;
			}
			System.out.println("");
		}//segunda estructura
				
	}//cierre del main

}//cierre del public
