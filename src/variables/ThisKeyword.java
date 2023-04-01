package variables;

public class ThisKeyword {

	int i = 48;

	int j = 70;

	static String s = "abc";

	String name = "Creative Class";

	public static void main(String[] args) {

		int i = 50;

		System.out.println(i); // 50

		ThisKeyword tk = new ThisKeyword();

		tk.m1();

	}

	public void m1() {

		int j = 40;

		String Name = "Creative";

		System.out.println("Without updation the name is:" + Name);

		this.name = Name;

		System.out.println("updated name is:" + this.name);

		System.out.println(j);// 40

		System.out.println(this.j);// 70

		System.out.println(s);
	    
		

		String Name1 = "swapnil";

		System.out.println("name is:" + Name1);

		this.name = Name1;

		System.out.println("updated name is:" + this.name);

	}


}
