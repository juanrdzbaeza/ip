package org.ip.sesion09;

import java.util.Scanner;

public class EntradaSalidaArrays {
private static Scanner entrada;
	
	public static double [] leerReales1D(){
		entrada = new Scanner(System.in);
		System.out.println("Introduce el numero de componentes del Array de reales:");
		int dimension = entrada.nextInt();
		double[] a = new double [dimension];
		System.out.println("Introduce los valores reales del array:");
		for(int i = 0; i < a.length; i++){
			System.out.print("Introduce valor "+ (i+1)+ " => ");
			a[i] = entrada.nextDouble();		
		}
		return a;
	}
	
	public static int [] leerEnteros1D(){
		entrada = new Scanner(System.in);
		System.out.println("Introduce el numero de componentes del Array de enteros:");
		int dimension = entrada.nextInt();
		int[] a = new int [dimension];
		System.out.println("Introduce los valores reales del array:");
		for(int i = 0; i < a.length; i++){
			System.out.print("Introduce valor "+ (i+1)+ " => ");
			a[i] = entrada.nextInt();
		}
		return a;
	}
	
	public static int[] inicializarEnteros1D(){
		int n = 50;
		System.out.println("Introduzca el numero de componentes del array de enteros:");
		entrada = new Scanner(System.in);
		int dimension = entrada.nextInt();
		int [] al = new int [dimension];
		
		for(int i = 0; i < al.length; i++ ){
			al[i] = (int) (Math.random()*n); 
		}
		return al;
		
	}
	
	public static double[] inicializarReales1D(){
		int n = 50;
		System.out.println("Introduzca el numero de componentes del array de enteros:");
		int dimension = entrada.nextInt();
		double [] al = new double [dimension];
		for(int i = 0; i < al.length; i++){
			al[i] = Math.random()*n;
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
	
	public static int [][] leerEnteros2D(){
		entrada = new Scanner(System.in);
		System.out.println("Introduce el numero de filas y columnas de la matriz:");
		int dimension = entrada.nextInt();
		System.out.println("La matriz será de "+dimension+"X"+dimension);
		int[][] a = new int [dimension][dimension];
		System.out.println("Introduce los valores enteros de la matriz:");
		for(int fila = 0; fila < a.length; fila++){
			for (int columna = 0; columna < a.length; columna++) {
				System.out.print("Introduce valor ("+(fila+1)+","+(columna+1)+") => ");
				a[fila][columna] = entrada.nextInt();
			}
		}
		return a;
	}
	
	public static int[][] inicializarEnteros2D(){
		int n = 50;
		System.out.println("Introduce el numero de filas y columnas de la matriz:");
		int dimension = entrada.nextInt();
		int [][] matriz = new int [dimension][dimension];
		for(int fila = 0; fila < matriz.length; fila++){
			for (int columna = 0; columna < matriz.length; columna++) {
				matriz[fila][columna] = (int) (Math.random()*n);
			}
		}
		return matriz;
	}
	
	public static int mostrar2D(int[][] a){
		for (int fila = 0; fila < a.length; fila++){
			for (int columna = 0; columna < a.length; columna++) {
				System.out.print(a[fila][columna]+ "\t");
			}
			System.out.println("");
		}		
		return 0;
	}
	
	public static double mostrar2D(double[][] a){
		for (int fila = 0; fila < a.length; fila++){
			for (int columna = 0; columna < a.length; columna++) {
				System.out.print(a[fila][columna]+ "\t");
			}
			System.out.println("");
		}			
		return 0;
	}

}
