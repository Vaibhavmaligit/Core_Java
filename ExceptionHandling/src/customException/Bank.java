package customException;

public class Bank {

	public static void withdrawAmount(int balance, int amount) 
			throws InsufficientBalanceExecption {
		if(balance<amount) {
			throw new InsufficientBalanceExecption
			("Insufficient Balance in your Account");
					
		}else {
			System.out.println("Amount withdrawl Successfully");
		}
	}
	
	public static void main(String[] args) {
		try {
			withdrawAmount(10000,5000);
		} catch (InsufficientBalanceExecption e) {
			
			e.printStackTrace();
		}
	}
	
}
