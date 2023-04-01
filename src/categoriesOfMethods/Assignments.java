package categoriesOfMethods;

public class Assignments {

	public static void firstStaticMethod() {
		
		int a =16000;
		
		int b =4000;
		
		int c =a+b;
		
		int d = a*b;
				
		int e =a/b;
		
		int f =a-b;
		
		System.out.println("Addition of a and b:"+c);
		
		System.out.println("Substaction of a and b:"+f);

		System.out.println("Multiplication of a and b:"+d);
		
		System.out.println("Division of a and b:"+e);
		
	}
	
	public static void main(String[]args) {
		
		
		firstStaticMethod();
		
		Assignments ref = new Assignments();
		
		ref.areaCalculator(35, 55);
		
		ref.areaCalculator(26, 40);
		
		ref.areaCalculator(40, 50);
		
		ref.areaCalculator(40, 35);
	}
	
	public void areaCalculator (int length,int breadth) {
		
		int area =length*breadth;
		
		System.out.println("area is:"+area);
		
	}
}
