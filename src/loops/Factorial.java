package loops;

public class Factorial {

	public static void main(String[] args) {
		
		int num =5;
		
		int factorial=1;
		
//		for(int i=num;i>0;i--)
//		{
//			factorial=factorial*i;
//		}
//		
//		System.out.println("factorial of number is "+factorial);
		
		int i=num;
		
		while( i>0) {
			
			factorial=factorial*i;
			System.out.println(factorial+"factorial of number");
			i--;
		}
	}
}
