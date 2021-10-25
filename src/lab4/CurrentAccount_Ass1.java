package lab4;

public class CurrentAccount_Ass1 extends Account_Ass1{
		//declaring fields
			double overDraftLimit=10000;
			String name= this.getAccHolder();
			double balance= this.getBalance();
			static long accountNum= Account_Ass1.getAccNum();
			//constructor
			public CurrentAccount_Ass1() {
				super();
			}
			public CurrentAccount_Ass1(Person_Ass1 p) {
				super(p);
			}
			//toString method
			@Override
			public String toString() {
				return "CurrentAccount [overDraftLimit=" + overDraftLimit + ", name=" + name + ", balance=" + balance + "]";
			}
			// Overridden method of Account class
			@Override
			public void withdraw(double withAmount) {
				double checkOverDraft=this.overDraftLimit-withAmount;
				if(checkOverDraft<withAmount) {
					System.out.println("Your overdraft limit reached. You will not able to withdraw.");
				}
				
				else if (this.balance>=withAmount) {
					this.balance-=withAmount;
					this.overDraftLimit=checkOverDraft;
					System.out.println(this.name+" having account number "+CurrentAccount_Ass1.accountNum+" has remaining balance is:"+this.balance);
				}
				
				else {
					System.out.println("You dont have sufficient balance to withdraw.");
				}
			}
			
			//creating account method
			public void createAccount(Person_Ass1 p, double initBal) {
				this.balance=initBal;
				long accNum= getAccNum()+1;
				System.out.println("Your account name is: "+p.getName()+" ,your account number is: "+accNum+" and your balance is: "+balance);
			}
	}

