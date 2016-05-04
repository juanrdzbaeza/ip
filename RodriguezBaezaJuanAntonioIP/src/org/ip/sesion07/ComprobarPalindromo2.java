package org.ip.sesion07;

import java.util.Scanner;


public class ComprobarPalindromo2 {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palabra;
		input = new Scanner(System.in);
		System.out.println("Introduzca una cadena para saber si es un palindromo:");
		palabra = input.nextLine();
		
		if(esPalindromo(palabra) == true)
			System.out.println("La cadena "+ palabra+ " es un palindromo" );
		else
			System.out.println("La cadena "+ palabra+ " no es un palindromo" );
	}
	
	public static boolean esPalindromo(String s){
		String s1 = s.toUpperCase();
		int inicio = 0;
		int fin = s1.length()-1;
		char espacio = ' ';
		
		if(inicio == fin)
			return true;
		else{
			while(inicio < fin){
				while (s1.charAt(inicio) == espacio)   
					inicio++;
				while (s1.charAt(fin) == espacio)
					fin--;

				if (s1.charAt(inicio) != s1.charAt(fin))
					return false;
				inicio++;
				fin--;
			}
		}
		return true;
	}

}
