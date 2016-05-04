package org.ip.sesion09;

public class TestOperacionesMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//matriz auxiliar C//
		int [][] matrizC;
		
		System.out.println("Lectura de la matriz A.");
		int matrizA[][] = EntradaSalidaArrays.leerEnteros2D();
		System.out.println("");

		System.out.println("Lectura de la matriz B.");
		int matrizB[][] = EntradaSalidaArrays.leerEnteros2D();
		System.out.println("");

		System.out.println("Matriz A:");
		EntradaSalidaArrays.mostrar2D(matrizA);
		System.out.println("");

		System.out.println("Matriz B:");
		EntradaSalidaArrays.mostrar2D(matrizB);
		System.out.println("");
		
		System.out.println("La matriz producto es:");
		matrizC = OperacionesMatricesCuadradas.producto(matrizA, matrizB);
		EntradaSalidaArrays.mostrar2D(matrizC);
		System.out.println("");

		System.out.println("la matriz suma es:");
		matrizC = OperacionesMatricesCuadradas.suma(matrizA, matrizB);
		EntradaSalidaArrays.mostrar2D(matrizC);
		System.out.println("");

		System.out.println("Matriz D:");
		int matrizD[][] = {{1,2,3},{2,1,7},{3,7,1}};
		EntradaSalidaArrays.mostrar2D(matrizD);
		if(OperacionesMatricesCuadradas.esSimetrica(matrizD)){
			System.out.println("Es simétrica");
		}else{
			System.out.println("No es simetrica");
		}
		System.out.println("");
		
		System.out.println("La traza de la matriz D es "+OperacionesMatricesCuadradas.traza(matrizD));
		System.out.println("");
		
		System.out.println("La matriz A multiplicada por 3 es:");
		matrizC = OperacionesMatricesCuadradas.producto(matrizA, 3);
		EntradaSalidaArrays.mostrar2D(matrizC);
		System.out.println("");

		System.out.println("Vamos a generar una matriz con valores aleatorios.");
		matrizC = EntradaSalidaArrays.inicializarEnteros2D();
		EntradaSalidaArrays.mostrar2D(matrizC);
		if(OperacionesMatricesCuadradas.esSimetrica(matrizC)){
			System.out.println("Es simétrica");
		}else{
			System.out.println("No es simetrica");
		}
		System.out.println("");

		
	}//cierre del main
}//cierre del public
