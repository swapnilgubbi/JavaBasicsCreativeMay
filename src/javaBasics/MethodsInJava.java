package javaBasics;

public class MethodsInJava {
	
	
	public static void main(String[]args) {
		
		System.out.println("this is my first java prograam");
		
		System.out.println("************************************");
		
		//calling static method in another static method from different class
		
		MethodsInJava2.thirdStaticMethod();
		
		//calling non static method in another static method from different class
		
		MethodsInJava2 ref1 = new MethodsInJava2();
		
		ref1.fourthNonStaticMethod();
		
		// calling static method in another static method of same class
		
		firstStaticMethod();
		
		secondStaticMethod();
		
		// calling non static method in static method 
		
		//syntax for creating objects
		
		// class-name reference variable = new class name();
		
		
		MethodsInJava ref = new MethodsInJava();
		
		ref.firstNonStaticMethod();
		
		ref.secondNonStaticMethod();
		
		}

	public static void firstStaticMethod() {
		
		System.out.println("first static method is running");
		
		// // calling static method in another static method of same class
		
		secondStaticMethod();
		
		
	}
	
	public static void secondStaticMethod() {
		
		int a= 30;
		
		int b= 40;
		
		int c= a+b;
		
		System.out.println("Addition of a and b:"+c);
		
	}
	
	// syntax for non static method
	
	//public void name_of_method()
	
	//{
	
	//Actions
	
	//}
	
	public void firstNonStaticMethod() {
		
		System.out.println("first non static method is running");
		
	// calling static method in another non static method of same class
		
		firstStaticMethod();
	}
	
	public void secondNonStaticMethod() {
		
		System.out.println("second non static method is running");
		
		// calling static method in another non static method from different class
		
		MethodsInJava2.thirdStaticMethod();
		
		// calling non static method in another non static method from different class
		
		MethodsInJava2 ref1 = new MethodsInJava2();
		
	    ref1.fourthNonStaticMethod();
		
	    ref1.fifthNonStaticMethod();
	}
	
	
	
	
}
