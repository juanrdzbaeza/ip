package ApuntesExamenFinal;

public class MetodosOrdenacion {
	
	public static void burbuja1(int[] a) {
		int aux;
		for (int i = 1; i < a.length; i++){
			for (int j = 0; j < a.length - 1; j++){
				if (a[j] > a[j + 1]) {
					// Intercambio
					aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;
				}
			}
		}
	}//cierre del metodo burbuja1

	public static void burbuja2(int[] a) {
		int aux;
		for (int i = 1; i < a.length; i++){
			for (int j = 0; j < a.length - i; j++){
				if (a[j] > a[j + 1]) {
					// Intercambio
					aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;
				}
			}
		}
	}//cierre del metodo burbuja2
	
	public static void burbujaMejorada(int[] a) {
		boolean cambiado = true;
		int i = 1;
		int aux;
		while (cambiado && (i < a.length)) {
			cambiado = false;
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] > (a[j + 1])) {
					// Intercambio
					aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;
					cambiado = true;
				}
			}
			i++;
		}
	}//cierre del metodo burbujamejorada
	
	public static void burbujaMejoradaConDosFor(int[] a){
		boolean cambiado = true;
		int aux;
		for (int i = 1; cambiado && (i < a.length); i++) {
			cambiado = false;
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] > (a[j + 1])) {
					// Intercambio
					aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;
					cambiado = true;
				}
			}
		}
	}//cierre del metodo burbujaMejoradaConDosFor
	
	public static void insercion(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int aux = a[i];
			int j;
			for (j = i - 1; j >= 0 && aux < a[j]; j--) {
				a[j + 1] = a[j];
			}
			// Inserto el elemento (aux) en a[j + 1]
			a[j + 1] = aux;
		}
	}//cierre del metodo insercion
	
	public static void seleccion(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			// Busco el mínimo en a[i ..a.length-1]
			int valorMinimo = a[i];
			int posicionMinimo = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < valorMinimo) {
					valorMinimo = a[j];
					posicionMinimo = j;
				}
			}
			// Intercambio a[i] con a[posicionMinimo] si es necesario
			if (posicionMinimo != i) {
				a[posicionMinimo] = a[i];
				a[i] = valorMinimo;
			}
		}
	}//cierre del metodo seleccion

}//cierre de la clase metodosordenacion
