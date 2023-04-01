package abstractDiscussion;

public abstract class Test {

	public void m1()
	{
		System.out.println("m1 method from test class");
		
	}
	public void m2()
	{
		System.out.println("m2 method from test class");
	}
	public void m3()
	{
		System.out.println("m3 method from test class");
	}
	public abstract void m4();
	
	public abstract void m5();
	
	public static void m6()
	{
		System.out.println("m6 static method");
		
	}
	public abstract void m7();
	
	public static void main(String[] args) {
		
		// we can not create object of abstract class 
		// Test t = new Test();
		
		m6();
		
	}
	
	
}
