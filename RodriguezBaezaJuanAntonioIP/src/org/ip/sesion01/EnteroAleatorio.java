package org.ip.sesion01;

public class EnteroAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Haz un programa que muestre un entero pseudo-aleatorio entre -15 y 15. 
		 * Prueba distintas ejecuciones. Utiliza el método random() de la clase Math.
		 */
		/*
		 * La clase random devuelve un número pseudoaleatorio comprendido en el 
		 * intervalo [0.0, 1.0).
		 */
		//primero voy a crear un aleatorio que me sirva de interruptor
		float interruptor =  (float) Math.random();
		/*
		 * con el interruptor controlaré si el numero aleatorio 
		 * que voy a generar es positivo o negativo
		 */
		
		if (interruptor < 0.5 ){
			int numeroAleatorio = (int) (Math.random()*(-15));
			System.out.println("El número aleatorio generado con interruptor es " + numeroAleatorio );
		}else{
			int numeroAleatorio = (int) (Math.random()*(15));
			System.out.println("El número aleatorio generado con interruptor es " + numeroAleatorio );
		}
		
		/*
		 * existe una formula para conseguir generar un numero aleatorio entre dos numeros
		 * 
		 * 			int valorEntero = Math.floor(Math.random()*(N-M+1)+M);
		 * 
		 * siendo N > M.
		 * En nuestro caso tendriamos : 
		 * M = -15
		 * N = 15
		 * 			(15-(-15)+1)+(-15)
		 */
		int valorEntero = (int) Math.floor(Math.random()*(15+15+1)+(-15));
		System.out.println("El número aleatorio generado con la formula es " + valorEntero);
	}
}