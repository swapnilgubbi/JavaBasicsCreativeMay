package encapsulation;

public class Server {

	private int customerBalance =50000;
	
	public void getBalance(int pin)
	{
		
		if(pin==1234)
		{
			System.out.println("Your Account Balance is :Rs."+customerBalance);
		}
		else
		{
			System.out.println("Incorrect pin please check and retry");
		}
	}
	public void setBalance(int amount,int pin)
	{
		if(pin==1234)
		{
			if(amount<=customerBalance)
			{
				customerBalance = customerBalance-amount;
				
				
				System.out.println("please collect cash ,Transaction successful");
			}
			 
			 
		}
		else
		{
			System.out.println("Incorrect pin please check and retry");
		}
	}
	
	private static int bal=10000;
	
	public static void getbalance(int pin)
	{
		if(pin==1234)
		{
			System.out.println("Your account Balance is :Rs."+bal);
		}
		else
		{
			System.out.println("incorrect pin try again");
		}
	}
}
