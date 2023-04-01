package encapsulation;

public class AtmMachine {

	public static void main(String[] args) {
		
		Server s = new Server();
		
		s.getBalance(1234); //abstraction
		s.getBalance(5796);
		s.setBalance(8000,1234);
		s.getBalance(1234);
		s.setBalance(5000, 1234);
		s.getBalance(1234);
		Server.getbalance(1234);
		Server.getbalance(5796);
		
		//Encapsulation = Abstraction + Data Hiding
	}
	
}
