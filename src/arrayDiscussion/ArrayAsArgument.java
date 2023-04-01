package arrayDiscussion;

public class ArrayAsArgument {

	public static void m1(int a[])
	{

		a[0] = 100;

//		a[1] =10;

		for (int i : a) 
		{
			System.out.println(i);
		}

	}

	public static void main(String[] args) {

		int[] f = new int[5];

//		f[0] = 23;
//		f[1] = 45;
//		f[2] = 46;
//		f[3] = 89;
//		f[4] = 45;
//
//		m1(f);
		String p[]=new String[3];
		
	p[0]="Aurangabad";
	p[1]="SambhajiNagar";
	p[2]="Pune";
		m2(p);
		
		
	

	}
	static void m2(String s1[]) {
		s1[0] ="Nanded";
		
		for (String f : s1)
		{
			System.out.println(f);
		}
		
	}

}
