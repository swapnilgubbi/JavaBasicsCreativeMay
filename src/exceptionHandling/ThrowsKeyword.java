package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {

	public static void main(String[] args) throws FileNotFoundException,InterruptedException,Throwable,Exception {
		
		System.out.println("Before Exception");
		
		FileInputStream fis = new FileInputStream("D:\\Automation Class Code\\Constructor.docx");
		
		System.out.println("Path is correct");
		
		System.out.println("Before wait");
		
		Thread.sleep(5000);
		
		System.out.println("after wait");
		
		
	}
	
}
