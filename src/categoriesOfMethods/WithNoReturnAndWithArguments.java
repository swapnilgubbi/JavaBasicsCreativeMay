package categoriesOfMethods;

public class WithNoReturnAndWithArguments {

	public void areaCalculator(int length,int breadth ) {
		
		int area = length*breadth;
		
		System.out.println("area is:"+area);
		
	}
	
	public static void main(String[]args) {
		
		WithNoReturnAndWithArguments ref = new WithNoReturnAndWithArguments();
		
		ref.areaCalculator(50, 2500);
		
	}
	
	
	
}
