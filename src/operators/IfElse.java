package operators;

public class IfElse {

	public static void main(String[] args) {

		// Syntax:
		//
		// if(boolean- condition)
		// {
		// Action will Execute if boolean condtion is true
		//
		// }
		//
		// else
		// {
		// Action will execute if boolean condition is false
		// }

		int a = 50;

		if (a > 20) {
			System.out.println("a value is greater than 20 hence if is running");
		}

		else {
			System.out.println("else is running");
		}

		if (a < 20) {
			System.out.println(" if is running");
		} 
		else {
			System.out.println("second else is runnig");
		}
	}
}
