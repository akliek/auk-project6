package src.part2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayHandling {
	public static int getUserInt(Scanner scanner) {
		while (true) {
			try {
				return scanner.nextInt();
			} catch (InputMismatchException e) {
				scanner.nextLine();
				System.out.print("\u001B[31mIt is not a number. Try again: \u001B[0m");
			}
		}
	}

	public static int[] getArray(Scanner scanner) {
		System.out.print("Please, enter the size of the array: ");
		int size = getUserInt(scanner);
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.printf("Please, enter the %d element of the array: ", i + 1);
			array[i] = getUserInt(scanner);
		}
		return array;
	}

	public static int[] getRandomArray(Scanner scanner) {
		System.out.print("Please, enter the size of the array: ");
		int size = getUserInt(scanner);
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		return array;
	}

	public static void printSumArray(int[] arr) {
		int sum = 0;
		for (int j : arr) {
			sum += j;
		}
		System.out.printf("The sum of the array is: %d\n", sum);
	}

	public static void printLargestValues(int[] arr) {
		int max = arr[0];

		for (int j : arr) {
			if (j > max) {
				max = j;
			}
		}
		System.out.printf("The largest value of the array is: %d\n", max);
	}

	public static int getIndexOfValue(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public static void printArray(int[] array) {
		System.out.print("The array is: ");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] array = getArray(scanner);
		printSumArray(array);

		array = getRandomArray(scanner);
		printArray(array);
		printLargestValues(array);

		System.out.print("Please, enter the value to find: ");
		int value = getUserInt(scanner);
		int index = getIndexOfValue(array, value);
		if (index == -1) {
			System.out.printf("The value %d is not found in the array.\n", value);
		} else {
			System.out.printf("The value %d is found at index %d.\n", value, index);
		}
	}
}
