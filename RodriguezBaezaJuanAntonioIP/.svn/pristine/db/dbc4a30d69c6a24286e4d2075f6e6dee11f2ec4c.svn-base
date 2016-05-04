package ApuntesExamenFinal;

public class factorialRecursivo {
	
	
	public static long FactorialRecursivo(int n){
		if (n == 0)
			return 1;
		else
			return n*FactorialRecursivo(n-1);
	}
	
	public static long fibonacci(int n){
		if (n == 0) //caso base 
			return 0;
		else if (n == 1) // caso base
			return 1;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("6! = "+FactorialRecursivo(4));
		
		for (int i = 0; i < 100; i++) {
			System.out.print(fibonacci(i)+"\t");
			System.out.print("("+i+")");
		}
		System.out.println(fibonacci(9));

	}

}
