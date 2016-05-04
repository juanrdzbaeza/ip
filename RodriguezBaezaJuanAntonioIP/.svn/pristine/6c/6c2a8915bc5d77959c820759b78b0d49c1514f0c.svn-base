package org.ip.sesion02;

import java.util.Scanner;

public class Ecuacion2Grado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("Solución de una ecuación de 2º grado: ax^2+bx+c=0");
		int a, b, c;
		double raiz1, raiz2, dentroRaiz;
		/*
		 * pedimos al usuario que introduzca los coeficientes para a, b y c
		 */
		System.out.println ("coeficiente a:");
		@SuppressWarnings("resource")
		Scanner coeficiente1	= new Scanner(System.in);
		a						= coeficiente1.nextInt();
		
		System.out.println ("coeficiente b:");
		@SuppressWarnings("resource")
		Scanner coeficiente2	= new Scanner(System.in);
		b						= coeficiente2.nextInt();
		
		System.out.println ("coeficiente c:");
		@SuppressWarnings("resource")
		Scanner coeficiente3	= new Scanner(System.in);
		c						= coeficiente3.nextInt();
		/*
		 * lo primero que vamos a hacer es comprobar si es realmente una ecuacion de 2º grado, para ello a debe ser
		 * distinto de 0
		 */
		if (a == 0){
			System.out.println("SOLUCION DE UNA ECUACION DE 2º GRADO");
			System.out.println("valores de los coeficientes");
			System.out.println("a = " + a +"; b = "+b+"; c = "+c);
			System.out.println("no es una ecuacion de 2º grado");
		}else{
			/*
			 * vamos a calcular el resultado de lo que va dentro de la raiz aparte, para saber si es negativo o positivo,
			 * en el caso de ser negativo podremos decir que la ecuacion no tiene raices reales.
			 */
			dentroRaiz = Math.pow(b,2)-4*a*c;
			if (dentroRaiz < 0){
				System.out.println("SOLUCION DE UNA ECUACION DE 2º GRADO");
				System.out.println("valores de los coeficientes");
				System.out.println("a = " + a +"; b = "+b+"; c = "+c);
				System.out.println("no tiene raices reales");
			}else{
			/*
			 * para calcular las raices lo haremos por separado, ya que tendremos en cuenta
			 * el +- de la raiz cuadrada.
			 */
			raiz1=(-(b)+Math.sqrt(dentroRaiz))/(2*a);
			raiz2=(-(b)-Math.sqrt(dentroRaiz))/(2*a);
			/*
			 * las soluciones son:
			 */
					System.out.println("SOLUCION DE UNA ECUACION DE 2º GRADO");
					System.out.println("valores de los coeficientes");
					System.out.println("a = " + a +"; b = "+b+"; c = "+c);
					System.out.println("dos raices de valores");
					System.out.println("X1 = "+raiz1);
					System.out.println("X2 = "+raiz2);
			}//cierre de la comprobacion de raices reales
		}//cierre de la comprobacion de ecuacion de 2º grado
	}

}
