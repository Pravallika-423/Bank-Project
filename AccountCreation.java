package jspiders;

public class AccountCreation {
	Account createAccount(String custname,double accbal)
	{
		Account a1=new Account(custname,accbal,true);
		return a1;
}
}
