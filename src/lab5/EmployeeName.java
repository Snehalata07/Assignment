package lab5;

import java.util.Scanner;
class validateNameException extends Exception{
 }
       public class EmployeeName {

	public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter the first name: ");
	  String fname=sc.nextLine();
	  System.out.println("Enter the last name: ");
	  String lastname=sc.nextLine();
	  sc.close();
	try {
		if(fname.isEmpty() || lastname.isEmpty()) {
			throw new validateNameException();
		}
		
		}catch(validateNameException v) {
			System.out.println("FirstName and lastName can not be blank");
		}finally {
			System.out.println("Your name is : "+ fname +" "+ lastname);
		}
	}
}
