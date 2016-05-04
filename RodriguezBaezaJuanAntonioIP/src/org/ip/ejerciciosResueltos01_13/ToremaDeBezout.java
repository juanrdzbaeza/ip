package org.ip.ejerciciosResueltos01_13;

import java.util.Scanner;

public class ToremaDeBezout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculo del M.C.D a partir del Teorema de Bezout");
		/*
		 * TEOREMA DE BEZOUT: Sean a, b pertenecientes a Z no nulos, entoces
		 * existen u,v pertenecientes a Z tal que m.c.d(a,b)=au+bv.
		 * 
		 */

		// Declaración de variables

		int numero1, numero2, dividendo, divisor, auxiliar1, cociente;
		int auxiliar2	= 1;
		int v	= 0;
		int auxiliar3	= 0;
		int u	= 1;

		do {
			System.out.println("primer numero: ");
			@SuppressWarnings("resource")
			Scanner n1 = new Scanner(System.in);
			numero1 = n1.nextInt();
		} while (numero1 <= 0);

		do {
			System.out.println("segundo numero: ");
			@SuppressWarnings("resource")
			Scanner n2 = new Scanner(System.in);
			numero2 = n2.nextInt();
		} while (numero2 <= 0);

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
		numero1		= dividendo;
		numero2		= divisor;
		
		/*
		 * A continuación implementamos el algoritmo para el Teorema de Bezout
		 */

		while (divisor != 0) {

			auxiliar1 = divisor;
			cociente = (int) dividendo / divisor;
			divisor = dividendo % divisor;
			dividendo = auxiliar1;

			auxiliar1 = auxiliar2;
			auxiliar2 = v - cociente * auxiliar2;
			v = auxiliar1;

			auxiliar1 = auxiliar3;
			auxiliar3 = u - cociente * auxiliar3;
			u = auxiliar1;
		}//fin del algoritmo
		
		/*
		 * Presentación de los resultados
		 */
		int mcd = dividendo;
		System.out.println("");
		System.out.println("La solución por el T. Bezout:");
		System.out.println("");
		System.out.println(mcd +" = ("+u+"*"+numero1+") + ("+v+"*"+numero2+")");
		System.out.println("");
		System.out.println("M.C.D = "+mcd);
		System.out.println("U = "+u);
		System.out.println("V = "+v);
	}//cierre del main
}//cierre del public
