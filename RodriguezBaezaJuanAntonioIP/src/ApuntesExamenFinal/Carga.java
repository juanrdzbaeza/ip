package ApuntesExamenFinal;

public class Carga implements Comparable<Carga>{
	private double rx, ry, q;
	
	public Carga(double q, double rx, double ry){
		this.rx	= rx;
		this.ry	= ry;
		this.q	= q;
	}//constructor
	
	//geters and setters
	public double getRx() {
		return rx;
	}

	public void setRx(double rx) {
		this.rx = rx;
	}

	public double getRy() {
		return ry;
	}

	public void setRy(double ry) {
		this.ry = ry;
	}

	public double getQ() {
		return q;
	}

	public void setQ(double q) {
		this.q = q;
	}
	//geters and setters
	
	public double potencialEn(Carga c){
		double potencial, r, k = 8.99e9;
		r			= this.distancia(c);
		try{
			potencial	= k*(c.q/r);		
			return potencial;
		}catch(Exception e){
			potencial	= 5;
			return potencial; 
		}
	}

	private double distancia(Carga c) {
		double distanciaAlPunto = Math.sqrt(Math.pow(c.rx-this.rx, 2)+Math.pow(c.ry-this.ry, 2));
		return distanciaAlPunto;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carga other = (Carga) obj;
		if (Double.doubleToLongBits(q) != Double.doubleToLongBits(other.q))
			return false;
		if (Double.doubleToLongBits(rx) != Double.doubleToLongBits(other.rx))
			return false;
		if (Double.doubleToLongBits(ry) != Double.doubleToLongBits(other.ry))
			return false;
		return true;
	}
	
	public String toString(){
		if (q == 0)
			return "("+rx+", "+ry+")";
		else
			return this.q+"C en ("+rx+", "+ry+")";
	}

	@Override
	public int compareTo(Carga o) {
		// TODO Auto-generated method stub
		if (q == o.q)
			return 0;
		else if (q < o.q)
			return 1;
		else
			return -1;
	}
	
}//cierre de la clase Carga
