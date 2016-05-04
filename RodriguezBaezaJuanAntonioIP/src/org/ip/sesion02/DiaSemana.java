package org.ip.sesion02;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * pedimos al usuario que introduzca el año, el mes y el día que desee comprobar
		 */
		int year, mes, dia;
		int y0, m0, d0, x;
		System.out.println ("introduzca el año:");
		@SuppressWarnings("resource")
		Scanner a	= new Scanner(System.in);
		year		= a.nextInt();
		
		System.out.println ("introduzca el mes:");
		@SuppressWarnings("resource")
		Scanner m	= new Scanner(System.in);
		mes			= m.nextInt();
		
		System.out.println ("introduzca el dia:");
		@SuppressWarnings("resource")
		Scanner d	= new Scanner(System.in);
		dia			= d.nextInt();
		
		y0	= year - (14 - mes) / 12;
		x	= y0 + y0/4 - y0/100 + y0/400;
		m0	= mes + 12 * ((14 - mes) / 12) - 2;
		d0	= (dia + x + (31 * m0) / 12) % 7;
		
		System.out.println("El dia de la semana correspondiente al "+dia+"/"+mes+"/"+year+" es:");
		switch (d0){
		case 0:
			System.out.println("Domingo");
			break;
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		}//cierre del switch

	}//cierre del main

}//cierre del public
