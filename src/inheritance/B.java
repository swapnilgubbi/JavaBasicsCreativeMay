package inheritance;

public class B extends A {

	public B()
	{
		System.out.println("Zero Argument child class constructor is executing");
	}
	
	public B(String a)
	{
		// calling Constructor with argument from parent class
		
		super(20);
		
		System.out.println("One Argument child class constructor is executing");
	}
	
	public static void main(String[] args) {
		
	B b = new B();
	B b1 = new B("class");
	
		
		
		
	}
}
