package ApuntesExamenFinal;

import java.util.Scanner;

public class SecuenciaFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * realizar un código que pida un numero entero por pantalla, y con él
		 * generar la secuencia de fibonacci con tantas cifras como diga el 
		 * numero introducido
		 */
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		System.out.println("Introduzca el numero de cifras que desea generar para la secuencia de Fibonacci");
		numero = entrada.nextInt();
		
		int anteriorviejo	= 0;
		int anteriornuevo	= 1;
		int auxiliar		= 0;
		for (int i = 0; i < numero; i++) {
			if (i==0)
				System.out.print(anteriornuevo+"\t");
			System.out.print(anteriorviejo+anteriornuevo+"\t");
			auxiliar		= anteriorviejo;
			anteriorviejo	= anteriornuevo;
			anteriornuevo	= auxiliar+anteriornuevo;
		}
		
	}//cierre del main

}//cierre de la clase
