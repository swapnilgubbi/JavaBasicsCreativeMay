package operators;

import java.util.Scanner;

public class DetectionOfEvenOdd {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter any Number");

		int a = sc.nextInt();

		
		//int a = 70;

		if (a % 2 == 0)

		{
			System.out.println("Given Number " +a+" is even Number");

		} 
		else {
			System.out.println("Given Number " + a + " is Odd Number");
		}

	}
}
