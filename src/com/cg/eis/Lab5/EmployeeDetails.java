package com.cg.eis.Lab5;

	import java.util.Scanner;
	public class EmployeeDetails {
		
		String eName;
		int eId;
		double eSalary;
		
		EmployeeDetails(String eName, int eId, double eSalary) {
			super();
			this.eName = eName;
			this.eId = eId;
			this.eSalary = eSalary;
		}
		@Override
		public String toString() {
			return "EmployeeDetails [eName=" + eName + ", eId=" + eId + ", eSalary=" + eSalary + ", eDesignation="
					+"]";
		}
		public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter Your Full Name: ");
			String name= sc.nextLine();
			
			System.out.println("Enter Your Employee ID: ");
			int id= sc.nextInt();
			
			
			System.out.println("Enter Your Salary: ");
			double salary= sc.nextDouble();
			sc.close();
			try {
				if(salary<3000) {
					throw new InsufficientAmountException("Try to work hard and get pay more..");
				}else {
					EmployeeDetails emp1= new EmployeeDetails(name, id, salary);
					System.out.println(emp1);
				}
				
				
			} catch (InsufficientAmountException iae) {
				System.out.println("Good Luck");
			}
			

		}

	}

