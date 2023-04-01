package operators;

public class RelationalOperators {

	public static void main(String[] args) {

		int i = 10;

		int j = 50;

		int k = 50;

		// 1. Equal Operators '=='

		boolean l = i == j;

		System.out.println(l);// false

		boolean m = j == k;

		System.out.println(m); // true

		// 2.'>' greater than operator

		boolean n = i > j;

		System.out.println(n); // false

		// 3.'<' less than operator

		boolean o = i < j;

		System.out.println(o); // true

		// 4. '>=' greater than or equals to operator

		boolean p = j >= i;

		System.out.println(p); // true

		// 5. '<=' less than or equals to operator

		boolean q = i <= j;

		System.out.println(q); // true

	}
}
