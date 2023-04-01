package operators;

public class IncrementDecrementOperators {

	public static void main(String[] args) {

		int x = 10;

		// Pre Increment ;

		int y = ++x;

		System.out.println(y); // 11

		System.out.println(x); // 11

		// Post Increment ;

		int w = 10;

		int z = w++;

		System.out.println(w); // 11

		System.out.println(z);// 10 - bcoz z=w

		// Pre Decrement ;

		int p = 10;

		int q = --p;

		System.out.println(q);

		System.out.println(p);

		// Post Decrement ;

		int e = 10;

		int f = e--;

		System.out.println(f);// 10

		System.out.println(e);// 9

	}

}
