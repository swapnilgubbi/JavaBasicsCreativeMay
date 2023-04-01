package exceptionHandling;

public class Test2 {

	public static void main(String[] args) {
		
		int k=0;
		
		try
		{
			int i=200;
			int j=0;
			
			System.out.println("before division Line");
			
			k=i/j;
			
			System.out.println("After Division Line");
			
			System.out.println(k);
			
		}
	   finally
		{
		   
		   
			System.out.println("Executing Finally Block ");
			
			System.out.println(k);
		}
	}
}
