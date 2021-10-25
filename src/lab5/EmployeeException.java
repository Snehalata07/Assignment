package lab5;

import java.util.Scanner;
class SalaryException extends Exception{
	public SalaryException(String str) {
		System.out.println(str);
	}
}
public class EmployeeException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount");
		int salary=sc.nextInt();
		sc.close();
		try {
			if(salary<3000)
				throw new SalaryException("Invalid Employees Salary");
			else
				System.out.println("Valid Employees Salary");
		}
		catch(SalaryException s) {
			System.out.println(s);
	}

	}

}