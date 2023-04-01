package abstractDiscussion;

public class Test2 extends Test1 {

	public Test2()
	{
		super(20);
		
		System.out.println("zero argument child class constructor from Test2 Class");
	}

	void m8() {
		
		System.out.println("m8 method from test 2 class");
	}

	
	public void m7() {
		
		System.out.println("m7 method from test 2 class");
	}
	
	public static void main(String[] args) {
		
		Test2 t = new Test2();
		
		t.m1();
		t.m2();
		t.m3();
		t.m4();
		t.m5();
		m6();
		t.m7();
		t.m8();
		
	}
	

}
