package variables;

public class College {

	static String collegename = "COEP";
	
	String studentname;
	
	int mathematicsmarks;
	
	int physicsmarks;
	
	public static void main(String[] args) {
		
		College s1 =new College();
		
		s1.studentname = "AMOL";
		
		s1.mathematicsmarks = 67;
		
		s1.physicsmarks = 80;
		
		College s2 = new College();
		
		s2.studentname ="AYUSH";
		
		s2.mathematicsmarks = 80;
		
		s2.physicsmarks = 90;
		
		System.out.println(collegename);
		
		System.out.println(s1.studentname);
		
		System.out.println(s1.mathematicsmarks);
		
		System.out.println(s1.physicsmarks);
		
		System.out.println(s2.studentname);
		
		System.out.println(s2.mathematicsmarks);
		
		System.out.println(s2.physicsmarks);
	}
	
}
