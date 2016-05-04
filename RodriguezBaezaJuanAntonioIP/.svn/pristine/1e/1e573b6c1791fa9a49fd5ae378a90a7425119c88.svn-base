package org.ip.sesion04;

import java.util.Scanner;

public class SumaSerie {

	public static double sumaRecursiva(double n){
		if (n == 1)
			return (n/(n+1));
		else
			return (n/(n+1)) + sumaRecursiva(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dato,iteraccion = 0, i;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Inserte un nœmero para calcular la suma:");
		dato = entrada.nextInt();
		System.out.println("i\t\tSUMA");
		
		for(i=1;i<=dato;i++){//con este for contamos las iteraciones e invertimos la suma.
			iteraccion++;
			System.out.println(iteraccion+ "\t"+ sumaRecursiva(i));
		}
	}
}

