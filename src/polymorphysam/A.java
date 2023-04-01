package polymorphysam;

// Following methods  are the overloading methods

public class A {

	public A()
	{
		System.out.println("Zero argument constructor");
		
	}
	
	public A (int a)
	{
		System.out.println("one argument constructor");
		
	}
	
	
	public void m1()
	{
		System.out.println("zero argument from m1 method");
	}
	public void m1(int a)
	{
		System.out.println("one argument m1 method with int input");
	}
	public void m1(int a, String b)
	{
		System.out.println("two argument m1 method with int and string input");
	}
	public int m1(int a, int b)
	{
		System.out.println("two argument m1 method with int input");
		
		return(90);
	}
	public static void m1(String a)
	{
		System.out.println("one argument m1 method with string input");
	}

	public void m1(String a, int b)
	{
		System.out.println("two argument m1 method with string and int");
	}
	
	void m1(double d)
	{
		System.out.println("one argument m1 method with double");
	}
	private void m1(String a, String b)
	{
		System.out.println("one argument with two string");
	}
	public String m1(boolean a)
	{
		System.out.println("one argument with boolean and return type");
		
		return("Creative");
	}
	
	public String m1(boolean a ,int b)
	{
		System.out.println("two argument with boolean,int and return type");
		
       return "Creative";
	}
	public static void main(String[] args) {
		A a = new A();
		
		A b = new A(20);
		
		a.m1();
		a.m1(6);
		a.m1(10, 15);
		a.m1(30, "Creative");
		a.m1("ABC", 40);
		a.m1("ABC", "XYZ");
		m1("ABCD");
		a.m1(50);
		a.m1(false);
		a.m1(false, 1);
	}
	public static void main()
	{
		
	}
	
	
}
