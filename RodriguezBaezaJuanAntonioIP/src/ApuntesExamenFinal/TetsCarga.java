package ApuntesExamenFinal;

public class TetsCarga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carga q1	= new Carga (10e-12, 0.05, 0.01);
		Carga q2	= new Carga (-20e-12, 0.05, 0.04);
		Carga q3	= new Carga (10e-12, 0.01, 0.04);
		Carga q4	= new Carga (10e-28, 0.01, 0.01);
		Carga punto	= new Carga (0, 0.01, 0.01);
		
		double resultadoPotencial = punto.potencialEn(q1)+punto.potencialEn(q2)+punto.potencialEn(q3);
		
		System.out.println("El potencial creado por las cargas \n\t"+q1.toString()+"\n\t"+q2.toString()+"\n\t"+q3.toString()+"\nen el punto\t"+punto.toString()+"\nes\t "+resultadoPotencial+"V.");
		
		if (q1.equals(q2))
			System.out.println("SON IGUALES");
		else 
			System.out.println("distintas");
		
		if (q1.compareTo(q3) == 0) {
			System.out.println("Las cargas "+q1+" y "+q3+" son iguales");
		} else if (q1.compareTo(q2) == 1){
			System.out.println("La carga "+q3+" es mayor que la carga"+q1);
		}else
			System.out.println("La carga "+q1+" es mayor que la carga"+q3);
		
		System.out.println("El potencial de la carga"+q4+" en el punto "+ punto+" es "+q4.potencialEn(punto));
		
	}//cierre del main

}//cierre de la clase
