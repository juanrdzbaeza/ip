package org.ip.ejerciciosResueltos01_13;

public class Ejercicio03 {
	
	/**
	* A partir del código de un artículo, muestre por pantalla un
	* mensaje que indica si el código es o no defectusoso.
	* Códigos defectuosos:
	* 14681 hasta 15681 ambos inclusive
	* 70001 hasta 79999 ambos inclusive
	* 99999 hasta 110110 ambos inclusive
	* @param args
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigo;
		codigo = 50000; //Ejecutar cambiando el valor a 3000000000
		if ((codigo >= 14681) && (codigo <= 15681) || (codigo >=
		70001)&& (codigo <= 79999) || (codigo >= 99999) && (codigo
		<= 110110)) {
		System. out.println("CÓDIGO DEFECTUOSO");
		} else {
		System. out.println("CÓDIGO CORRECTO");
		}

	}

}
