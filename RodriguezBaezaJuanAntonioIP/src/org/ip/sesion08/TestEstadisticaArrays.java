package org.ip.sesion08;

import java.util.Scanner;
import java.util.Arrays;

public class TestEstadisticaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Vamos a guardar un array de enteros con valores que se introducirán por teclado.");
		System.out.println("ARRAY 1:");
		int array[] = EntradaSalidaArrays.leerEnteros1D();
		System.out.println("El primer array generado es:");
		EntradaSalidaArrays.mostrar1D(array);
		
		System.out.println("\n\nVamos a guardar un array de enteros con valores generador aleatoriamente.");
		System.out.println("ARRAY 2:");
		int array2[] = EntradaSalidaArrays.inicializarEnteros1D();
		System.out.println("El Segundo array generado es:");
		EntradaSalidaArrays.mostrar1D(array2);
		
		System.out.println("\n\nVamos a guardar un array de reales con valores que se introducirán por teclado.");
		System.out.println("ARRAY 3:");
		double array3[] = EntradaSalidaArrays.leerReales1D();
		System.out.println("El tercer array generado es:");
		EntradaSalidaArrays.mostrar1D(array3);
		
		System.out.println("\n\nVamos a guardar un array de reales con valores generador aleatoriamente.");
		System.out.println("ARRAY 4:");
		double array4[] = EntradaSalidaArrays.inicializarReales1D();
		System.out.println("El cuarto array generado es:");
		EntradaSalidaArrays.mostrar1D(array4);
		
		System.out.print("\n\nESTADÍSTICA DEL PRIMER ARRAY => ");
		EntradaSalidaArrays.mostrar1D(array);
		System.out.println("\nEl mínimo es " + EstadisticaArrays.min(array));
		System.out.println("El máximo es " + EstadisticaArrays.max(array));
		System.out.println("La media es " + EstadisticaArrays.media(array));
		System.out.println("La desviación es " + EstadisticaArrays.stdDev(array));
		
		System.out.print("\nIntroduce un indice inferior y uno superior para calcular la media del subarray: ");
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int inferior = entrada.nextInt();
		int superior = entrada.nextInt();
		
		if (inferior < 0 || superior > array.length || inferior > superior){
			while (inferior < 0 || superior > array.length || inferior > superior){
				try {
					System.out.println("\nEl mínimo es " + EstadisticaArrays.min(array, inferior, superior));
					System.out.println("El máximo es " + EstadisticaArrays.max(array, inferior, superior));
					System.out.println("La media es " + EstadisticaArrays.media(array, inferior, superior));
					System.out.println("La desviación es " + EstadisticaArrays.stdDev(array, inferior, superior));
				} catch (RuntimeException e) {
					System.out.println("\nIndices del subarray fuera de rango.");
					System.out.print("Introduce un indice inferior y uno superior para calcular la media del subarray: ");
					inferior = entrada.nextInt();
					superior = entrada.nextInt();
				}// Cierre del catch
			}//Cierre del while
		}//Cierre del if
		System.out.println("\nLa media del subarray es " + EstadisticaArrays.media(array, inferior, superior));
		System.out.println("La desviación del subarray es " + EstadisticaArrays.stdDev(array, inferior, superior));
		System.out.println("El mínimo del subarray es " + EstadisticaArrays.min(array, inferior, superior));
		System.out.println("El máximo del subarray es " + EstadisticaArrays.max(array, inferior, superior));
		System.out.println("\nEl ARRAY 2 ordenado es: ");
		Arrays.sort (array2);
		EntradaSalidaArrays.mostrar1D(array2);
	}
}
