package src.part1;

public class Iteration {
	public static void main(String[] args) {
		String[] arr = {"Hello", "World", "!"};

		System.out.println("Print array elements using for loop:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

		System.out.println("\nPrint array elements using enhanced for loop:");
		for (String s : arr) {
			System.out.print(s);
		}

		System.out.println("\nPrint array elements using while loop:");
		int i = 0;
		while (i < arr.length) {
			System.out.print(arr[i]);
			i++;
		}
	}
}
