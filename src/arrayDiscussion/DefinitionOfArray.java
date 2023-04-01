package arrayDiscussion;

public class DefinitionOfArray {

	
	public static void main(String[] args) {
		
		
		//   First way to define the array
		
		
		String [] s1 =new String [4] ;
		
		s1[0]="Nanded";
		s1[1]="latur";
		s1[2]="Aurangabad";
		s1[3]="Pune";
	
		System.out.println(s1[0]);
		
//		for(int i=0;i<4;i++)
//		{
//			System.out.println(s1[i]);
//			
//		}
//		int i=0;
//		while(i<4)
//		{
//		
//			System.out.println(s1[i]);
//			i++;
//		}
//		
//		int size =s1.length;
//		
//		System.out.println(size);
//		
//		for(int j=0;j<size;j++)
//		{
//			System.out.println(s1[j]);
//		}
//		
		int s[]= new int[4];
		
		s[0]=11;
		s[1]=15;
		s[2]=20;
		s[3]=25;
		
//		for(int k=0;k<4;k++)
//		{
//			System.out.println(s[k]);
//		}
		int p=0;
		
		while(p<4) {
			
			System.out.println(s[p]);
			p++;
		}
		
		
	}
}
