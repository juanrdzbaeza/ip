package org.ip.ejerciciosResueltos01_13;

public class Ejercicio09V2 {
	/**
	 * Calcula el factorial de un entero positivo haciendo productos por
	 * la derecha y por la izquierda n! = n.(n-1).(n-2)...1
	 *
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dato = 9;
		long fact = 1;
		int i = 1;
		int j = dato;
		while (i < j) {
			fact = fact * i * j;
			i++;
			j --;
		}
		if (i == j) {
			fact = fact * i;
		}
		System. out.println("El factorial de " + dato + " es " +fact);

	}

}
