package constructor;

public class College {
	
	String name;
	
	static String collegename= "Coep";
	
	long mobile;
	
	int mathmarks;
	
	static String cityname="Pune";
	
     public College(String name,long mob,int mmarks)
     {
    	 this.name=name;
    	 
    	 this.mobile=mob;
    	 
    	 this.mathmarks=mmarks;
    	 
    	 
     }
     
     public static void main(String[] args) {
		
    	 
    	 
    	 College c =new College("Ashish",766372288,60);
    	
    	 College c1 =new College("Ramesh",777664557,80);
    	
    	 College c2 =new College("shahu",132536478,85);
    	 
    	System.out.println("collegename:Coep");
    	 
    	 System.out.println(c.name);
    	 
    	 System.out.println(c.mathmarks);
    	 
    	 System.out.println(c.mobile);
    	 
    	 System.out.println(c1.name);
    	 
    	 System.out.println(c1.mathmarks);
    	 
    	 System.out.println(c1.mobile);
    	 
    	 System.out.println(c2.name);
    	 
    	 System.out.println(c2.mathmarks);
    	 
    	 System.out.println(c2.mobile);
    	 
	}
     
}
