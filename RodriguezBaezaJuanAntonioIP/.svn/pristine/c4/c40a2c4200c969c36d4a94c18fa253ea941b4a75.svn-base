package org.ip.sesion07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CambioDeBase {
	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 0;
		System.out.println("PROGRAMA QUE PERMITE CONVERTIR UN NUMERO DECIMAL A HEXADECIMAL, OCTAL O BINARIO Y VICEVERSA");
		while(cont == 0){
		System.out.println();
		System.out.println("\t1.- Convertir de decimal a hexadecimal");
		System.out.println("\t2.- Convertir de decimal a octal");
		System.out.println("\t3.- Convertir de decimal a binario");
		System.out.println("\t4.- Convertir de hexadecimal a decimal");
		System.out.println("\t5.- Convertir de octal a decimal");
		System.out.println("\t6.- Convertir de binario a decimal");
		System.out.println("\t0.- TERMINAR");
		System.out.println();
		menu();
		}// Cierre del while
	
	}// Cierre del main

	public static int leerOpcion(){
		boolean error = false;
		int dato = 0, cont = 0;
		input = new Scanner(System.in);
		
		while(error == false){
			try{
				if(cont == 0){
				System.out.print("Elija opci—n deseada => ");
				dato = input.nextInt();
				}else{
					dato = input.nextInt();
				}
				cont++;
				
				if(dato < 0 || dato > 6){
					error = false;
					System.out.println("Opci—n fuera de rango.");
					System.out.print("Introduzca un valor entero entre 0 y 6 para elegir la opci—n => ");
				} else{
					error = true;
				}
			}catch (InputMismatchException e) {
				System.out.print("Incorrecto, introduzca un valor entero para elegir la opci—n => ");
				input.nextLine();
			}
		}//cierre del while
		return dato;
	}//cierre del metodo
	
	public static void menu(){
		boolean error = false;
		int dato = leerOpcion();
		
		switch(dato){
		case 0:
			System.out.println();
			System.out.println("HA FINALIZADO EL PROGRAMA");
			System.exit(0);
		case 1:
			while(error == false){
				try{
					System.out.print("Introduzca el numero decimal => ");
					dato = input.nextInt();
					String hex = Integer.toHexString(dato);
					System.out.println("El nœmero "+ dato+ " en hexadecimal es "+ hex);
					error = true;
				}catch(InputMismatchException e){
					System.out.print("No es un nœmero decimal. ");
					input.nextLine();
				}
			}
			break;
			
		case 2:
			while(error == false){
				try{
					System.out.print("Introduzca el numero decimal => ");
					dato = input.nextInt();
					String octal = Integer.toOctalString(dato);
					System.out.println("El nœmero "+ dato+ " en octal es "+ octal);
					error = true;
				}catch(InputMismatchException e){
					System.out.print("No es un nœmero decimal. ");
					input.nextLine();
				}
			}
			break;
		case 3:
			while(error == false){
				try{
					System.out.print("Introduzca el numero decimal => ");
					dato = input.nextInt();
					String bin = Integer.toBinaryString(dato);	
					System.out.println("El nœmero "+ dato+ " en binario es "+ bin);
					error = true;
				}catch(InputMismatchException e){
					System.out.print("No es un nœmero decimal. ");
					input.nextLine();
				}
			}
			break;
		case 4:
			while(error == false){
				try{
					System.out.print("Introduzca un numero hexadecimal => ");
					String hex1 = input.next();
					int dec = Integer.parseInt(hex1, 16);
					System.out.println("El nœmero "+ hex1+ " en decimal es "+ dec);
					error = true;
				}catch(InputMismatchException e){
					System.out.print("No es un nœmero hexadecimal. ");
					input.nextLine();
				}
			}
			break;
		case 5:
			while(error = false){
				try{
					System.out.print("Introduzca en numero octal => ");
					String octal1 = input.next();
					int dec1 = Integer.parseInt(octal1, 8); 
					System.out.println("El nœmero "+ octal1+ " en decimal es "+ dec1);
					error = true;
				}catch(InputMismatchException e){
					System.out.print("No es un nœmero octal. ");
					input.nextLine();
				}
			}
			break;
		case 6:
			while(error = false){
				try{
					System.out.println("Introduzca el numero binario => ");
					String bin1 = input.next();
					int dec2 = Integer.parseInt(bin1, 2);
					System.out.println("El nœmero "+ bin1+ " en decimal es "+ dec2);
					error = true;
				}catch(InputMismatchException e){
					System.out.print("No es un nœmero binario. ");
					input.nextLine();
				}
			}
			break;
		}//Cierre del switch
	}//Cierre del metodo
}//Cierre de la clase
