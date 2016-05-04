package org.ip.sesion06;

public class Fraccion implements Comparable<Fraccion>{

	private int numerador;
	private int denominador;
	private static int numFracciones = 0;
	
	
	public Fraccion() {
		this.numerador = 0;
		this.denominador = 1;
		numFracciones++;
	}
	
	
	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
		numFracciones++;
	}

	
	@Override
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

	
	public int getNumerador() {
		return numerador;
	}

	
	public int getDenominador() {
		return denominador;
	}

	
	public static int getNumFracciones() {
		return numFracciones;
	}

	
	@Override
	public String toString() {
		if (denominador == 1)
			return numerador + "";
		else
			return numerador + "/" + denominador;
	}

	
	public Fraccion sumar(Fraccion b) {
		int numerador = this.numerador * b.getDenominador() + this.denominador * b.getNumerador();
		int denominador = this.denominador * b.getDenominador();
		return new Fraccion(numerador, denominador);
	}
	
	
	public static Fraccion sumar(Fraccion a, Fraccion b) {
		int numerador = a.getNumerador() * b.getDenominador() + a.getDenominador() * b.getNumerador();
		int denominador = a.getDenominador() * b.getDenominador();
		return new Fraccion(numerador, denominador);
	}
	
	
	public Fraccion restar(Fraccion b) {
		int numerador = this.numerador * b.getDenominador() - this.denominador * b.getNumerador();
		int denominador = this.denominador * b.getDenominador();
		return new Fraccion(numerador, denominador);
	}
	
	
	public Fraccion multiplicar(Fraccion b) {
		int numerador = this.numerador * b.getNumerador();
		int denominador = this.denominador * b.getDenominador();
		return new Fraccion(numerador, denominador);
	}
	
	
	public Fraccion dividir(Fraccion b) {
		int numerador = this.numerador * b.getDenominador();
		int denominador = this.denominador * b.getNumerador();
		return new Fraccion(numerador, denominador);
	}
	
	
	public Fraccion inversa() {
		int numerador = this.denominador;
		int denominador = this.numerador;
		return new Fraccion(numerador, denominador);
	}
	
	private static int mcd (int u, int v) {
		u = Math.abs(u); //Math.abs sirve para hacer el valor absoluto del dato dado.
		v = Math.abs(v);
		
		if (v == 0)
			return u;
		
		int r;
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}
	
	public Fraccion simplificar() {
		int dividir = mcd(numerador, denominador);
		numerador = numerador / dividir;
		denominador = denominador / dividir;
		return this;
	}

	@Override
	public int compareTo(Fraccion o) { 
		Fraccion otraFraccion = (Fraccion) o; //El objecto es una Fraccion llamada otraFraccion.
		double valorFraccion = (double)this.numerador / (double)this.denominador;
		double valorOtraFraccion = (double)otraFraccion.getNumerador() / (double)otraFraccion.getDenominador();
		
		if (valorFraccion > valorOtraFraccion)
			return 1;
		else if (valorFraccion < valorOtraFraccion)
			return -1;
		else
			return 0;
	}

}
