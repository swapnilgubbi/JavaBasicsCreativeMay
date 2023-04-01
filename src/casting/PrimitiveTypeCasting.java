package casting;

public class PrimitiveTypeCasting {

	public static void main(String[] args) {
		

	//   implicit:--> widening of data type

		short s=560;
		
		int i= (int)s;
		
		System.out.println(i);//560
		
		byte b=10;
		
		long l=(long)b;
		
		System.out.println(l);//10
		
	//  explicit--> Narrowing of data type &  chances of data loss
		
		int k=150;
		
		byte p=(byte)k;
		
		System.out.println(p);
		
		float f=134.78f;
		
		int j=(int)f;
		
		System.out.println(j);
	}
	
}
