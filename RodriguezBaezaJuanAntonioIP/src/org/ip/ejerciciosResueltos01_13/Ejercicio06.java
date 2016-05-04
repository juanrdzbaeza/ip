package org.ip.ejerciciosResueltos01_13;

public class Ejercicio06 {
	
	/**
	* A partir de un nº comprendido entre 1 y 7 muestra por
	* pantalla el día de la semana con el que se corresponde
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
				System. out.println("MIÉRCOLES");
				break;
			case 4:
				System. out.println("JUEVES");
				break;
			case 5:
				System. out.println("VIERNES");
				break;
			case 6:
				System. out.println("SÁBADO");
				break;
			case 7:
				System. out.println("DOMINGO");
				break;
			default:
				System. out.println(" NO CORRESPONDE A NINGÚN DÍA DE LA SEMANA");
				break;
		}
	}
}
