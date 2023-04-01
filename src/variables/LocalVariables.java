package variables;

public class LocalVariables {

	static int k;

	public static void main(String[] args) {

		int j = 50; // Local Variable

		System.out.println(j);

		addition(150, 70);

		LocalVariables ref = new LocalVariables();

		ref.m1();

	}

	public void m1() {

		String s = "234abc";

		int j = 50;

		System.out.println(j);

		System.out.println(s);

	}

	public static void addition(int a, int b) {

		int c = a + b; // Local Variable

		System.out.println(c);
	}
}
