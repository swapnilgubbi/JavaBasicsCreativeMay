package interfaceDiscussion;

public interface Interface1 {

	int i = 56;
	public static final int j=100;
	
	public void m1();
	
	public abstract void m2();
	
	void m3();
	
	// all non static methods in interfaces are by default public and abstract
	
	public void commonMethod();
	
	public static void staticMethod()
	{
		System.out.println("static method from interface1 is running");
	}
	
	public static void main(String[] args) {
		
		staticMethod();
		
		System.out.println(i);
	}
	
	
}
	