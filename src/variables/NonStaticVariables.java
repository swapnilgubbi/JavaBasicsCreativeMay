package variables;

public class NonStaticVariables {
	
	//Syntax: data type Variable name = value;
	
	int i =50;
	
	boolean b = true;
	
	int j;
	
	public static void main(String[] args) {
		
		NonStaticVariables swap = new NonStaticVariables();
		
		System.out.println(swap.b);
		
		System.out.println(swap.j);
		m1();
		
		NonStaticVariables swa = new NonStaticVariables();
		swa.m2();
		
	}
	
	public static void m1() {
		
		NonStaticVariables swap = new NonStaticVariables();
		
		System.out.println(swap.i);
		
		System.out.println(swap.b);
		
		
	}
	
	public void m2() {
		
		System.out.println(i);
		
	}
}
