package org.ip.ejerciciosResueltos01_13;

public class Ejercicio05 {
	
	/**
	* Muestra un mensaje en pantalla indicando si un a�o es
	* bisiesto.
	* @param args
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a�o = 1800;
		// PRE: a�o > 0
		if ((a�o % 4 == 0) && (a�o % 100 != 0) || (a�o % 400 == 0)) {
		System. out.println("A�O BISIESTO");
		} else {
		System. out.println("A�O NO BISIESTO");
		}

	}

}
