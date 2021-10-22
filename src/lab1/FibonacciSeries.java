package lab1;
import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number ");
		int n= sc.nextInt();
		if(fibbo(n)==0)
			System.out.println("Invalid input.");
		else {
			System.out.println(fibbo(n));
			sc.close();
		}
	}
	
	public static int fibbo(int n) {
		if(n==0)
			return 0;
		if(n<=2)
			return 1;
		return fibbo(n-1)+fibbo(n-2);
	}
}




