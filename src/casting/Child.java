package casting;

public class Child extends Parent{

	
	public void m4()
	{
		System.out.println("m4 method from child class");
		
	}
	
	public void m5()
	{
		System.out.println("m5 method from child class");
		
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		Parent p = (Parent)c; // UpCasting
		
		p.m1();
		p.m2();
		
		Child c1=(Child)p;
		
		c1.m4();
		
		Parent p1= new Child();
		Child c2=(Child)p1;
		c2.m4();
		
		Parent p2=new Parent();
		
		Child c3 =(Child)p2;
		
		c3.m4();
		
		
	}
	
	
}
