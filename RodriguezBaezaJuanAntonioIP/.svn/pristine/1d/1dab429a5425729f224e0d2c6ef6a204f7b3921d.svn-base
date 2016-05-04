package org.ip.sesion10;

import java.util.Arrays;
import java.util.Scanner;

import org.ip.sesion09.EntradaSalidaArrays;

public class TestBusqueda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * busqueda secuencial
		 */
		int [] a = EntradaSalidaArrays.inicializarEnteros1D();
		int clave, posicion;
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println("");
		System.out.println ("Introduzca el valor a buscar");
		@SuppressWarnings("resource")
		Scanner cod		= new Scanner(System.in);
		clave			= cod.nextInt();
		
		posicion = BusquedaArray.busquedaSecuencial(a, clave);
		
		if (posicion != -1)
			System.out.println("Valor "+clave+" encontrado en la posición "+posicion );
		else
			System.out.println("Valor "+clave+" no encontrado");
		
		/*
		 * busqueda binaria
		 */
		//ordenamos el array
		Arrays.sort(a);
		System.out.println("Array ordenado");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println("");
		posicion = BusquedaArray.busquedaBinaria(a, clave);
		System.out.println ("Introduzca otro valor a buscar");
		@SuppressWarnings("resource")
		Scanner cod1	= new Scanner(System.in);
		clave			= cod1.nextInt();
		if (posicion != -1)
			System.out.println("Valor "+clave+" encontrado en la posición "+posicion );
		else
			System.out.println("Valor "+clave+" no encontrado");		
	}//cierre del main
}//cierre del public
