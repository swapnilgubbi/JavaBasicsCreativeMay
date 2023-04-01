package arrayDiscussion;

public class OddAndEvenIndexValue {

	public static void main(String[] args) {
		
		// WAP to print only odd index value of an array
		// WAP to print only even index value of an array


		
		int a[] = new int [5];
		
		a[0]=23;
		a[1]=48;
		a[2]=45;
		a[3]=46;
		a[4]=89;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even Number is: "+a[i]);
			}
			else
			{
				System.out.println("Odd  Number is: "+a[i]);
			}
//			for(int j=0;j<a.length;j++)
//			{
//			if(j%2==0)
//			{
//				System.out.println("Even Index Number is:"+a[j]);
//			}
//			else
//			{
//				System.out.println("odd Index Number is:"+a[j]);
//			}
//		}


		}
	}
}
