package org.ip.sesion07;

import java.util.Scanner;

public class ComprobarPalindromo3 {
	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra;
		input = new Scanner(System.in);
		System.out.println("Introduzca una palabra para saber si es un palindromo:");
		palabra = input.nextLine();
		
		if(esPalindromo(palabra) == true)
			System.out.println("La palabra "+ palabra+ " es un palindromo" );
		else
			System.out.println("La palabra "+ palabra+ " no es un palindromo" );

	}
	public static boolean esPalindromo(String s){
		boolean palindromo = false;
		StringBuffer s1 = new StringBuffer(s);
		String s2 = new String("");
		s2 = s1.reverse().substring(0);
		if(s.equals(s2))
			palindromo = true;
		return palindromo;
	}

}
