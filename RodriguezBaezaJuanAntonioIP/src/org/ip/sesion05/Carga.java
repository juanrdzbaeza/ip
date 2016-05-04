package org.ip.sesion05;

public class Carga {

private double rx, ry, q; 
	
	
	public Carga(){ 
		super();
		rx = 0.0;
		ry = 0.0;
		q = 0.0;
	}

	public Carga(double z, double x, double y){ 
		rx = x;
		ry = y;
		q = z;
	}
	
	public double potencialEn(Carga y){ 
		double potencial, r;
		r = this.distancia(y);
		potencial = 8.99e9*(y.q/r);
		return potencial;
	}
	
	private double distancia(Carga y){ 
		double dis = Math.sqrt(Math.pow(y.rx-rx,2)+Math.pow(y.ry-ry, 2));
		return dis;
		
	}
	
	public String toString(){ 
		if(q == 0)
			return "("+ rx+ ", "+ ry+  ")";
		else
			return q+ " en ("+ rx+ ", "+ ry+ ") m";
	}

}
