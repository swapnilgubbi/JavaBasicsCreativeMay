package operators;

public class IfElseIf {

	public static void main(String[] args) {

		float p=80;
		
		if(p>=35 && p<=44)
		{
			System.out.println("Grade:D");
		}
		else if (p>=44 && p<=59)
		{
			System.out.println("Grade:C");
		}
		else if (p>=59 && p<=74)
		{
			System.out.println("Grade:B");
		}
		else
		{
			System.out.println("Grade:A");
		}
		
	}
}
