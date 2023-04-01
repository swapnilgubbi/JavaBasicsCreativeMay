package operators;

public class LogicalOperators {

	public static void main(String[] args) {

		// Logical And Operators --> &&

		int i = 10;

		int j = 20;

		int k = 30;

		int l = 40;

		boolean m = (j > i) && (l > k);

		System.out.println(m); // true

		boolean n = (i > j) && (l > k);

		System.out.println(n); // false

		// Logical OR Operator --> ||

		boolean o = (i > j) || (l > k); // true

		System.out.println(o);

		boolean p = (i > j) || (k > l);

		System.out.println(p); // false

		// Logical Not Operator --> !

		int a = 10;

		boolean b = a > 10;

		System.out.println(b); // false

		boolean c = !b;

		System.out.println(c); // true

		boolean d = !(i > 10);

		System.out.println(d);

	}

}
