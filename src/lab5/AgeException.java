package lab5;
import java.util.Scanner;
class AgeExceptionDemo extends Exception{
	public AgeExceptionDemo(String str) {
		System.out.println(str);
	}
}
public class AgeException {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		sc.close();
		try {
		if(age<18)
		throw new AgeExceptionDemo("Invalid age");
		else
		System.out.println("Valid age");	
	}
	catch(AgeExceptionDemo a) {
		System.out.println(a);
	}
	finally {
		System.out.println("Hello");
	}
}
}