package constructor;

public class Test {
	
	public Test ()
	{
		this("coep",70);
		System.out.println("Zero arguments Constructor is running");
		
	}
	
	public Test (int a)
	{
		
		System.out.println("One arguments Constructor is running");
		
	}
	
	public Test (String s,int b)
	{
		this(40);
		
		System.out.println("Two arguments Constructor is running");
	}
	
	public static void main(String[] args) {
		
	   Test t = new Test ();
	  
	   Test t1 = new Test (50);
	   
	   Test t2 = new Test ("Creative",90);
	   
	   
	   
	}
	}
	


