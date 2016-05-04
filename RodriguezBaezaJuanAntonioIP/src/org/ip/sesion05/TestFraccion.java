package org.ip.sesion05;

public class TestFraccion {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraccion Q1 = new Fraccion(1,5);
		Fraccion Q2 = new Fraccion(4,5);
		Fraccion Q3 = new Fraccion(-11,22);
		
		int simplificacion	= 0;
		
		
		System.out.println("LAS FRACCIONES CREADAS SON");
		System.out.println("");
		System.out.println("PRIMERA FRACCIÓN=> "+Q1.toString());
		System.out.println("SEGUNDA FRACCIÓN=> "+Q2.toString());
		System.out.println("TERCERA FRACCIÓN=> "+Q3.toString());
		System.out.println("");
		System.out.println("El número de fracciones creadas es "+Fraccion.getNumFracciones());
		if (Q1.equals(Q2)){
			System.out.println("La primera fraccion ES IGUAL a la segunda");
		}else{
			System.out.println("La primera fraccion NO ES IGUAL a la segunda");
		}
		System.out.println("el numerador de la tercera fraccion es "+Q3.getNumerador());
		System.out.println("el denominador de la primera fraccion es "+Q1.getDenominador());
		System.out.println("La suma, utilizando el método de clase de "+Q1.toString()+" + "+Q2.toString()+" es "+Fraccion.sumar(Q1,Q2));
		if (Q1.sumar(Q2).getNumerador() == Q1.sumar(Q2).getDenominador()){
			simplificacion = 1;
		}else if (Q1.sumar(Q2).getNumerador()%Q1.sumar(Q2).getDenominador()==0){
			simplificacion = Q1.sumar(Q2).getNumerador()%Q1.sumar(Q2).getNumerador();
		}else{
			simplificacion = (Integer) null;
		}
		System.out.println("La suma, utilizando el método de objeto de "+Q1.toString()+" + "+Q2.toString()+" es "+Q1.sumar(Q2)+" simplificado "+simplificacion);
		System.out.println("La resta de "+Q1.toString()+" - "+Q2.toString()+" es "+Q1.restar(Q2));
		System.out.println("El producto de "+Q1.toString()+" X "+Q2.toString()+" es "+Q1.producto(Q2));
		System.out.println("El cociente de "+Q1.toString()+" X "+Q3.toString()+" es "+Q1.cociente(Q3));
		if (Q1.inversa().getDenominador() == 1){
			System.out.println("La inversa de la primera fraccion "+Q1.toString()+" es "+Q1.inversa().getNumerador());
		}else if (Q1.inversa().getDenominador() == Q1.inversa().getNumerador()){
			System.out.println("La inversa de la primera fraccion "+Q1.toString()+" es "+1);
		}else{
			System.out.println("La inversa de la primera fraccion "+Q1.toString()+" es "+Q1.inversa());
		}
		System.out.println("La fraccion "+Q3.toString()+" simplificada es "+Q3.simplificar());
		
		
		System.out.println("El número de fracciones creadas es "+Fraccion.getNumFracciones());

		

	}

}
