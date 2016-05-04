package org.ip.sesion03;

import java.util.Scanner;

public class Euclides {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, numero2, dividendo, divisor;
		int almacen;
		do {
			System.out.println("Introduzca un valor entero positivo, 1er operador");
			@SuppressWarnings("resource")
			Scanner n1	= new Scanner(System.in);
			numero1		= n1.nextInt();
		} while (numero1<= 0);// cierre del while de introducción del dato
		do {
			System.out.println("Introduzca un valor entero positivo, 2º operador");
			@SuppressWarnings("resource")
			Scanner n2	= new Scanner(System.in);
			numero2		= n2.nextInt();
		} while (numero2<=0);// cierre del while de introducción del dato
		/*
		 * para discernir quienes seran los primeros dividendo y divisor, voy a usar un if
		 * que me almacenara el mayor de los numeros introducidos en el dividendo, y el menor
		 * en el divisor
		 */
		if (numero1 < numero2){
			dividendo = numero2;
			divisor = numero1;
		}else{
			dividendo = numero1;
			divisor = numero2;
		}
		/*
		 * ahora montamos el algoritmo de Euclides sobre un bucle, para ello necesito una
		 * variable extra que he llamado almacen, en ella guardare momentaneamente el valor
		 * del divisor, para poder almacenar en el divisor el resto de la division que será
		 * el proximo divisor, despues el valor de almacen lo asigno an el dividendo y
		 * vuelvo a dividir hasta que el resto sea 0, momento en el cual el divisor es 
		 * precisamente el resto de la division anterior y nuesto MCD.
		 */
		
		while (dividendo%divisor!=0) {
			almacen=divisor;
			divisor=dividendo%divisor;
			dividendo=almacen;
			System.out.println(divisor);
		}//cierre del while
		System.out.println("El MCD de "+ numero1 +" y "+ numero2 +" es "+divisor);

	}//cierre del main

}//cierre del public
