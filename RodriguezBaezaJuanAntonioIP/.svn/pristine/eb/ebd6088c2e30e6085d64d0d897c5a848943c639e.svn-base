package org.ip.sesion10;

public class Ordenacion {
	
	//burbuja
	public static void burbuja(int [] array){
		for (int i = 1; i < array.length; i++)
			for (int j = 0; j < array.length - 1 ;j++)
				if (array[j] > array[j+1]){
					intercambio(array,j,j+1);
				}
	}
	//burbujaMejorada
	public static void burbujaMejorada(int [] array){
		boolean cambiado = true;
		int i = 1;
		while (cambiado && (i < array.length)) {
			cambiado = false;
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] >(array[j + 1])) {
					intercambio(array,j,j+1);
					cambiado = true;}
			}
			i++;
		}
	}
	//intercambio
	private static void intercambio(int [] a, int i, int j){
		int aux;
		//Intercambio
		aux = a[i];
		a[i] = a[j];
		a[j] = aux;
	}
	
	//inserccion
	public static void insercion(int [] array){
		for (int i = 1; i < array.length; i++) {
			int aux = array[i];
			int j;
			for (j = i - 1; j >= 0 && aux < array[j]; j--) {
				array[j + 1] = array[j];
			}
			// Inserto el elemento (aux) en a[j + 1]
			array[j + 1] = aux;
		}
	}
	//seleccion
	public static int[] seleccion(int [] a){
		for (int i = 0; i < a.length - 1; i++) {
			//Busco el mínimo en a[i ..a.length-1]
			int valorMinimo = a[i];
			int posicionMinimo = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < valorMinimo){
					valorMinimo = a[j];
					posicionMinimo = j;}
			}
			// Intercambio a[i] con a[posicionMinimo] si es necesario
			if (posicionMinimo != i){
				a[posicionMinimo] = a[i];
				a[i] = valorMinimo;
			}
		}
		return a;
	}
	 //#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$\\
	//@#$%@#$%           Comparable           @#$%@#$%\\
   //%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@\\
	//burbuja
	public void burbuja(Comparable [] array){
		for(int i = 1; i < array.length; i++)
			for(int j = 0; j < array.length-1; j++){
				if(array[j].compareTo(array[j+1]) > 0){
					intercambio(array,j,j+1);
				}
			}
	}
	//burbujaMejorada
	public static void burbujaMejorada(Comparable [] array){
		int i = 1;
		boolean cambiado = true;
		while(cambiado && (i < array.length)){
			cambiado = false;
			for(int j = 0; j < array.length-i; j++){
				if(array[j].compareTo(array[j+1]) > 0){
					intercambio(array,j,j+1);
					cambiado = true;
				}
			}
		}
	}
	//intercambio
	private static void intercambio(Comparable [] a, int i, int j){
		Comparable aux;
		aux =  a[i];
		a[i] = a[j];
		a[j] = aux;
	}
	//inserccion
	public static void insercion(Comparable [] array){
		for(int i = 1; i < array.length; i++){
			Comparable aux = array[i];
			int j;
			for(j = i-1; j >= 0 && aux.compareTo(array[j]) < 0; j--){
				array[j+1] = array[j];
			}
			array[j+1] = aux;
		}
	}
	//seleccion
	public static void seleccion(Comparable [] array){
		for(int i = 0; i < array.length-1; i++){
			Comparable valorMinimo = array[i];
			int posicionMinimo = i;
			for(int j = i+1; j < array.length; j++){
				if(array[j].compareTo(valorMinimo) < 0){
					valorMinimo = array[j];
					posicionMinimo = j;
				}
			}
			if(posicionMinimo != i){
				array[posicionMinimo] = array[i];
				array[i] = valorMinimo;
			}
		}
	}
	
}//cierre del public
