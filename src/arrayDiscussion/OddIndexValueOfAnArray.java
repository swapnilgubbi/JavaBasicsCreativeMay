package arrayDiscussion;

public class OddIndexValueOfAnArray {
	
	public static void main(String[] args) {
		
		int a[]= new int [6];
			
		a[0]=10;
		a[1]=15;
		a[2]=20;
		a[3]=30;
		a[4]=40;
		a[5]=45;
		
		
		for(int i =0;i<6;i++) 
		{
			if(a[i]%2==0)
			{
				
				System.out.println("even number is:" +a[i]);
			}
			else
			{
				System.out.println("odd number is:"+a[i]);
			}
//			if(a[i]%2!=0)
//			{
//				System.out.println("odd number is:" +a[i]);
//			}
		}
			
					
	
		
	}

}
