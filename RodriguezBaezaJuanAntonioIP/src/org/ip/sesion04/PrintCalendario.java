package org.ip.sesion04;

import java.util.Scanner;

public class PrintCalendario {
	
	 //declaracion de los metodos
		
		//1) getNombreMes
	public static String getNombreMes(int mes){
		String nombreMes;
		nombreMes = null;
		switch (mes){
			case 1:
				nombreMes = "Enero";
				break;
			case 2:
				nombreMes = "Febrero";
				break;
			case 3:
				nombreMes = "Marzo";
				break;
			case 4:
				nombreMes = "Abril";
				break;
			case 5:
				nombreMes = "Mayo";
				break;
			case 6:
				nombreMes = "Junio";
				break;
			case 7:
				nombreMes = "Julio";
				break;
			case 8:
				nombreMes = "Agosto";
				break;
			case 9:
				nombreMes = "Septiembre";
				break;
			case 10:
				nombreMes = "Octubre";
				break;
			case 11:
				nombreMes = "Noviembre";
				break;
			case 12:
				nombreMes = "Diciembre";
				break;
		}//cierre del switch
		return nombreMes;
	}//cierre getNombreMes
		
		//2) getDiaInicio
	public static int getDiaInicio(int mes, int year){
		/*
		 * para calcular el dia de la semana en que empieza el mes del año dado voy 
		 * a usar el algoritmo de Zeller tomando dia = 1.
		 */
		int diaInicio = 0, dia = 1,m = 0, y = 0, a = 0;
		a = (14- mes)/12;
		y = year - a;
		m = mes + 12* a - 2;
		
		diaInicio = (dia + y + y/4 - y/100 + y/400 + (31*m)/12)%7;
		if (diaInicio==0)
			diaInicio=7;
		return diaInicio;
	}//cierre getDiaInicio
	
		//3) getNumeroTotalDeDiasDelMes
	public static int getNumeroTotalDeDiasDelMes(int mes, boolean bisiesto){
		int numeroDiasMes = 0;
		if (mes == 1 || mes == 3 ||  mes == 5 ||  mes == 7 ||  mes == 8 ||  mes == 10 ||  mes == 12){
			numeroDiasMes = 31;
		}else if (mes == 4 || mes == 6 ||  mes == 9 ||  mes == 11){
			numeroDiasMes = 30;
		}else{
			if (bisiesto){
				numeroDiasMes = 29;
			}else{
				numeroDiasMes = 28;
			}
		}
		return numeroDiasMes;
	}//cierre getDiaInicio
	
		//4) esBisiesto
	public static boolean esBisiesto(int year){
			return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
	}//cierre esBisiesto

	 //#@$%#@$%#@$%#@$%#@$%#@$%#@$%#@$%#@$%#@$%#@$%%#@$%#@$%#@$%#@$%#@$%\\
	//#@$%#@$%#@$%#@$%#@$%   comienzo del main   #@$%#@$%#@$%#@$%#@$%#@$%\\
   //#@$%#@$%#@$%#@$%#@$%#@$%#@$%#@$%#@$%#@$%#@$%#@$%%#@$%#@$%#@$%#@$%#@$%\\
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes = 0, year = 0, numeroDeDiasTotales = 1, diaInicio = 0, cuentaDias = 1, imprimeDias = 1;
		boolean esBisiesto = false;
	
		System.out.print("Introduzca un año completo (e.g., 2001): ");
		@SuppressWarnings("resource")
		Scanner y	= new Scanner(System.in);
		year		= y.nextInt();
		
		do{
			System.out.print("Introduzca un mes como un número entre 1 y 12: ");
			@SuppressWarnings("resource")
			Scanner m	= new Scanner(System.in);
			mes		= m.nextInt();
		}while(mes<1 || mes>12);
		//para saber si es bisiesto:
		esBisiesto = esBisiesto(year);
				
		//para saber el numero total de días del mes:
		numeroDeDiasTotales = getNumeroTotalDeDiasDelMes(mes, esBisiesto);
		
		//para saber el dia de la semana en que comienza el mes
		diaInicio  = getDiaInicio(mes, year);
		
		//comienzo a imprimir el calendario
		System.out.println("\t\t"+getNombreMes(mes)+" "+year);
		System.out.println("------------------------------------------------------");
		System.out.println("Lun\t Mar\t Mie\t Jue\t Vie\t Sab\t Dom");
		
		switch (diaInicio){
			case 1:
				//dia de inicio lunes
					for (int i = 0; i < 6; i++) {
						for (int j = 0; j < 7; j++) {
							if (cuentaDias<diaInicio){
								System.out.print("\t");
							}else if (imprimeDias<=numeroDeDiasTotales){
								System.out.print(imprimeDias+"\t");
								imprimeDias++;
							}//cierre del if nomero de dias totales
							cuentaDias++;
						}//cierre bucle interno matriz
						System.out.println("");
					}//cierre de matriz calendario
				break;
			case 2:
				//dia de inicio Martes
				for (int i = 0; i < 6; i++) {
					for (int j = 0; j < 7; j++) {
						if (cuentaDias<diaInicio){
							System.out.print("\t");
						}else if (imprimeDias<=numeroDeDiasTotales){
							System.out.print(imprimeDias+"\t");
							imprimeDias++;
						}//cierre del if nomero de dias totales
						cuentaDias++;
					}//cierre bucle interno matriz
					System.out.println("");
				}//cierre de matriz calendario
				break;
			case 3:
				//dia de inicio Miercoles
				for (int i = 0; i < 6; i++) {
					for (int j = 0; j < 7; j++) {
						if (cuentaDias<diaInicio){
							System.out.print("\t");
						}else if (imprimeDias<=numeroDeDiasTotales){
							System.out.print(imprimeDias+"\t");
							imprimeDias++;
						}//cierre del if nomero de dias totales
						cuentaDias++;
					}//cierre bucle interno matriz
					System.out.println("");
				}//cierre de matriz calendario
				break;
			case 4:
				//dia de inicio Jueves
				for (int i = 0; i < 6; i++) {
					for (int j = 0; j < 7; j++) {
						if (cuentaDias<diaInicio){
							System.out.print("\t");
						}else if (imprimeDias<=numeroDeDiasTotales){
							System.out.print(imprimeDias+"\t");
							imprimeDias++;
						}//cierre del if nomero de dias totales
						cuentaDias++;
					}//cierre bucle interno matriz
					System.out.println("");
				}//cierre de matriz calendario
				break;
			case 5:
				//dia de inicio Viernes
				for (int i = 0; i < 6; i++) {
					for (int j = 0; j < 7; j++) {
						if (cuentaDias<diaInicio){
							System.out.print("\t");
						}else if (imprimeDias<=numeroDeDiasTotales){
							System.out.print(imprimeDias+"\t");
							imprimeDias++;
						}//cierre del if nomero de dias totales
						cuentaDias++;
					}//cierre bucle interno matriz
					System.out.println("");
				}//cierre de matriz calendario
				break;
			case 6:
				//dia de inicio Sabado
				for (int i = 0; i < 6; i++) {
					for (int j = 0; j < 7; j++) {
						if (cuentaDias<diaInicio){
							System.out.print("\t");
						}else if (imprimeDias<=numeroDeDiasTotales){
							System.out.print(imprimeDias+"\t");
							imprimeDias++;
						}//cierre del if nomero de dias totales
						cuentaDias++;
					}//cierre bucle interno matriz
					System.out.println("");
				}//cierre de matriz calendario
				break;
			case 7:
				//dia de inicio Domingo
				for (int i = 0; i < 6; i++) {
					for (int j = 0; j < 7; j++) {
						if (cuentaDias<diaInicio){
							System.out.print("\t");
						}else if (imprimeDias<=numeroDeDiasTotales){
							System.out.print(imprimeDias+"\t");
							imprimeDias++;
						}//cierre del if nomero de dias totales
						cuentaDias++;
					}//cierre bucle interno matriz
					System.out.println("");
				}//cierre de matriz calendario
				break;
		}//cierre del switch

	}//cierre del main

}
