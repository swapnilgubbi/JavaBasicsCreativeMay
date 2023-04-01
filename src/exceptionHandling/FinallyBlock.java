package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		int k=0;
		
		try
		{
			int i=200;
			
			int j=0;
			
			System.out.println("Before Division Line");
			
			k=i/j;
			
			System.out.println("After Division Line");
			
			System.out.println(k);
		}
		catch(ArithmeticException e)
		{
			String s =e.getMessage();
			
			System.out.println("Arithmetic Exception");
			
			System.out.println(s);
		}
		finally
		{
			System.out.println("Executing Finally Block");
			
			System.out.println(k);
		}
	}
}
