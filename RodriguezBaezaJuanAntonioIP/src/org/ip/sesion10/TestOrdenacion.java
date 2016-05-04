package org.ip.sesion10;

import java.util.Arrays;
import org.ip.sesion06.Fraccion;

public class TestOrdenacion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrayEnteros[]				= {20, 6, -30, 8, 1};
		Integer arrayObjetosInteguer[]	= {new Integer(55), new Integer(44), new Integer(22), new Integer(33)};
		Fraccion arrayDeFracciones []	= {new Fraccion(-2,5), new Fraccion(8,7), new Fraccion(-3,2), new Fraccion(9,3)};
		String arrayDeNombres[]			= {"Pardo", "Perez", "Aitor", "Baeza", "Jorge"};
		
		System.out.println("Array de enteros generado:");
		System.out.println(Arrays.toString(arrayEnteros));
		System.out.println();
		
		System.out.println("Array de objetos enteros generado");
		System.out.println(Arrays.toString(arrayObjetosInteguer));
		System.out.println();
		
		System.out.println("Array de fracciones generado");
		System.out.println(Arrays.toString(arrayDeFracciones));
		System.out.println();
		
		System.out.println("Array de string generado");
		System.out.println(Arrays.toString(arrayDeNombres));
		System.out.println();
		
		System.out.println("Array de enteros ordenado por el metodo de la burbuja");
		Ordenacion.burbuja(arrayEnteros);
		System.out.println(Arrays.toString(arrayEnteros));
		System.out.println();
		
		System.out.println("Array de objetos enteros ordenados por el metodo de la burbuja mejorado");
		Ordenacion.burbujaMejorada(arrayObjetosInteguer);
		System.out.println(Arrays.toString(arrayObjetosInteguer));
		System.out.println();
		
		System.out.println("Array de fracciones ordenado por el metodo de insercion");
		Ordenacion.insercion(arrayDeFracciones);
		System.out.println(Arrays.toString(arrayDeFracciones));
		System.out.println();
		
		System.out.println("Arraay de string ordenado por el metodo de seleccion");
		Ordenacion.seleccion(arrayDeNombres);
		System.out.println(Arrays.toString(arrayDeNombres));
		
	}//cierre del main
}//cierre del public
