package org.ip.sesion06;

public class Matematicas {
	
	public static long factorialIterativo(int n){
		long suma = 1;
		if(n == 0 || n == 1)
		return 1;
			 
		for(int i = 2; i <= n; i++)
			suma = suma * i;
		return suma;
	}
	
	public static long factorialRecursivo(int n){
		if(n == 0 || n == 1)
			return 1;
		else
			return n * factorialRecursivo(n-1);
	}
	
	public static void generarConjeturaUlam(int n){
		System.out.println("\nSucesión de Ulam generada a partir de " + n);
		
		do  {
			if (n % 2 == 0) {
				n = n/2;
				System.out.print(n + "\t");
			} else {
				n = (n*3)+1;
				System.out.print(n + "\t");	
			}
		} while (n != 1);
	}
	
	public static boolean esPrimo(int n){		
		if (n % 2 == 0) {
			if (n != 2)
				return false;
		} else {
			for (int divisor = 2; divisor < Math.sqrt(n); divisor = divisor + 2) {
				if (n % divisor == 0)
					return false;
			} 
		} 
		return true;
	}
	
	public static boolean esPerfecto(int n){
				int sumaNumeros = 0;
				
				for (int divisor = 1; divisor < n; divisor++) {
					if (n % divisor == 0)
						sumaNumeros = sumaNumeros + divisor;
				}
				
				if (sumaNumeros == n)
					return true;
				else
					return false;
	}
	
	public static double absoluto(double n){
		double absoluto = Math.abs(n);
		return absoluto;
	}
	
	public static int absoluto(int n){
		int absoluto = Math.abs(n);
		return absoluto;
	}
	
	public static int min(int num1, int num2){
		int min = Math.min(num1, num2);
		return min;
	}
	
	public static double min(double num1, double num2){
		double min = Math.min(num1, num2);
		return min;
	}
	
	public static double min(double num1, double num2, double num3){
		double min1 = Math.min(num1, num2);
		double min2 = Math.min(num2, num3);
		double min = Math.min(min1, min2);
		return min;
	}
	
	public static int max(int num1, int num2){
		int max = Math.max(num1, num2);
		return max;
	}
	
	public static double max(double num1, double num2){
		double max = Math.max(num1, num2);
		return max;
	}
	
	public static double max(double num1, double num2, double num3){
		double max1 = Math.max(num1, num2);
		double max2 = Math.max(num2, num3);
		double max = Math.max(max1, max2);
		return max;
	}
	
	public static int mcdRecursivo(int m, int n){		
		if (m % n == 0)
			return n;
		else
			return mcdRecursivo (n, m % n);
	}
	
	public static int mcdEuclides(int m, int n){
		int datoAuxiliar;
		
		if (m % n != 0) {
			while (m % n != 0) {
			datoAuxiliar = m;
			m = n;
			n = datoAuxiliar % n; 
			} 
			return n;
		} else
			return m / n;
	}
}
