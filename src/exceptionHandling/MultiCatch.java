package exceptionHandling;

public class MultiCatch {

	public static void main(String[] args) {
		
		int k=0;
		
		try {
			
			int i=200;
			
			int j=0;
			
			System.out.println("Before Division Line");
			
			k=i/j;
			
			System.out.println("After Division line");
			
			System.out.println(k);
		}
		catch(NullPointerException e)
		{
			System.out.println("null pointer exception");
			
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index out of Bound exception");
		}
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
			
			System.out.println("exception catch block");
			
		}
		System.out.println(k);
		
		
	}
	
}
