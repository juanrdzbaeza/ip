package org.ip.sesion06;

import java.util.Scanner;

public class TestMatematicas {
	
	public static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		System.out.println("Introduce un valor ENTERO para n, m, num1 y num2");
		int nint = entrada.nextInt();
		int m = entrada.nextInt();
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		
		System.out.println("\nIntroduce un valor REAL para n, num1, num2 y num3 ");
		double ndouble = entrada.nextDouble();
		double num1double = entrada.nextDouble();
		double num2double = entrada.nextDouble();
		double num3double = entrada.nextDouble();
		
		System.out.println("\nEl factorial iterativo de "+ nint + " es " + Matematicas.factorialIterativo(nint));  //FACTORIALES
		System.out.println("El factorial recursivo de "+ nint + " es " + Matematicas.factorialRecursivo(nint));
		
		Matematicas.generarConjeturaUlam(nint); //CONJETURA ULAM
		
		if (Matematicas.esPrimo(nint) == false)  //PRIMO
			System.out.println("\n\nEl n�mero " + nint + " no es un n�mero primo.");
		else
			System.out.println("\n\nEl n�mero" + nint + " es un n�mero primo.");
		
		if (Matematicas.esPerfecto(nint) == false) //PERFECTO
			System.out.println("El n�mero " + nint + " no es un n�mero perfecto.");
		else
			System.out.println("El n�mero " + nint + " es un n�mero perfecto.");
		
		System.out.println("\nEl valor absoluto del numero real " + ndouble + " es " + Matematicas.absoluto(ndouble));  //ABSOLUTOS
		System.out.println("El valor absoluto del numero entero " + nint + " es " + Matematicas.absoluto(nint));
		
		System.out.println("\nEl m�nimo de los n�meros enteros " + num1 + " y " + num2 + " es " + Matematicas.min(num1, num2));	 // MINIMOS
		System.out.println("El m�nimo de los n�meros reales " + num1double + " y " + num2double + " es " + Matematicas.min(num1double, num2double));
		System.out.println("El m�nimo de los n�meros reales " + num1double +" , " + num2double + " y " + num3double + " es " + Matematicas.min(num1double, num2double, num3double));
		
		System.out.println("\nEl m�ximo de los n�meros enteros " + num1 + " y " + num2 + " es " + Matematicas.max(num1, num2));	 // MAXIMOS
		System.out.println("El m�ximo de los n�meros reales " + num1double + " y " + num2double + " es " + Matematicas.max(num1double, num2double));
		System.out.println("El m�ximo de los n�meros reales " + num1double +" , " + num2double + " y " + num3double + " es " + Matematicas.max(num1double, num2double, num3double));
		
		int divisor, dividendo;
		if (nint > m){
			divisor = nint;
			dividendo = m;
		} else {
			divisor = m;
			dividendo = nint;
		}
			
		System.out.println("\nEl MCD (m. recursivo) de " + nint + " y " + m + " es " + Matematicas.mcdRecursivo(divisor, dividendo)); //MCD
		System.out.println("El MCD (m. Euclides) de " + nint + " y " + m + " es " + Matematicas.mcdEuclides(divisor, dividendo));
	}

}