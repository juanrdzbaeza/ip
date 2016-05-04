package org.ip.sesion04;

import java.util.Scanner;

public class InvertirEntero {

public static void mostrarInverso(int n){
		
		System.out.print(n%10);
	        if(n/10!=0)
	            mostrarInverso(n/10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dato;
		@SuppressWarnings("resource")
		Scanner d1 = new Scanner(System.in);
		do{
			System.out.println("Introduzca un valor positivo para calcular su inverso:");
			dato = d1.nextInt();
			}while(dato<1);
		
		mostrarInverso(dato);
	}

}
