package lab2;

public class ModifyArray {
		  static void modifyArray (int arr[], int n) {
			int temp, j = 0;
			int[] newArr = new int[n];
			System.out.println("Elements of original array: ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}

			for (int i = 0; i < n - 1; i++) {
				if (arr[i] != arr[i + 1]) {
					newArr[j++] = arr[i];
				}
			}
			newArr[j++] = arr[n - 1];

			for (int i = 0; i < j; i++) {
				arr[i] = newArr[i];
			}

			System.out.println();
			System.out.println();

			System.out.println("After removing duplicate elements : ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}

			for (int i = 0; i < arr.length; i++) {
				for (int k = i + 1; k < arr.length; k++) {
					if (arr[i] < arr[k]) {
						temp = arr[i];
						arr[i] = arr[k];
						arr[k] = temp;
					}
				}
			}

			System.out.println();
			System.out.println();
			System.out.println("Elements of array sorted in descending order: ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}

		}

		public static void main (String[] args) {
			int[] arr = { 12, 24, 24, 2, 89, 34, 45 };
			int len = arr.length;

			modifyArray(arr, len);

		}
	}

