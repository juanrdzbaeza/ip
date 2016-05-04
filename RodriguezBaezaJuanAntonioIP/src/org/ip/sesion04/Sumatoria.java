package org.ip.sesion04;

import java.util.Scanner;

public class Sumatoria {

	//Inicio el método sumaIterativa, donde uso un for para que sume los números que genere hasta llegar al dato dado.
		public static int sumaIterativa(int n){
			int resultado;
			for(resultado = 0; n != 0; n--)
				resultado = resultado + n;
			return resultado;
		}
		
		//Inicio el segundo método sumaDirecta, donde hago uso de la fórmula ofrecida para calcular el resultado y devolver el valor.
		public static int sumaDirecta(int n){
			int resultado = n*(n + 1)/2;
			return resultado;
		}
		
		//Inicio el tercer método sumaRecursiva, donde haciendo uso de la recursividad calculo el valor del resultado
		public static int sumaRecursiva(int n){
			if(n == 1)
				return 1;
			else
				return n + sumaRecursiva(n-1);
		}

		//En el método main introduzco un scanner para saber el valor de entrada y luego muestro 3 salidas diferentes, una para cada método.
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int datoEntrada;
			@SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);
			System.out.println("Introduzca el número de términos que desea sumar:");
			datoEntrada = entrada.nextInt();
			System.out.println("");
			
			System.out.println("La suma usando el método iterativo de los primeros "+ datoEntrada + " numeros es "+sumaIterativa(datoEntrada));
			System.out.println("La suma usando el método directo de los primeros "+ datoEntrada + " numeros es "+sumaDirecta(datoEntrada));
			System.out.println("La suma usando el método recursivo de los primeros "+ datoEntrada + " numeros es "+sumaRecursiva(datoEntrada));
		}

	} //Cierre del class
