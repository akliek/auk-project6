package src.part1;

public class ArrayCreation {
	public static void main(String[] args) {
		// different ways to create an int array
		int n = 6;
		int[] i = new int[2];
		String[] s = new String[n];
		char[] c = {'a', 'b', 'c', 'd', 'e'};

		// print size of array
		System.out.println("The length of array i is " + i.length);
		System.out.println("The length of array s is " + s.length);
		System.out.println("The length of array c is " + c.length);
	}
}
