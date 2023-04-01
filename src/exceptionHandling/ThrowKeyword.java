package exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		int i=20;
		
		if(i<30)
		{
			throw new NullPointerException("Something Went wrong try after Sometime");
			
		}
		else {
			throw new ClassCastException("Something Went Wrong Try after Sometime");
			
		}
		
		
	}
	
}
