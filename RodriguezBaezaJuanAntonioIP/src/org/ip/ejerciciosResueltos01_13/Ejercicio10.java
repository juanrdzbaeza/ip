package org.ip.ejerciciosResueltos01_13;

public class Ejercicio10 {
	/**
	* Muestra las potencias de 2 comprendidas entre 1 y 100000
	* @param args
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int potencia = 1;
		int i = 0;
		int limite = 100000;
		while (potencia <= limite){
			System. out.printf("%d\t%d\n",i,potencia);
			potencia = potencia * 2;
			i++;
		}

	}

}
