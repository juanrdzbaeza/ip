package org.ip.ejerciciosResueltos01_13;

public class Burbuja {
	


	public static void burbuja2(int[]a){
		
		int max=0;
		boolean maxExiste = false;
		int posicionMax=0;
		int sustituidoMax;
		int pos_sus_max;
		int minimo=5000;
		boolean minimoExiste = false;
		int posicionMin=0;
		int sustituidoMin;
		int pos_sus_min;
		int aux;
		int aux2;
		for(int i=1;i<a.length;i++){
			for(int j=i-1;j<a.length-i;j++){
				if(a[j]>a[j+1]){
					if(maxExiste==false){
						maxExiste=true;
					}
					max = a[j+1];
					posicionMax = j+1;
					sustituidoMax =a[j];
					//pos_sus_max = j;
					
				}
				if(a[j]<a[j+1]){
					if(minimoExiste==false){
						minimoExiste=true;
					}
					minimo = a[j+1];
					posicionMin = j+1;
					sustituidoMin = a[j];
					//pos_sus_min = j;
					
				}
				if(j==a.length-i-1){
					if(minimoExiste){
						aux = a[i-1];
						a[i-1]= minimo;
						a[posicionMin]=aux;
					}
					if(maxExiste){
						aux2 = a[a.length-i];
						a[a.length-i]= max;
						a[posicionMax]=aux2;
					}
								
					
				}
				
				
			}
			
			
			
			
			
			
			
			
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		int[]numero = new int[10];
		numero[0] = 10;
		numero[1] = 24;
		numero[2] = 344;
		numero[3] = 34;
		numero[4] = 5;
		numero[5] = 89;
		numero[6] = 80;
		numero[7] = 54;
		numero[8] = 62;
		numero[9] = 40;
		
		burbuja2(numero);
		
		for(int g = 0 ; g< numero.length;g++){
			System.out.println("Indice: "+g+" Valor: "+numero[g]);
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
