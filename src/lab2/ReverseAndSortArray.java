package lab2;
import java.util.Arrays;
import java.util.Scanner;
public class ReverseAndSortArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int length= sc.nextInt();
		int[] arr= new int[length];
		System.out.println("Enter "+length+" elements in array: ");
		sc.close();
		for(int i=0; i<length; i++)  
		{  
			arr[i]=sc.nextInt();  
		}
		System.out.println("Original Array is: ");
		for(int orArr:arr)
			System.out.print(orArr+" ");
		System.out.println();
		getSorted(arr);
		for(int revSortArr:arr)
			System.out.print(revSortArr+" ");
	}
	static int[] getSorted(int[] arr) {
		int i=0;
		int j= arr.length-1;
		while(i<j) {
			int temp= arr[i];
			arr[i]= arr[j];
			arr[j]= temp;
			i++;
			j--;
		}
		System.out.println("Reverse array is: ");
		for(int revArr:arr)
			System.out.print(revArr+" ");
		System.out.println();
		System.out.println("Reverse Sorted Array is: ");
		Arrays.sort(arr);
		return arr;
	}

}


