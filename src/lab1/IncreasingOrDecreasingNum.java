package lab1;
import java.util.Scanner;
public class IncreasingOrDecreasingNum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number ");
		int number= sc.nextInt();
		
		if(checkNumber(number))
			System.out.println("is an increasing number");
		else {
			System.out.println("is not an increasing number");
			sc.close();
		}
	}
	static boolean checkNumber(int number) {
		int lastDigit= number%10;
		number/=10;
		boolean flag= false;
		while(number>0) {
			if(lastDigit<=number%10) {
				flag=true;
				break;
			}
			lastDigit= number%10;
			number/=10;
		}
		if(flag) 
			return false;
		else {
			return true;
		}
		
		
		
	}

}






