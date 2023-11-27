package jspiders;

public class Mainclass1 {

	public static void main(String[] args) {
		
		AccountCreation ac= new AccountCreation();
		AccountClose acc_close=new AccountClose();
		
		Account savacc=ac.createAccount("Ramesh", 10000.0);
		Transaction txn=new Transaction();
		txn.deposit(savacc,50000);
		txn.deposit(savacc, 5000);
		txn.viewBalance(savacc);
		txn.withdraw(savacc,3000.0);
		txn.viewBalance(savacc);
		//acc_close.makeInactive(savacc);
		
}
}
