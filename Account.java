package jspiders;

public class Account {

		private String custname;
		private double accbal;
		private final int accnum;
		private static int randnum=10001;
		private boolean isActive;
		public Account(String custname,double accbal,boolean isActive)
		{
			this.custname=custname;
			this.accbal=accbal;
			this.isActive=isActive;
			this.accnum=randnum++;
		}
		public String getCustname() {
			return custname;
		}
		public void setCustname(String custname) {
			this.custname = custname;
		}
		public double getAccbal() {
			return accbal;
		}
		public void setAccbal(double accbal) {
			this.accbal = accbal;
		}
		public boolean isActive() {
			return isActive;
		}
		public void setActive(boolean isActive) {
			this.isActive = isActive;
		}
		public int getAccnum() {
			return accnum;
		}
	}


