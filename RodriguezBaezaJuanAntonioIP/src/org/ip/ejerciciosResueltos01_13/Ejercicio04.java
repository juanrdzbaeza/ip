package org.ip.ejerciciosResueltos01_13;

public class Ejercicio04 {
	
	/**
	* Contratación en una empresa si los trabajadores cumplen:
	* Que la edad sea de al menos 18 años y
	* que tengan más de 85 puntos en alguna de las dos pruebas
	* que han realizado
	* @param args
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad, nota1, nota2;
		// PRE: edad >= 0 y nota1 >= 0 y nota2 >= 0
		edad = 18;
		nota1 = 15;
		nota2 = 90;
		if ((edad >= 18) && ((nota1 > 85) || (nota2 > 85))) {
		System. out.println("CONTRATADO");
		} else {
		System. out.println("NO CONTRATADO");
		}

	}

}
