package org.ip.sesion03;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dato, divisor=2;
		boolean primo = true;
		do {
			System.out.println("Introduzca un numero (>1) para saber si es primo");
			@SuppressWarnings("resource")
			Scanner n	= new Scanner(System.in);
			dato		= n.nextInt();
		} while (dato <= 1);// cierre del while de introducción del dato
		
		/*
		 * Comprobamos si es divisible entre 2. De no serlo no comprobaremos divisores pares.
		 * 
		 * Llegaremos probando divisores hasta raiz(Dato). Si hasta ese valor no hemos
		 * encontrado ningún divisor, no es necesario seguir comprobando.
		 */
		
		//optimizar:
		if (dato%2 != 0){
			while (primo && divisor < Math.sqrt(dato)){
				if (divisor%2 != 0)
					if (dato % divisor == 0)
						primo = false;
					divisor++;
			}//cierre del while
		}else{
			while (primo && divisor < Math.sqrt(dato)){
				if (dato % divisor == 0)
					primo = false;
				divisor++;
			}//cierre del while
		}
		
		if (primo)
			System. out.println("El número es primo");
		else
			System. out.println("El número no es primo");

	}//cierre del main

}//cierre del public
