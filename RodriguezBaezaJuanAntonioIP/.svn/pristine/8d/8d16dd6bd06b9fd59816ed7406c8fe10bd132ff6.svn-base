package org.ip.sesion07;

import java.util.Scanner;

public class EntradaEnterosConExcepcion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		int number1, number2;
		boolean error = false;
		
		do{
			error = false;
			try{
				System.out.println("Introduzca dos valores enteros: ");
				number1 = entrada.nextInt();
				number2 = entrada.nextInt();
				System.out.println("La suma es "+ (number1 + number2));
			}
			catch(Exception e){
				error = true;
				System.out.print("Incorrecto, ");
				//importante limpiar el buffer del Scanner
				entrada.nextLine();
			}
		}while(error);
	}
}
