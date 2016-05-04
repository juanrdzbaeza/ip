package org.ip.sesion03;

import java.util.Scanner;

public class BucleCentinela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaracion de variables:
		double valorIntroducido, numerosPositivos ,numerosNegativos, valoresLeidos, sumaPositivos, sumaNegativos;
		double mediaValores;
		
		//inicializacion de variables:
		numerosPositivos 	= 0;
		numerosNegativos 	= 0;
		valoresLeidos		= 0;
		sumaPositivos		= 0;
		sumaNegativos		= 0;
		mediaValores		= 0;
		
		/*
		 * pedimos una cifra por teclado hasta que esa cifra sea un 0. y mientras vamos
		 * realizando las operaciones necesarias para luego mostrar por pantalla 
		 * el resultado 
		 */
		System.out.println("Introduzca Valores enteros, el programa termina si la entrada es 0");
		do {
			@SuppressWarnings("resource")
			Scanner n			= new Scanner(System.in);
			valorIntroducido	= n.nextInt();
			/*
			 * si el valor es positivo lo sumo a la cuenta de positivos,
			 * en caso contrario lo sumare a la cuenta de los negativos
			 */
			if (valorIntroducido>0){
				numerosPositivos++;
				//aprobecho para hacer aqui la suma de positivos
				sumaPositivos = sumaPositivos+valorIntroducido;
			}else if (valorIntroducido<0){
				numerosNegativos++;
				//aprobecho para hacer aqui la suma de negativos
				sumaNegativos = sumaNegativos+valorIntroducido;
			}
			/*
			 * el numero total de valores leidos sera igual a las 
			 * veces que pase por aqui, siempre q sea distinto
			 * de 0
			 */
			if (valorIntroducido!=0){
				valoresLeidos++;
			}
		} while (valorIntroducido != 0);// cierre del while de introducción del dato
		
		/*
		 * la media de los valores la hago fuera del bucle. con la suma de 
		 * positivos + negativos saco el total, y dividiendo
		 * entre los valores leidos menos 1 (el ultimo valor leido sera un 0)
		 */
		mediaValores=((sumaPositivos+(sumaNegativos))/valoresLeidos);
		
		/*
		 * imprimo los resultados
		 */		
		System.out.println("El número de positivos es "+ numerosPositivos);
		System.out.println("El número de negativos es "+ numerosNegativos);
		System.out.println("El número total de valores leidos es "+ valoresLeidos);
		System.out.println("La suma de positivos es "+ sumaPositivos);
		System.out.println("La suma de negativos es "+ sumaNegativos);
		System.out.println("La media de los valores es "+ mediaValores);

	}//cierre del main

}//cierre del public
