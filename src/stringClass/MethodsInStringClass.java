package stringClass;

public class MethodsInStringClass {

	public static void main(String[] args) {
		
		// 1. equals
		
		String s1 ="abc";
		
		String s2="abcde";
		
		boolean isequal =s2.equals(s1);
		
		System.out.println(isequal);
		
		// 2.If we use ==
		
		String s3 ="ghi";
		
		String s4 ="ghi";
		
		String s5 =new String("ghi");
		
		if(s3==s5)
		{
			System.out.println("s3 and s5 are pointing to same objects");
		}
		else
		{
			System.out.println("s3 and s5 are not pointing to same objects");
		}
		
		//3 charAt()
		
		String s6 ="Creative";
		
		char c =s6.charAt(5);
		
		char c1 =s6.charAt(4);
		
		System.out.println(c);
		
		System.out.println(c1);
		
		// 4.equalsIgnoreCase()
		
		String s7 ="MahaRashtra";
		
		String s8 ="maHarashtra";
		
		boolean b1=s7.equalsIgnoreCase(s8);
		
		System.out.println(b1);
		
		String s9="Corporate";
		
		String s10 =s9.substring(2);
		System.out.println(s10);
		
		String s11 =s9.substring(1);
		
		System.out.println(s11);
		
		String s12="Corporate";
		
		String s13 =s12.substring(3, 7);
		
		System.out.println(s13);
		
		String s14 ="Maharashtra";
		
		int count=s14.length();
		
		System.out.println(count);
		
		
		
	}
	
}
