package arrayDiscussion;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		String [] s1 = new String [5];
		
		s1[0]="Nanded";
		s1[1]="Aurangabad";
		s1[2]="Latur";
		s1[3]="Parbhani";
		s1[4]="Pune";
		
		for(String a:s1)
		{
			System.out.println(a);
		}
		
//		int[] b= new int[4];
//		
//		b[0]=1;
//		b[1]=2;
//		b[2]=3;
//		b[3]=4;
//		
//		for(int c:b)
//		{
//			System.out.print(" " +c);
//		}
//				
//			
		int c[]=new int[3];
		
		c[0]=1;
		c[1]=2;
//		c[2]=3;
		for(int b:c) {
			System.out.println(b);
		}
	}
	
}
