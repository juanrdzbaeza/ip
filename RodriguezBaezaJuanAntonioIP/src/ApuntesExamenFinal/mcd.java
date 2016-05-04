package ApuntesExamenFinal;

import java.util.Scanner;

public class mcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int valor1, valor2;
				do {
					System.out.println("Introduzca un valor entero positivo, 1er operador");
					@SuppressWarnings("resource")
					Scanner n1	= new Scanner(System.in);
					valor1		= n1.nextInt();
				} while (valor1<= 0);// cierre del while de introducción del dato
				do {
					System.out.println("Introduzca un valor entero positivo, 2º operador");
					@SuppressWarnings("resource")
					Scanner n2	= new Scanner(System.in);
					valor2		= n2.nextInt();
				} while (valor2<=0);// cierre del while de introducción del dato
				
				System.out.println("El maximo común divisor de "+valor1+" y "+valor2+" es "+org.ip.sesion04.MaximoComunDivisor.mcdRecursivo(valor1, valor2));

	}

}
