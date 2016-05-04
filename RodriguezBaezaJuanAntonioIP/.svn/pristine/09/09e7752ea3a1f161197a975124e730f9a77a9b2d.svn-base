package org.ip.sesion03;

import java.util.Scanner;

public class NumeroPerfecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numPerf, sumaDivisores;
		sumaDivisores = 0;
		do {
			System.out.println("Introduzca un numero (>1) para saber si es perfecto");
			@SuppressWarnings("resource")
			Scanner n	= new Scanner(System.in);
			numPerf		= n.nextInt();
		} while (numPerf <= 1);// cierre del while de introducción del dato
		
		/*
		 *primero calculamos los divisores del número introducido, para ello hago un for
		 *que en cada vuelta saca un divisor y lo suma en la variable sumaDivisores, si
		 *al finalizar el valor de sumaDivisores es igual al numero introducido, el número
		 *perfecto 
		 */
		
		for (int i = numPerf; i > 1 ; i--) {
			if (numPerf%i==0)
				sumaDivisores = sumaDivisores+(numPerf/i);
		}//cierre del for
		if(sumaDivisores != numPerf){
			System.out.println("El número no es perfecto");
		}else{
			System.out.println("El número es perfecto");
		}//cierre del if
		
	}//cierre del main

}//cierre del public
