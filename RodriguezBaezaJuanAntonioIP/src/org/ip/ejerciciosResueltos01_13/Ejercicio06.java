package org.ip.ejerciciosResueltos01_13;

public class Ejercicio06 {
	
	/**
	* A partir de un n� comprendido entre 1 y 7 muestra por
	* pantalla el d�a de la semana con el que se corresponde
	*
	* @param args
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia = 9;
		switch (dia) {
			case 1:
				System. out.println("LUNES");
				break;
			case 2:
				System. out.println("MARTES");
				break;
			case 3:
				System. out.println("MI�RCOLES");
				break;
			case 4:
				System. out.println("JUEVES");
				break;
			case 5:
				System. out.println("VIERNES");
				break;
			case 6:
				System. out.println("S�BADO");
				break;
			case 7:
				System. out.println("DOMINGO");
				break;
			default:
				System. out.println(" NO CORRESPONDE A NING�N D�A DE LA SEMANA");
				break;
		}
	}
}
