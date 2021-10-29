package lab4.Exercise1;

public class Account_Ass1 {
		//declaring variable
		private static long accNo=3423;
		static double minBal=10000;
		private double balance;
		private String accHolder;
		Person_Ass1 p;
		
		public Account_Ass1() {
		}
		//constructor
		public Account_Ass1 (Person_Ass1 p) {
			this.p=p;
		}
		//getter & setter
		public static long getAccNum() {
			return accNo;
		}

		public static void setAccNum(long accNum) {
			Account_Ass1.accNo = accNum;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public String getAccHolder() {
			return accHolder;
		}
		public void setAccHolder(Person_Ass1 p) {
			this.accHolder = p.getName();
		}
		//toString method
		@Override
		public String toString() {
			return "Account [balance=" + balance + ", accHolder=" + accHolder + ", p=" + p + "]";
		}
		//logic for deposit
		public void deposit(double depAmount) {
			if(depAmount>0) {
				this.balance+= depAmount;
				System.out.println("Your total balance is: "+this.balance);
			}
		}
		//declaring the withdraw method for future 
		public void withdraw(double withAmount) {
			 
		}
		
	}

