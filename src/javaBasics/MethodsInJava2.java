package javaBasics;

public class MethodsInJava2 {

	public static void main(String[]args) {
		
		
		// calling static method in another static method of same class
		
		thirdStaticMethod();
		
		// calling non static method in static method of same class
		
		// syntax for creating objects
		
		// ref name_of_class = new name_of_class
		
		MethodsInJava2 ref = new MethodsInJava2();
		
		ref.fifthNonStaticMethod();
		
		ref.fourthNonStaticMethod();
	}
	
	 public static void thirdStaticMethod()
	 
	 {
	
	System.out.println("third static method is running from MethodsInJava2 class");
	
	
	 }
	 public void fourthNonStaticMethod()
	 {
		 System.out.println("fourth Non static method is running from MethodInJava 2 class");
		 
		 thirdStaticMethod();
		 
	 }
	 
	 public void fifthNonStaticMethod()
	 {
		 System.out.println("fifth non static method is running from methods in java 2");
		 
		 thirdStaticMethod();
		 
		 fourthNonStaticMethod();
		 
		 }	 
	 
	 
}
