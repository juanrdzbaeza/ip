package org.ip.sesion02;

import java.util.Scanner;

public class EcuacionRecta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double xA, yA, xB, yB;
		double pendiente, pendientePorxA, terminoIndependiente;
		/*
		 * pedimos al usuario que introduzca las coordenadas para los puntos
		 */
		//coordenadas del punto A
		System.out.println("coordenadas para el punto A");
		System.out.println ("abcisa de A:");
		@SuppressWarnings("resource")
		Scanner x1	= new Scanner(System.in);
		xA			= x1.nextInt();
		
		System.out.println ("ordenada de A:");
		@SuppressWarnings("resource")
		Scanner y1	= new Scanner(System.in);
		yA			= y1.nextInt();
		
		//coordenadas del punto B
		System.out.println("coordenadas para el punto B");
		System.out.println ("abcisa de B:");
		@SuppressWarnings("resource")
		Scanner x2	= new Scanner(System.in);
		xB			= x2.nextInt();
		
		System.out.println ("ordenada de B:");
		@SuppressWarnings("resource")
		Scanner y2	= new Scanner(System.in);
		yB			= y2.nextInt();
		
		/*
		 * segun los datos introducidos vamos a generar las posibles respuestas:
		 */
		//1)si xA = xB, yA = yB => son el mismo punto y no existe recta
		if ((xA == xB) && (yA == yB)){
			System.out.println("CÁLCULO DE LA ECUIÓN DE LA RECTA QUE PASA POR DOS PUNTOS");
			System.out.println("los dos puntos ("+xA+", "+yA+"),("+xB+", "+yB+") COINCIDEN, no se puede calcular la ecuación de la recta");
		}//2) si xA = xB => la recta será la perpendicular al eje x en el punto xA 
		else if (xA == xB){
			System.out.println("CÁLCULO DE LA ECUIÓN DE LA RECTA QUE PASA POR DOS PUNTOS");
			System.out.println("x = "+xA);
		}//3) si yA = yB => la recta será la perpendicular al eje y en el punto yA
		else if (yA == yB){
			System.out.println("CÁLCULO DE LA ECUIÓN DE LA RECTA QUE PASA POR DOS PUNTOS");
			System.out.println("y = "+yA);
		}else{
			//****************************************************************************//
			/*
			 * para calcular la recta vamos a sacar la pendiente para con un punto y la pendiente poder
			 * construir la recta.
			 */
			pendiente = (yB-yA)/(xB-xA);
			/*
			 * ecuacion punto-pendiente
			 * cojemos uno de los puntos por ejemplo A
			 */
			pendientePorxA = pendiente*(-xA);//pendiente multiplicado por xA(termino independiente)
			terminoIndependiente = pendientePorxA+yA;//como yA también es termino independiente lo sumamos
			//4)si el termino independiente = 0, entonces la recta sera del tipo y = fx
			if (terminoIndependiente == 0){
				System.out.println("y = "+pendiente+"x");
			}//5)si el termino independiente es negativo
			else if (terminoIndependiente < 0){
				System.out.println("y = "+pendiente+"x"+terminoIndependiente);
			}//6) si el termino independiente positivo diferente de 0
			else if (terminoIndependiente > 0){
				System.out.println("y = "+pendiente+"x +"+terminoIndependiente);
			}
		}//cierre general de las condiciones
		
	}//cierre del main

}// cierre del public
