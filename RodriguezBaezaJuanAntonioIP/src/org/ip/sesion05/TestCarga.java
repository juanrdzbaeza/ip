package org.ip.sesion05;

import java.util.Locale;
import java.util.Scanner;

public class TestCarga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		*  Carga primera = (10e-12,0.05,0.01);
		*  Carga segunda = (-20e-12,0.05,0.04);
		*  Carga tercera = (10e-12,0.01,0.04);
		*/
		
		//Declaramos variables
		int nCargas,numC=1;
		double resultado,suma = 0;
		
		@SuppressWarnings("resource")
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Indica cuantas cargas tiene el sistema:");
		nCargas = lector.nextInt();
		System.out.println("Indica las coordenadas del punto P (x,y) en metros, donde vas a calcular el potencial de las cargas:");
		double p1 = lector.useLocale(Locale.ENGLISH).nextDouble();
		double p2 = lector.useLocale(Locale.ENGLISH).nextDouble();
		Carga punto = new Carga(0,p1,p2);
		
		do{//Mediante el do while controlamos el nœmero de cargas
			System.out.println("\nCARGA "+numC);
			System.out.println("Introduzca el valor de la carga en Culombios y la posicion de la misma en metros:");
			double a = lector.useLocale(Locale.ENGLISH).nextDouble();
			double b = lector.useLocale(Locale.ENGLISH).nextDouble();
			double c = lector.useLocale(Locale.ENGLISH).nextDouble();
			
			Carga x = new Carga(a,b,c);
			System.out.println("Carga "+ numC+ ": "+ x.toString()+ "\n");
			suma += punto.potencialEn(x);
			resultado = suma;
			numC++;
		}while(numC <= nCargas);
		
		System.out.print("El potencial en el punto "+ punto+ " de las "+ (numC-1)+ " carga/s es: ");
		System.out.printf("%5.2f V", resultado);
		
	}

}
