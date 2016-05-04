package org.ip.sesion04;

import java.util.Scanner;

public class MaximoComunDivisor {
	
	public static int mcdRecursivo(int valor1, int valor2){
		int mcd, dividendo, divisor, almacen;
		mcd			= 0;
		dividendo	= 0;
		divisor		= 0;
		almacen		= 0;
		
		if (valor1 < valor2){
			dividendo = valor2;
			divisor = valor1;
		}else{
			dividendo = valor1;
			divisor = valor2;
		}
		if (dividendo%divisor==0){
			mcd = divisor;
		}else{
			almacen		= dividendo;
			dividendo	= divisor;
			divisor		= almacen%divisor;
			
			while (dividendo%divisor!=0) {
				almacen=divisor;
				divisor=dividendo%divisor;
				dividendo=almacen;
			}//cierre del while
			mcd = divisor;
		}//cierre del if		
		return mcd;
	}//cierre del metodo

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor1, valor2;
		do {
			System.out.println("Introduzca un valor entero positivo, 1er operador");
			@SuppressWarnings("resource")
			Scanner n1	= new Scanner(System.in);
			valor1		= n1.nextInt();
		} while (valor1<= 0);// cierre del while de introducción del dato
		do {
			System.out.println("Introduzca un valor entero positivo, 2º operador");
			@SuppressWarnings("resource")
			Scanner n2	= new Scanner(System.in);
			valor2		= n2.nextInt();
		} while (valor2<=0);// cierre del while de introducción del dato
		
		System.out.println("El maximo común divisor de "+valor1+" y "+valor2+" es "+mcdRecursivo(valor1, valor2));
		
	}//cierre del main

}//cierre del public
