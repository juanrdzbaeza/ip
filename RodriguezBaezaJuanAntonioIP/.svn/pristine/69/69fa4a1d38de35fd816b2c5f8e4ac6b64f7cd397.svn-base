package org.ip.sesion07;

import java.util.Scanner;

public class ComprobarPalindromo1 {
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
		String s1 = s.toUpperCase();
		boolean palindromo = false;
		int inicio = 0;
		int fin = s1.length()-1;
		
		if(inicio == fin)
			palindromo = true;
		else{
			while(inicio < fin){
				if(s1.charAt(inicio)==s1.charAt(fin)){
					palindromo = true;
					inicio++;
					fin--;
				}else{
					inicio = fin;
					palindromo = false;
				}
			}
		}
		return palindromo;
	}

}
