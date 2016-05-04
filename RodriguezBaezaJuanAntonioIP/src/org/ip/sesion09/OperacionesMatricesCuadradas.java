package org.ip.sesion09;

public class OperacionesMatricesCuadradas {

		public static boolean esSimetrica(int matriz[][]) {
		    boolean esSimetrica;
			/*
			 * para saber si es simetrica sacamos su traspuesta y las comparamos
			 */
			int dimension = matriz.length;
			int[][] matrizTraspuesta = new int[dimension][dimension];
	        for (int fila = 0; fila <matriz.length ; fila++) {
	            for (int columna = 0; columna <matriz.length ; columna++) {
	            	matrizTraspuesta[columna][fila] = matriz[fila][columna];
	            }
	        }
	        esSimetrica = true;
	        for (int fila = 0; fila < matriz.length; fila++) {
	        	for (int columna = 0; columna < matriz[fila].length; columna++) {
	        		if (fila!=columna){
	        			if(matriz[fila][columna]!=matrizTraspuesta[fila][columna]){
	        				esSimetrica=false;
	        			}//cierre del if interno
	        		}//cierre del if externo
	        	}//cierre del for interno
	        }//cieere del for externo
	        return esSimetrica;
		}//cierre esSimetrica
		
		public static int traza(int matriz[][]){
			int traza = 0;
			for (int filas = 0; filas < matriz.length; filas++) {
				for (int columnas = 0; columnas < matriz.length; columnas++) {
					if (filas == columnas){
						traza = traza + matriz[filas][columnas];
					}//cierre del if
				}//cierre del for COLUMNAS
			}//cierre del for FILAS
			return traza;
		}//cierre traza
		
		public static int[][] suma(int matriz1[][],int matriz2[][]){
			int[][] matriz3 = new int [matriz1.length][matriz1.length];
			for (int fila = 0; fila < matriz1.length; fila++) {
				for (int columna = 0; columna < matriz1.length; columna++) {
					matriz3[fila][columna] = matriz1[fila][columna]+matriz2[fila][columna];
				}
			}
			return matriz3;
		}//cierre suma
		
		public static int[][] producto(int matriz1[][],int matriz2[][]){
			int suma = 0;
			int[][] matriz3 = new int [matriz1.length][matriz2.length];
			for (int fila = 0; fila < matriz1.length; fila++) {
				for (int columna = 0; columna < matriz2.length; columna++) {
					suma = 0;
					for (int i = 0; i < matriz2.length; i++) {
						suma += matriz1[fila][i]*matriz2[i][columna];
					}
					matriz3[fila][columna] = suma;
				}
			}//cierre del for
			return matriz3;
		}//cierre prodructo de matrices
		
		public static int[][] producto(int matriz[][],int escalar){
			int [][] matrizPorEscalar = new int [matriz.length][matriz.length];
			for (int fila = 0; fila < matriz.length; fila++) {
				for (int columna = 0; columna < matriz.length; columna++) {
					matrizPorEscalar[fila][columna] = matriz[fila][columna]*escalar;
				}
			}
			return matrizPorEscalar;
		}//cierre producto por escalar
		
		
}//cierre del public
