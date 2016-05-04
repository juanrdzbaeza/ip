 package org.ip.sesion08;

import java.util.Scanner;

public class EntradaSalidaArrays {
	private static Scanner input;
	
	public static double [] leerReales1D(){
		input = new Scanner(System.in);
		System.out.println("Introduce el numero de componentes del Array de reales:");
		int dimension = input.nextInt();
		double[] a = new double [dimension];
		System.out.println("Introduce los valores reales del array:");
		/*
		 * al introducir valores reales deberemos usar la coma del teclado alfumérico,
		 * en lugar de la coma del teclado numerico.
		 */
		
		for(int i = 0; i < a.length; i++){
			System.out.print("Introduce valor "+ (i+1)+ " => ");
			a[i] = input.nextDouble();		
		}
		return a;
	}
	
	public static int [] leerEnteros1D(){
		input = new Scanner(System.in);
		System.out.println("Introduce el numero de componentes del Array de enteros:");
		int dimension = input.nextInt();
		int[] a = new int [dimension];
		System.out.println("Introduce los valores reales del array:");
		for(int i = 0; i < a.length; i++){
			System.out.print("Introduce valor "+ (i+1)+ " => ");
			a[i] = input.nextInt();
		}
		return a;
	}
	
	public static int[] inicializarEnteros1D(){
		int n = 50;
		System.out.println("Introduzca el numero de componentes del array de enteros:");
		int dimension = input.nextInt();
		int [] al = new int [dimension];
		
		for(int i = 0; i < al.length; i++ ){
			al[i] = (int) (Math.random()*n); 
		}
		return al;
		
	}
	
	public static double[] inicializarReales1D(){
		int n = 50;
		System.out.println("Introduzca el numero de componentes del array de reales:");
		int dimension = input.nextInt();
		double [] al = new double [dimension];
		
		for(int i = 0; i < al.length; i++){
			al[i] = (Math.random()*n);
		}
		return al;
	}
	
	public static void mostrar1D(double[] a){
		for (int i = 0; i < a.length; i++){ 
			System.out.print(a[i]+ "\t");
		}
	}
	
	public static void mostrar1D(int[] a){
		for (int i = 0; i < a.length; i++){ 
			System.out.print(a[i]+ "\t");
		}
	}
}