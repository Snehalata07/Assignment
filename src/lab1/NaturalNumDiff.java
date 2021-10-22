package lab1;
import java.util.Scanner;
public class NaturalNumDiff {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a range: ");
		int n= sc.nextInt();
		System.out.println("Difference b/w sum of square and square of sum is: "+calculateDifference(n));
		sc.close();
	}
	static int calculateDifference(int n) {
		int sum1=0;
		int sum2=0;
		int difference=0;
		for(int i=0; i<=n;i++) {
			sum1 += (i*i);
			sum2 += i;
		}
		int squareOfSum = (sum2*sum2);
		difference= squareOfSum - sum1;
		return difference;
		
	}

}



