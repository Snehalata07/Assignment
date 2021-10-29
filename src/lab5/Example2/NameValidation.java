package lab5.Example2;

import java.util.Scanner;

public class NameValidation {
	public static void main(String[] args) {
		checkName();
	}
	public static void checkName() {
		
		Scanner sc= new Scanner(System.in);
		//User input for first name
		System.out.println("Enter your first name: ");
		String fName= sc.next();
		System.out.println("Enter your last name: ");
		String lName= sc.next();
		sc.close();
		try {
		
			if(!(fName.isEmpty() || lName.isEmpty())) {
				System.out.println("Full name is: "+fName+" "+lName);
			}
		} catch (InvalidNameException in) {
			System.out.println("Please give proper name.");
		}
	}
}


