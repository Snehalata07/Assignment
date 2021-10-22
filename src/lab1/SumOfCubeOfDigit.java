package lab1;
import java.util.Scanner;
public class SumOfCubeOfDigit {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number ");
		int num= sc.nextInt();
		System.out.println("Sum of the cubes of the digit" +" is: "+displaySum(num));
		sc.close();
	}
	//create a method to find sum of cubes of digit
	public static int displaySum(int num) {
		int sum=0;
		while(num!=0) {
			int digit= num%10;
			sum=sum+(int)Math.pow(digit, 3);
			num/=10;
		}
		return sum;
	}

}



