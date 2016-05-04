package ApuntesExamenFinal;

import java.util.Scanner;

public class FibonacciExamen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int numero = 1;
		System.out.println("Introduzca el numero de cifras que desea generar");
		do {
			if (numero<=0) {
				System.out.println("debe introducir una cifra natural");
			}
			numero = entrada.nextInt();
		} while (numero<=0);
		
		System.out.println("LA SERIE DE FIBONACCI EXAMEN GENERADA ES ");
		System.out.println();
		
		int auxiliar, anterior1, anterior2;
		
			anterior2 = 0;
			anterior1 = 1;
		
			for (int i = 2; (i <= numero); i++) {
				if (i % 2 == 0){
					auxiliar = anterior1 + anterior2;
					//System.out.print("\t"+auxiliar);
					System.out.print("\t"+(anterior1 + anterior2));
				}else{
					auxiliar = anterior1 - anterior2;
					//System.out.print("\t"+auxiliar);
					System.out.print("\t"+(anterior1 - anterior2));
				}
				
				anterior2	= anterior1;
				anterior1	= auxiliar;
				//System.out.print("\t"+auxiliar);
			}
		
		}

	}

