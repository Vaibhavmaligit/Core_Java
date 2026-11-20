package service;

import java.io.IOException;

public interface RBI {

	 void createAccount() throws IOException;
	 
	 void displayAccountDetails() throws IOException;
	 
	 void displayAccountBalance();
	 
	 void depositAmount();
	 
	 void withdrawAmount();
	 
	 void updateAccountDetails();
	 
}
