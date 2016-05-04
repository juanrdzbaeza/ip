package org.ip.sesion02;

import java.util.Scanner;

public class OperacionAritmetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * pedimos al usuario que introduzca los números y el operador 
		 * arotmético que desea.
		 */
		double primerElemento;
		System.out.println ("Introduzca la primera cifra:");
		@SuppressWarnings("resource")
		Scanner num1	= new Scanner(System.in);
		primerElemento	= num1.nextDouble();
		
		double segundoElemento;
		System.out.println ("Introduzca la segunda cifra:");
		@SuppressWarnings("resource")
		Scanner num2	= new Scanner(System.in);
		segundoElemento	= num2.nextDouble();
		
		char operadorElemento;
		System.out.println ("Introduzca el operando");
		@SuppressWarnings("resource")
		Scanner oper		= new Scanner(System.in);
		operadorElemento	= oper.next().charAt(0);
		
		//esta sera la variable para almacenar el resultado
		double resultado;
		/*
		 * con un switch vamos cribando las diferentes opciones de operandos
		 */
			switch (operadorElemento) {
				case ('+'):
					resultado = primerElemento + segundoElemento;
					System.out.println(primerElemento + "+" + segundoElemento + "=" + resultado);
					break;
				case ('-'):
					resultado = primerElemento - segundoElemento;
					System.out.println(primerElemento + "-" + segundoElemento + "=" + resultado);
					break;
				case ('*'):
					resultado = primerElemento * segundoElemento;
					System.out.println(primerElemento + "*" + segundoElemento + "=" + resultado);
					break;
				/*
				 * en el caso de la división deberemos tener cuidado de que el denominador sea
				 * distinto de 0
				 */
				case ('/'):
					if (segundoElemento != 0) {
						resultado = primerElemento / segundoElemento;
						System.out.println(primerElemento + "/" + segundoElemento + " = " + resultado);
					}else{
						System.out.println("ha introducido una división por cero");
					}
					break;
				default:
					System.out.println("No ha introducido un operador aritmético valido");
					break;
			}//cierre del switch
		}
	}
