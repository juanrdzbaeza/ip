package org.ip.sesion06;

import java.util.Locale;
import java.util.Scanner;

import org.ip.sesion05.Fraccion;

@SuppressWarnings("unused")
public class TestComplejo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double real1, real2, imaginaria1, imaginaria2;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH);
		
		System.out.println("PRIMER COMPLEJO");
		System.out.println("Introduce la parte real:");
		real1 = input.nextDouble();
		System.out.println("Introduce la parte imaginaria:");
		imaginaria1 = input.nextDouble();
		
		System.out.println("\nSEGUNDO COMPLEJO");
		System.out.println("Introduce la parte real:");
		real2 = input.nextDouble();
		System.out.println("Introduce la parte imaginaria:");
		imaginaria2 = input.nextDouble();
		
		System.out.println("\nLos números complejos introducidos son:");
		Complejo complejo1 = new Complejo (real1, imaginaria1);
		Complejo complejo2 = new Complejo (real2, imaginaria2);
		
		System.out.println(complejo1.toString());
		System.out.println(complejo2.toString());
		
		System.out.println("\nHemos cambiado la parte real del primer complejo y la imaginaria del segundo");
		complejo1.setReal(complejo1, real1 = input.nextDouble());
		complejo2.setImaginaria(complejo2, real2 = input.nextDouble());
		
		System.out.println(complejo1.toString());
		System.out.println(complejo2.toString());
		
		
		System.out.println("\nRESULTADOS DE LAS OPERACIONES");
		System.out.println("(" + real1 + " + " + imaginaria1 + "i) + (" + real2 + " + " + imaginaria2 + "i) = " + complejo1.sumar(complejo2) );
		System.out.println("(" + real1 + " + " + imaginaria1 + "i) - (" + real2 + " + " + imaginaria2 + "i) = " + complejo1.restar(complejo2) );
		System.out.println("(" + real1 + " + " + imaginaria1 + "i) * (" + real2 + " + " + imaginaria2 + "i) = " + complejo1.multiplicar(complejo2) );
		System.out.println("(" + real1 + " + " + imaginaria1 + "i) / (" + real2 + " + " + imaginaria2 + "i) = " + complejo1.dividir(complejo2) );
		System.out.println("|" + real1 + " + " + imaginaria1 + "i| = " + complejo1.valorAbsoluto() );
		System.out.println("La fase del primer complejo es " + complejo1.fase(real1, imaginaria1) + " radianes.");
		
	} //Cierre del main

} //Cierre del class