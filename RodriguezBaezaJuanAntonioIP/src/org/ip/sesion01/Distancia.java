package org.ip.sesion01;

import java.util.Scanner;

public class Distancia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Haz un programa que muestre la distancia de un punto (x, y) al origen (0, 0),
		 * donde x e y son enteros. Comprueba con distintas ejecuciones las distancias 
		 * que se indican a continuación. Distancia de (3, 4) a (0, 0) = 5.0, distancia 
		 * de (5, 12) a (0, 0) = 13.0, distancia de (2, 1) a (0, 0) = 2.23606797749979. 
		 * Utiliza la clase Math. 
		 */
		/*
		 * Pedimos al usuario los puntos de coordenadas con los que desea trabajar: (x, y)
		 */
		int ejeX = 0;
		int ejeY = 0;
		System.out.println ("Introduzca la coordenada de abscisas");
		@SuppressWarnings("resource")
		Scanner numX	= new Scanner(System.in);
		ejeX			= numX.nextInt();
		
		System.out.println ("Introduzca la coordenada de ordenadas");
		@SuppressWarnings("resource")
		Scanner numY	= new Scanner(System.in);
		ejeY			= numY.nextInt();
		
		//nosotros definimos el punto (0, 0)
		int ceroX = 0;
		int ceroY = 0;
		
		/*
		 * La distancia entre dos puntos es igual al módulo del vector que
		 * tiene de extremos dichos puntos.
		 */
		
		System.out.println("La distancia del punto " + "(" + ejeX + ", " + ejeY + ")" + " al punto " + "(" + ceroX + ", " + ceroY + ")" + " es:"  );
		
		/*
		 * este es el algorítmo para calcular la distancia
		 */
		float distancia =  (float) Math.sqrt(
									Math.pow(
											(ejeX-ceroX),2)
										+Math.pow(
											(ejeY-ceroY),2)
									);
		
		// finalmente mostramos el resultado por pantalla.
		System.out.println(distancia);
	}
}
