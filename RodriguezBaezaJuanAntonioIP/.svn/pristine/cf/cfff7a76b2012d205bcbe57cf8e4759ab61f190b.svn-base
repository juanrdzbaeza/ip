package ApuntesExamenFinal;

import java.util.Scanner;

class NumeroPerfecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * escribir un programa que pida introducir un entero por teclado
		 * y compruebe si el numero es perfecto.
		 * un numero es perfecto si es igual a la suma de sus divisores propios,
		 * así, 6 es un número perfecto porque sus divisores 
		 * propios son 1, 2 y 3; y 6 = 1 + 2 + 3.
		 */
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		System.out.println("Introduce el numero para comprobar si es perfecto");
		numero = entrada.nextInt();
		
		int suma = 1;
		for (int i = 2; i < numero; i++) {
			if (numero%i == 0)
				suma += i;
		}
		if (suma == numero)
			System.out.println("El numero "+numero+" es perfecto");
		else
			System.out.println("El numero "+numero+" no es perfecto");

	}//cierre del main

}//cierre de la clase
