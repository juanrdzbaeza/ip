package org.ip.sesion05;

public class Fraccion {
	private int 			numerador;
	private int 			denominador;
	private static int 		numFracciones = 0;
	
	public Fraccion(){
		super();
		numerador 	= 0;
		denominador	= 1;
	}
	
	public Fraccion(int numerador, int denominador){
		this.numerador		= numerador;
		this.denominador	= denominador;
		numFracciones++;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fraccion other = (Fraccion) obj;
		if (denominador != other.denominador)
			return false;
		if (numerador != other.numerador)
			return false;
		return true;
	}
	
	public int getNumerador(){
		return this.numerador;
	}
	
	public int getDenominador(){
		return this.denominador;
	}
	
	public static int getNumFracciones(){
		return numFracciones;
	}
	
	public String toString(){
		return  +numerador+"/"+denominador;
	}
	
	public Fraccion sumar(Fraccion b){
		int dividendo = 0, divisor = 0, almacen = 0, mcd = 0, mcm =0;
		Fraccion c = new Fraccion();
		if (b.denominador < this.denominador){
			dividendo = this.denominador;
			divisor = b.denominador;
		}else{
			dividendo = b.denominador;
			divisor = this.denominador;
		}//cierre del if
		while (dividendo%divisor!=0) {
			almacen=divisor;
			divisor=dividendo%divisor;
			dividendo=almacen;
			System.out.println(divisor);
		}//cierre del while
		mcd = divisor;
		mcm = (b.denominador * this.denominador)/mcd;
		c.numerador		= ((mcm*b.numerador)/b.denominador)+((mcm*this.numerador)/this.denominador);
		c.denominador 	= mcm;
		return c;
	}
	
	public static Fraccion sumar(Fraccion a, Fraccion b){
		int dividendo = 0, divisor = 0, almacen = 0, mcd = 0, mcm =0;
		Fraccion c = new Fraccion();
		if (b.denominador < a.denominador){
			dividendo = a.denominador;
			divisor = b.denominador;
		}else{
			dividendo = b.denominador;
			divisor = a.denominador;
		}//cierre del if
		while (dividendo%divisor!=0) {
			almacen=divisor;
			divisor=dividendo%divisor;
			dividendo=almacen;
			System.out.println(divisor);
		}//cierre del while
		mcd = divisor;
		mcm = (b.denominador * a.denominador)/mcd;
		c.numerador		= ((mcm*b.numerador)/b.denominador)+((mcm*a.numerador)/a.denominador);
		c.denominador 	= mcm;
		return c;
	}
	
	public Fraccion restar(Fraccion b){
		int dividendo = 0, divisor = 0, almacen = 0, mcd = 0, mcm =0;
		Fraccion c = new Fraccion();
		if (b.denominador < this.denominador){
			dividendo = this.denominador;
			divisor = b.denominador;
		}else{
			dividendo = b.denominador;
			divisor = this.denominador;
		}//cierre del if
		while (dividendo%divisor!=0) {
			almacen=divisor;
			divisor=dividendo%divisor;
			dividendo=almacen;
			System.out.println(divisor);
		}//cierre del while
		mcd = divisor;
		mcm = (b.denominador * this.denominador)/mcd;
		c.numerador		= ((mcm*b.numerador)/b.denominador)-((mcm*this.numerador)/this.denominador);
		c.denominador 	= mcm;
		return c;
	}
	
	public Fraccion producto(Fraccion b){
		Fraccion c 		= new Fraccion();
		c.numerador 	= this.numerador*b.numerador;
		c.denominador 	= this.denominador*b.denominador;
		return c;
	}
	
	public Fraccion cociente(Fraccion b){
		Fraccion c		= new Fraccion();
		c.numerador		= this.numerador*b.denominador;
		c.denominador	= this.denominador*b.numerador;
		return c;
	}
	
	public Fraccion inversa(){
		Fraccion c		= new Fraccion();
		c.numerador		= this.denominador;
		c.denominador	= this.numerador;
		return c;
	}
	
	private static int mcd(int a,int b){
		a = Math.abs(a);
		b = Math.abs(b);
		
		if( a % b == 0)
			return b;
		else
			return mcd(b,a%b);
	}
	
	public Fraccion simplificar(){
		Fraccion d = new Fraccion();
		int dividir = mcd(numerador, denominador);
		d.numerador = numerador / dividir;
		d.denominador = denominador / dividir;
		return d;
	}
	//************pie de la clase**************//
}

