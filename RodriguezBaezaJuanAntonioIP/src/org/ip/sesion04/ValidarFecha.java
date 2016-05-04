package org.ip.sesion04;

import java.util.Scanner;

public class ValidarFecha {
	
	public static boolean esFechaCorrecta(int dia, int mes, int year){
	
		if (mes < 1 || mes > 12){
			return false;
		}else{
			if (dia < 1 || dia > 31){
				return false;
			}else{
				if (((year%100==0)||(year%400==0))&&(dia>29)&&(mes==2)){
					return false;
				}else if (((year%100==0)||(year%400==0))&&(dia<=29)&&(mes==2)){
					return true;
				}else if ((dia<=31)&&((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12))){
					return true;
				}else if ((dia<=30)&&((mes==4)||(mes==6)||(mes==9)||(mes==11))){
					return true;
				}else {
					return false;
				}
			}//cierre del if interno
		}//cierre del if externo
	}//cierre del metodo

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia, mes, year;
		dia		= 0;
		mes		= 0;
		year	= 0;
		do{
			System.out.println("Introduzca el Día");
			@SuppressWarnings("resource")
			Scanner d	= new Scanner(System.in);
			dia		= d.nextInt();
			System.out.println("Introduzca el Mes");
			@SuppressWarnings("resource")
			Scanner m	= new Scanner(System.in);
			mes		= m.nextInt();
			System.out.println("Introduzca el Año");
			@SuppressWarnings("resource")
			Scanner y	= new Scanner(System.in);
			year		= y.nextInt();
			
			System.out.println(esFechaCorrecta(dia, mes, year));

			if (esFechaCorrecta(dia, mes, year)){
				System.out.println("FECHA CORRECTA");
			}else{
				System.out.println("FECHA INCORRECTA, INTRODUCE NUEVOS VALORES");
			}
		}while(!esFechaCorrecta(dia, mes, year));


	}

}
