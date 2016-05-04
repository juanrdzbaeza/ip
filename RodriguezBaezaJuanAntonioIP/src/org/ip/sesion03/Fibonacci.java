package org.ip.sesion03;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, i, x, numeroFibonacci, almacen;
		i=0;
		x=0;
		numeroFibonacci=1;
		almacen=0;
		/*
		 * pedimos al usuario el numero de cifras de la sucesion de fibonacci que desea imprimir
		 */
		System.out.println("Indica cuántos tárminos quieres mostrar de la serie de Fibonacci");
		@SuppressWarnings("resource")
		Scanner n	= new Scanner(System.in);
		numero		= n.nextInt();
		
		/*
		 * con un bucle for vamos a dar tantas vueltas como nos diga el numero introducido menos 2
		 * ya que las dos primeras cifras de la secuencia las imprimimos antes del bucle, una vez
		 * dentro guardamos el valor de numeroFibonacci en una variable almacen, sumamos x y 
		 * numeroFibonacci para calcular la siguiente cifra de fibonacci, por ultimo asignamos
		 * a x el valor de almacen
		 * 
		 */
		System.out.print(x+" "+numeroFibonacci);
		for (i=0 ; i<(numero-2) ; i++) {
			almacen=numeroFibonacci;
			numeroFibonacci = x+numeroFibonacci;
			System.out.print(" "+numeroFibonacci);
			x=almacen;			
		}//cierre del for

	}//cierre del main

}//cierre del public
