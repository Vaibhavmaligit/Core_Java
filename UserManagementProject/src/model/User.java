package model;

public class User {
	
private int uId;
private String uName;
private long mobileNumber;
private String address;
private String adharId;
private String pan;
private String email;

public int generateUserId() {
	int userIdGenerate = (int)(Math.random()*Math.pow(10, 3));
	return userIdGenerate;
}
public int getuId() {
	return uId;
}
public void setuId(int uId) {
	this.uId = uId;
}
public String getuName() {
	return uName;
}
public void setuName(String uName) {
	this.uName = uName;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "<<< USER DETAILS >>> \nUser Id : " + uId + "\nUser Name : " + uName 
			+ "\nUser Mobile Number : " + mobileNumber + "\nUser Address : " + address
			+ "\nUser Adhar Id : " + adharId + "\nUser PAN : " + pan + "\nUser Email : " + email;
}




}
