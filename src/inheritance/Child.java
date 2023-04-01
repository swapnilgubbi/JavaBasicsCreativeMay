package inheritance;

public class Child extends Parent {

	int i=78;
	
	public void college()
	{
		System.out.println("college is running");
		
		System.out.println(this.i);
		
		
		// accessing non static variable from parent class using super keyword
		
		System.out.println(super.j);
		
		super.furniture();
		
		
	}
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.bike();
		c.furniture();
		c.home();
		c.college();
		c.farm();
		System.out.println(c.k);
		
		
	
		
		
	}
}
