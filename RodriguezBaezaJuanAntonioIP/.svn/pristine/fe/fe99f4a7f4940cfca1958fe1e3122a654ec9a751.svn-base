package org.ip.sesion08;

public class EstadisticaArrays {
	//@#$%@#$%@#$%@#$%@#$% MÁXIMO @#$%@#$%@#$%@#$%@#$%
	public static double max(double [] a){
		double max = a[0];
		
		for(int i = 1; i < a.length; i++){
			if(a[i] > max)
				max = a[i];
		}
		return max;
	}

	public static double max(double [] a, int inferior, int superior){
		if(inferior < 0 || superior >= a.length || inferior > superior)
			throw new RuntimeException("Indices del subarray fuera de rango");
		double max = a[inferior];
		for(int i = inferior; i <= superior; i++)
			if(a[i] > max)
				max = a[i];
		return max;
	}
	
	public static int max(int [] a){
		int max = a[0];
		
		for(int i = 1; i < a.length; i++){
			if(a[i] > max)
				max = a[i];
		}
		return max;
	}
	
	public static int max(int [] a, int inferior, int superior){
		if(inferior < 0 || superior >= a.length || inferior > superior)
			throw new RuntimeException("Indices del subarray fuera de rango");
		int max = a[inferior];
		for(int i = inferior; i <= superior; i++)
			if(a[i] > max)
				max = a[i];
		return max;
	}
	//@#$%@#$%@#$%@#$%@#$% CIERR DEL MÁXIMO @#$%@#$%@#$%@#$%@#$%
	//@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%
	//@#$%@#$%@#$%@#$%@#$% MÍNIMO @#$%@#$%@#$%@#$%@#$%@#$%@#$%@

	public static double min(double [] a){
		double min = a[0];
		
		for(int i = 1; i < a.length; i++){
			if(a[i] < min)
				min = a[i];
		}
		return min;
	}

	public static double min(double [] a, int inferior, int superior){
		if(inferior < 0 || superior >= a.length || inferior > superior)
			throw new RuntimeException("Indices del subarray fuera de rango");
		double min = a[inferior];
		for(int i = inferior; i <= superior; i++)
			if(a[i] < min)
				min = a[i];
		return min;
	}
	
	public static int min(int [] a){
		int min = a[0];
		
		for(int i = 1; i < a.length; i++){
			if(a[i] < min)
				min = a[i];
		}
		return min;
	}
	
	public static int min(int [] a, int inferior, int superior){
		if(inferior < 0 || superior >= a.length || inferior > superior)
			throw new RuntimeException("Indices del subarray fuera de rango");
		int min = a[inferior];
		for(int i = inferior; i <= superior; i++)
			if(a[i] < min)
				min = a[i];
		return min;
	}
	//@#$%@#$%@#$%@#$%@#$% CIERR DEL MÍNIMO @#$%@#$%@#$%@#$%@#$%
	//@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%
	//@#$%@#$%@#$%@#$%@#$% MEDIA @#$%@#$%@#$%@#$%@#$%@#$%@#$%@	
	public static double media(double [] a){
		double sumatoria = 0;
		for (int i = 0; i < a.length; i++) {
			sumatoria += a[i];
		}
		return sumatoria/a.length;
	}
	
	public static double media(double [] a, int inferior, int superior){
		double sumatoria = 0;
		if(inferior < 0 || superior >= a.length || inferior > superior)
			throw new RuntimeException("Indices del subarray fuera de rango");
		for (int i = inferior; i < superior; i++) {
			sumatoria += a[i];
		}
		return sumatoria/(superior-inferior);
	}
	
	public static int media(int [] a){
		int sumatoria = 0;
		for (int i = 0; i < a.length; i++) {
			sumatoria += a[i];
		}
		return sumatoria/a.length;
	}
	
	public static int media(int [] a, int inferior, int superior){
		int sumatoria = 0;
		if(inferior < 0 || superior >= a.length || inferior > superior)
			throw new RuntimeException("Indices del subarray fuera de rango");
		for (int i = inferior; i < superior; i++) {
			sumatoria += a[i];
		}
		return sumatoria/(superior-inferior);
	}
	//@#$%@#$%@#$%@#$%@#$% CIERR DEL MEDIA @#$%@#$%@#$%@#$%@#$%
	//@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%
	//@#$%@#$%@#$%@#$%@#$% VARIANZA @#$%@#$%@#$%@#$%@#$%@#$%@#$%@
	public static double var(double [] a){ 	// ........................................ VARIANZAS
		double media = media(a);
		double varianza = 0.0;
		for (int i = 0; i < a.length; i++) {
			varianza += ((a[i] - media)*(a[i]-media))/(a.length-1);
		}
		return varianza;
	}

	
	public static double var(double [] a, int inferior, int superior){
		if (inferior < 0 || superior > a.length || inferior > superior)
			throw new RuntimeException("Los indices del subarray están fuera de rango.");
		double media = media(a, inferior, superior);
		double varianza = 0.0;
		for (int i = inferior; i <= superior; i++) {
			varianza += ((a[i-1] - media)*(a[i-1]-media))/(superior-1);
		}
		return varianza;
	}
	
	
	public static double var(int [] a){
		double media = media(a);
		double varianza = 0.0;
		for (int i = 0; i < a.length; i++) {
			varianza += ((a[i] - media)*(a[i]-media))/(a.length-1);
		}
		return varianza;
	}
	
	
	public static double var(int [] a, int inferior, int superior){
		if (inferior < 0 || superior > a.length || inferior > superior)
			throw new RuntimeException("Los indices del subarray están fuera de rango.");
		double media = media(a, inferior, superior);
		double vaianza = 0.0;
		for (int i = inferior; i <= superior; i++) {
			vaianza += ((a[i-1] - media)*(a[i-1]-media))/(superior-1);
		}
		return vaianza;
	}
	//@#$%@#$%@#$%@#$%@#$% CIERR DEL VARIANZA @#$%@#$%@#$%@#$%@#$%
	//@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%@#$%
	//@#$%@#$%@#$%@#$%@#$% DESVIACION ESTANDAR @#$%@#$%@#$%@#$%@#$%@#$%@#$%@
	public static double stdDev(double [] a){
		return Math.sqrt(media(a));
	}
		
	public static double stdDev(double [] a, int inferior, int superior){
		return Math.sqrt(var(a, inferior, superior));
	}
		
	public static double stdDev(int [] a){
		return Math.sqrt(var(a));
	}
	
	public static double stdDev(int [] a, int inferior, int superior){
		return Math.sqrt(var(a, inferior, superior));
	}
	//@#$%@#$%@#$%@#$%@#$% CIERR DEL DESVIACION ESTANDAR @#$%@#$%@#$%@#$%@#$%
}//fin de la clase
