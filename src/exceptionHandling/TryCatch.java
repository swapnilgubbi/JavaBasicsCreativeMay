package exceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		
		int k=0;
		
		try
		{
			int i=200;
			
			int j=0;
			
			System.out.println("Before Division Line");
			
			k=i/j;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Catch is executing");
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception");
		}
		catch(ArithmeticException e)
		{
			System.out.println( "Arithmetic Exception");
		}
		System.out.println("After Division Line");
		
		System.out.println(k);
		
	}
}
