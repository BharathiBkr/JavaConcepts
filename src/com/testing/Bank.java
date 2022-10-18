package com.testing;

public class Bank {
	public static void main(String[] args) {
		System.out.println("Bank details");
		Customer detail=new Customer();  //Without Using extends keyword get the bank class details in customer class ..bcz method is public and default.
		// If you want to get the details from the other class (Public & Default Method)make the object for access class(Customer)
		detail.deposit();
		detail.enquiry();
		//Unable to access the private access modifier..Private access modifier access only within the class.check the notes
		
	}

}
