package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args)   {
		
		// File Not Found Exception
		
		try {
			FileInputStream fis =new FileInputStream("D:\\Automation ghhMayClass Code\\Constructor.docx");
			
			
			System.out.println("File Path is Correct");
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File path is incorrect");
			
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("Before wait");
			
			Thread.sleep(5000);
			
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("After wait");
		
		
		
	}
	
}
