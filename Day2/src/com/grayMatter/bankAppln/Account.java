package com.grayMatter.bankAppln;

public class Account {
 protected String accNo;
 protected String accHolderName;
 protected int pin;
 protected String bankName;
 protected String IFSCcode;
 
 
public Account(String accNo, String accHolderName, int pin, String bankName, String iFSCcode) {
	super();
	this.accNo = accNo;
	this.accHolderName = accHolderName;
	this.pin = pin;
	this.bankName = bankName;
	IFSCcode = iFSCcode;
}
public Account() {
	super();
}
@Override
public String toString() {
	return "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + ", pin=" + pin + ", bankName=" + bankName
			+ ", IFSCcode=" + IFSCcode + "]";
}
 
 public void changePin(int currentPin,int newPin) {
	 if(this.pin==currentPin)
		 this.pin=newPin;
	 else
		 System.out.println("Pin sum not matching");
 }
 
 public void withDraw(double amount) {
	 System.out.println("amount witdrawn successffully");
	 
}
}