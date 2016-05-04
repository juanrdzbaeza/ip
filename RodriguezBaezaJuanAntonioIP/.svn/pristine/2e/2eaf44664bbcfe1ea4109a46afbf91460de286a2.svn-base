package org.ip.sesion06;

public class Complejo {

	private double real;
	private double imaginaria;
	
	public Complejo(double real, double imaginaria) {
		super();
		this.real = real;
		this.imaginaria = imaginaria;
	}

	public Complejo(double real) {
		super();
		this.real = real;
	}

	public double getReal() {
		return real;
	}
	public void setReal(Complejo b, double r){
		this.real = r;
	}

	public double getImaginaria() {
		return imaginaria;
	}
	
	public void setImaginaria(Complejo b, double i){
		this.imaginaria = i;
	}

	@Override
	public String toString() {
		if (this.imaginaria 	== 0) return this.real + "";
		if (this.real 			== 0.0) return this.imaginaria + "i";
		if (this.imaginaria 	< 0.0) return this.real + "-" + Math.abs(this.imaginaria) + "i";
		return this.real + "+" + this.imaginaria + "i";
	}
	
	public Complejo sumar(Complejo b) {
		double parteReal		= this.real + b.getReal();
		double parteImaginaria	= this.imaginaria + b.getImaginaria();
		return new Complejo(parteReal, parteImaginaria);
	}
	
	public Complejo restar(Complejo b) {
		double parteReal		= this.real - b.getReal();
		double parteImaginaria	= this.imaginaria - b.getImaginaria();
		return new Complejo(parteReal, parteImaginaria);
	}
	
	public Complejo multiplicar(Complejo b) {
		double parteReal		= this.real * b.getReal() - this.imaginaria * b.getImaginaria();
		double parteImaginaria	= this.imaginaria * b.getReal() + this.real * b.getImaginaria();
		return new Complejo(parteReal, parteImaginaria);
	}
	
	public Complejo dividir(Complejo b) {
		double parteReal		= (this.real * b.getReal() + this.imaginaria * b.getImaginaria()) / (Math.pow(b.getReal(), 2) + Math.pow(b.getImaginaria(), 2));
		double parteImaginaria	= (this.imaginaria * b.getReal() - this.real * b.getImaginaria()) / (Math.pow(b.getReal(), 2) + Math.pow(b.getImaginaria(), 2));
		return new Complejo (parteReal, parteImaginaria);
	}
	
	public Complejo valorAbsoluto () { //Se podría usar Math.sqrt(Math.pow(this.real, 2));  o   Math.abs(parteReal);
		double parteReal		= Math.sqrt(Math.pow(this.real, 2));
		double parteImaginaria	= Math.sqrt(Math.pow(this.imaginaria, 2));
		return new Complejo (parteReal, parteImaginaria);
	}
	
	
	public double fase(double x, double y) {
		double fase	= Math.atan(y/x);
		return fase;
	}
	
}
