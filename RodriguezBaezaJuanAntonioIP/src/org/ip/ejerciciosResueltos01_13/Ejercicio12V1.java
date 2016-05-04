package org.ip.ejerciciosResueltos01_13;

public class Ejercicio12V1 {
	/**
	* Muestra si un entero positivo es primo
	* @param args
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dato = 7;
		int divisor = 2;
		boolean primo = true;
		while (primo && divisor < dato){
			if (dato % divisor == 0)
				primo = false;
				divisor++;
		}//fin del while
		if (primo)
			System. out.println("El número es primo");
		else
			System. out.println("El número no es primo");
	}
}
