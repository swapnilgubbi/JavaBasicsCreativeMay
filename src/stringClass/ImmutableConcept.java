package stringClass;

public class ImmutableConcept {

	public static void main(String[] args) {
		
		// String is Immutable
		
		String s ="Creative";
		
		System.out.println(s);
		
		System.out.println(s.concat(" Class"));
		
		System.out.println(s);
		
		System.out.println("***********************************");
		
		// StringBuffer  is Mutable
		
		StringBuffer sb =new StringBuffer("Nanded");
		
		System.out.println("Value of sb is:"+sb);
		
		sb.append(" District");
		
		System.out.println("new value of sb is :"+sb);
		
		
		
	}
	
}
