package org.ip.sesion02;

import java.util.Scanner;

public class TarifaTaxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * pedimos al usuario que introduzca los kilometros recorridos
		 */
		int kilometros;
		double carrera =18;
		System.out.println ("introduzca los kilometros recorridos:");
		@SuppressWarnings("resource")
		Scanner km		= new Scanner(System.in);
		kilometros		= km.nextInt();
		/*
		 * ahora con unos if vamos crivando las posibilidades kilometricas del problema
		 * y calculamos el importe total a pagar por el cliente
		 */
		if (kilometros <= 30){
			System.out.println("Cálculo tarifa taxi:");
			System.out.println("kilometros recorridos: " + kilometros);
			System.out.println("el importe total a pagar son: "+ carrera +" euros");
		}else if ((kilometros > 30) && (kilometros <= 100)){
			carrera = carrera +((kilometros - 30)*0.85);
			System.out.println("Cálculo tarifa taxi:");
			System.out.println("kilometros recorridos: " + kilometros);
			System.out.println("el importe total a pagar son: "+ carrera +" euros");
		}else if (kilometros > 100){
			carrera = carrera + ((100 - 30)*0.85) + ((kilometros - 100)*0.65);
			System.out.println("Cálculo tarifa taxi:");
			System.out.println("kilometros recorridos: " + kilometros);
			System.out.println("el importe total a pagar son: "+ carrera +" euros");
		}//cieere de la cadena if		
		
	}//cierre del main

}//cierre del public
