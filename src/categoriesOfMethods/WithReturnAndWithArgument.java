package categoriesOfMethods;

public class WithReturnAndWithArgument {
	
	public boolean compare(int i) {
		
		boolean m = i>10;
		
		return m;
		
	}
	
	public static void main(String[]args) {
		
		WithReturnAndWithArgument ref = new WithReturnAndWithArgument();
		
		boolean returnedValue = ref.compare(6);
		
		System.out.println(returnedValue);
		
		boolean returnedValue2 =ref.compare(50);
		
		System.out.println(returnedValue2);
		
	}

}
