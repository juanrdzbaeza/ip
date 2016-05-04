package org.ip.sesion04;

public class GenerarPrimos {
	/*
	 * metodo esPrimo:
	 */
	public static int esPrimo(int comprobador) {
		//inicializacion de variables del metodo
		int divisor = 2, primo = 1;	
		if (comprobador%2 != 0){
			while ((primo == 1) && divisor < Math.sqrt(comprobador)){
				if (divisor%2 != 0)
					if ( comprobador% divisor == 0)
						primo = 0;
					divisor++;
			}//cierre del while
		}else{
			while ((primo == 1) && divisor < Math.sqrt(comprobador)){
				if ( comprobador% divisor == 0)
					primo = 0;
				divisor++;
			}//cierre del while
		}
		return primo;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//definicion de variables
		int contador, comprobador;
		
		//inicializacion de variables
		contador 	= 1;
		comprobador	= 2;
		
		System.out.println("los 50 primeros números primos son:");
		while (contador<=50){
			if (esPrimo(comprobador) == 1) {
				if (contador%10==0){
					System.out.println(comprobador+" ");
				}else{
					System.out.print(comprobador+"\t");
				}
				contador++;
			}
			comprobador++;
		}

	}//cierre del main

}//cierre del public
