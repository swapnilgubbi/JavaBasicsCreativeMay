package exceptionHandling;

public class TypesOfExceptions {

	public static void main(String[] args) {
		
		//Null Pointer Exception
		
		try {
			
			String s=null;
			
			int size=s.length();
			
			System.out.println(size);
			
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception");
		}
		
		// ArrayIndexOutOfBoundExceptions
		
		try {
			int i[]=new int[2];
			
			i[0]=30;
			i[1]=40;
			i[5]=50;
			
			System.out.println(i[5]);
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
//		 String s =e.getMessage();
//		 System.out.println(s);
		}
		
		
		
		
	}
	
	
}
