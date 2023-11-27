package jspiders;

public class Transaction {
		public void viewBalance(Account acc)
		{
			if(acc.isActive())
			{
				System.out.println("account balance :"+acc.getAccbal());
			}
			else
			{
				System.out.println("failes to view balance,account is inactive");
			}
		}
		public void deposit(Account acc,double amount)
		{
			if(acc.isActive())
			{
				System.out.println("depositing rs."+amount);
				acc.setAccbal(acc.getAccbal()+amount);
				System.out.println("deposit success");
			}
			else
			{
				System.out.println("failes to deposit ,account is inactive");
			}
		}
		
		public void withdraw(Account acc,double amount)
		{
			if(acc.isActive())
			{
				System.out.println("withdarwing rs."+amount);
				if(amount<acc.getAccbal())
				{
				acc.setAccbal(acc.getAccbal()-amount);
				System.out.println("deposit success");
				}
				else
				{
					System.out.println("failes to withdraw ,insufficient balance");
						
				}
			}
			else
			{
				System.out.println("failes to withdraw ,account is inactive");
			}
		}
	}



