package lab9;

import java.util.Scanner;

@FunctionalInterface
interface UsernameAndPassword{
	boolean validation(String username, String password);
}
public class Exercise3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		UsernameAndPassword up= (username, password) -> 
			username.equals("Sneha07") && password.equals("Sneha@1998");
		
		System.out.println("Enter User Name; ");
		String username= sc.next();
		
		System.out.println();
		System.out.println("Enter Password: ");
		String password= sc.next();
		
		System.out.println();
		System.out.println("Status: "+ up.validation(username, password));
		
		sc.close();
	}

}