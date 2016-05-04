package org.ip.sesion07;

import java.math.BigInteger;
import java.util.Scanner;

public class NumerosDivisibles {
	
		public static boolean esDivisible(BigInteger enteroGrande, String divisor) {
			return enteroGrande.remainder(new BigInteger(divisor)).equals(BigInteger.ZERO);
		} 
		
		public static void main(String[] args) {
			BigInteger enteroGrande = new BigInteger (Long.MAX_VALUE + "");
			int repeticiones = 5;
			
			String divisor1, divisor2;
			
			@SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);
			System.out.println("Introduce el primer divisor:");
			divisor1 = entrada.next();
			System.out.println("Introduce el segundo divisor:");
			divisor2 = entrada.next();
			
			System.out.println("\nLos " + repeticiones + " primeros nœmeros mayores de " + enteroGrande + " divisibles entre "
					+ divisor1 + " y " + divisor2 + " son:\n");
			
			int i = 0;
			while (i < repeticiones) {
				if (esDivisible(enteroGrande, divisor1) && esDivisible(enteroGrande, divisor2) ) {
					System.out.println(enteroGrande);
					i++;
				} else
					enteroGrande = enteroGrande.add(BigInteger.ONE);
			} 
		}
}