package model;

public class Account {

	public long accountNo;
	public String accountHolderName;
	public long mobileNumber;
	public String address;
	public String emailId;
	public String adharId;
	public String pan;
	public double balance = 5000;
	
	public long generateAccountNumber() {
		long accountNoGenerate = (long)(Math.random()*Math.pow(10, 12));
		return accountNoGenerate;
	}
	
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAdharId() {
		return adharId;
	}
	public void setAdharId(String adharId) {
		this.adharId = adharId;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "<<<< Account Details >>>> \n Account Number : " + accountNo + "\n Account Holder Name : " + accountHolderName + "\n Mobile Number : "
				+ mobileNumber + "\n Address : " + address + ",\n Email Id : " + emailId + "\n Adhar Id : " + adharId + "\n PAN : "
				+ pan + "\n Balance : " + balance;
	}
	
	
}
