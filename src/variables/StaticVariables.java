package variables;

public class StaticVariables {

	// syntax : static Data-type variable name = value;
	
	static int i =65;
	
	static String s = "Creative class" ;
	
	static int j;
	
	static String k;
	

    public static void main(String[] args) {
		
	
    
    	 System.out.println(i);
    	 
    	 System.out.println(j);
    	 
    	 System.out.println(s);
    	 
    	 System.out.println(k);
    	 
    	 m1();
    	
    	 StaticVariables swa = new StaticVariables();
    			 
    			 swa.m2();
    }
    
    public static void m1() {
    	System.out.println(i);
    }
    
    public void m2() {
    	System.out.println(s);
    }
}
   