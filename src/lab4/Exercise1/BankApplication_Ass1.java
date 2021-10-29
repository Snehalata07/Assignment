package lab4.Exercise1;

public class BankApplication_Ass1 {
		public static void main(String[] args) {
			Person_Ass1 p1= new Person_Ass1("Sneha", 22);
			Person_Ass1 p2= new Person_Ass1("Tripti", 23);
			
			SavingAccount_Ass1 s1= new SavingAccount_Ass1();
			CurrentAccount_Ass1 c1= new CurrentAccount_Ass1();
			
			s1.createAccount(p1,2000);
			c1.createAccount(p2, 3000);
			System.out.println(s1.balance);
			System.out.println(c1.balance);
		}

	}

