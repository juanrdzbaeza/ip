package org.ip.sesion02;

import java.util.Scanner;

public class DiaJuliano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables necesarias
		int resultado = 0;
		int cuentaMes = 0;
		/*
		 * pedimos al usuario que introduzca el dia y el mes que desea verificar
		 */		
		int diaEntrada;
		System.out.println ("Introduzca el dia (entre 1 y 31)");
		@SuppressWarnings("resource")
		Scanner d			= new Scanner(System.in);
		diaEntrada			= d.nextInt();
		
		int mesEntrada;
		System.out.println ("Introduzca el mes (entre 1 y 12)");
		@SuppressWarnings("resource")
		Scanner m			= new Scanner(System.in);
		mesEntrada			= m.nextInt();
		/*
		 * lo primero es asegurarnos de que los datos introducidos pueden corresponder a una fecha
		 * valida, evitar que  que el dia sea menor que 1 o myor q 31 o 30 (28 en febrero) 
		 * y evitar que el mes sea menor que 1 o mayor que 12
		 */
		if ((mesEntrada == 2) && (diaEntrada < 1 || diaEntrada > 28)){
			System.out.println("no ha introducido una fecha correcta");
		//cierre para la condicion de febrero
			
		}else if ((diaEntrada < 1) || (diaEntrada > 31) || (mesEntrada < 1) || (mesEntrada > 12) || (mesEntrada == 4) && (diaEntrada > 30) || (mesEntrada == 6) && (diaEntrada > 30) || (mesEntrada == 9) && (diaEntrada > 30) || (mesEntrada == 11) && (diaEntrada > 30)){
			System.out.println("no ha introducido una fecha correcta");
		}else{
		
			/*
			 * Ahora realizamos una criva por el mes introducido para calcular el numero de días
			 * que llevamos hasta el mes anterior, para luego sumarle el numero de dias que corresponde
			 * a la variable dia
			 */
			int i;
			for (i=1; i<=mesEntrada ;i++ ) {
				switch (i) {
					case (1)://no contamos dias de enero
						cuentaMes = 0;
						break;
					case (2)://contamos los 31 dias de enero
						cuentaMes = 31;
						break;
					case(3)://contamos lo que este en la variable mes, le sumamos los dias de febrero
						cuentaMes = cuentaMes + 28;
						break;
					case(4)://contamos lo que este en la variable mes, le sumamos los dias de marzo
						cuentaMes = cuentaMes + 31;
						break;
					case(5)://contamos lo que este en la variable mes, le sumamos los dias de abril
						cuentaMes = cuentaMes + 30;
						break;
					case(6)://contamos lo que este en la variable mes, le sumamos los dias de mayo
						cuentaMes = cuentaMes + 31;
						break;
					case(7)://contamos lo que este en la variable mes, le sumamos los dias de junio
						cuentaMes = cuentaMes + 30;
						break;
					case(8)://contamos lo que este en la variable mes, le sumamos los dias de julio
						cuentaMes = cuentaMes + 31;
						break;
					case(9)://contamos lo que este en la variable mes, le sumamos los dias de agosto
						cuentaMes = cuentaMes + 31;
						break;
					case(10)://contamos lo que este en la variable mes, le sumamos los dias de septiembre
						cuentaMes = cuentaMes + 30;
						break;
					case(11)://contamos lo que este en la variable mes, le sumamos los dias de octubre
						cuentaMes = cuentaMes + 31;
						break;
					case(12)://contamos lo que este en la variable mes, le sumamos los dias de noviembre
						cuentaMes = cuentaMes + 30;
						break;
				}//cierre del switch
			}//cierre del for
			resultado = cuentaMes + diaEntrada;
			System.out.println("El dia juliano correspondiente al día " + diaEntrada + " del mes " +mesEntrada + " es " + resultado);
		}//cierre para la condicion del resto de meses
	}// cierre del public
}
