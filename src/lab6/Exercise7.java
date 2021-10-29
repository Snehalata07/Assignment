package lab6;

	import java.util.*;
	public class Exercise7 {
		public static Integer[] getSorted(TreeSet<Integer> int_arr)
		{
			int size = int_arr.size();
			Integer arr[] = new Integer[size];
			arr = int_arr.toArray(arr);
			
			for(int i=0; i<size; i++)
			{
				String val = String.valueOf(arr[i]);
				String rev_val = new StringBuilder(val).reverse().toString();
				arr[i] = Integer.parseInt(rev_val);
			}
			
			Arrays.sort(arr);
			return arr;
		}
		
		public static void main(String[] args) {
			
			TreeSet<Integer> ts= new TreeSet<>();
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the array size");
			int n = sc.nextInt();
			System.out.println("enter the "+n+" element");
			int arr[]=new int[n];
			for(int i=0; i<n; i++)
			{
				int number = sc.nextInt();
				ts.add(number);
			}
			
//			System.out.println(int_arr);
			int size = ts.size();
			Integer result[] = getSorted(ts);
			
			System.out.println("Array after Revrsing and sorting the array :- ");
			for(int i: result)
				System.out.print(i + "  ");
			
		}
	}

