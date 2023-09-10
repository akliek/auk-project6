package src.part3;

import java.util.Map;
import java.util.Scanner;

public class ContactsDatabase {
	public static String getUserString(Scanner scanner) {
		return  scanner.nextLine();
	}

	public static void addContacts(Map<String, String> contactBook, Scanner scanner) {
		String input;

		System.out.println("Enter a name and a phone number of a contact. Press 'x' or empty line to finish.");
		while (true) {
			input = getUserString(scanner);
			if (input.isEmpty() || input.equals("x")) {
				break;
			}
			if (input.split(" ").length != 2) {
				System.out.println("Invalid input. Try again.");
				continue;
			}
			contactBook.put(input.split(" ")[0], input.split(" ")[1]);
		}
	}

	public static void showContacts(Map<String, String> contactBook) {
		System.out.println("Your contact book:");
		for (Map.Entry<String, String> entry : contactBook.entrySet()) {
			System.out.printf("Name: %s, Phone number: %s\n", entry.getKey(), entry.getValue());
		}
	}

	public static void searchInContacts(Map<String, String> contactBook, Scanner scanner) {
		System.out.print("Enter a name of a contact: ");
		String name = getUserString(scanner);
		if (contactBook.containsKey(name)) {
			System.out.printf("Name: %s, Phone number: %s\n", name, contactBook.get(name));
		} else {
			System.out.println("Contact not found.");
		}
	}

	public static void editContact(Map<String, String> contactBook, Scanner scanner) {
		System.out.print("Enter a name of a contact: ");
		String name = getUserString(scanner);
		if (contactBook.containsKey(name)) {
			System.out.print("Enter a new phone number: ");
			String phoneNumber = getUserString(scanner);
			contactBook.put(name, phoneNumber);
		} else {
			System.out.println("Contact not found.");
		}
	}

	public static void deleteAllContacts(Map<String, String> contactBook) {
		contactBook.clear();
	}

	public static void addSampleContacts(Map<String, String> contactBook) {
		contactBook.put("John", "123456789");
		contactBook.put("Mary", "987654321");
		contactBook.put("Peter", "123123123");
	}

	public static void deleteContact(Map<String, String> contactBook, Scanner scanner) {
		System.out.print("Enter a name of a contact: ");
		String name = getUserString(scanner);
		if (contactBook.containsKey(name)) {
			contactBook.remove(name);
		} else {
			System.out.println("Contact not found.");
		}
	}

	public static void showUsage() {
		System.out.println("\nUsage (Enter a number to proceed):");
		System.out.println("1. Add contacts");
		System.out.println("2. Show contacts");
		System.out.println("3. Search in contacts");
		System.out.println("4. Edit contact");
		System.out.println("5. Delete contact");
		System.out.println("6. Delete all");
		System.out.println("7. Add sample compacts");
		System.out.println("8. Exit\n");
	}

	public static void main(String[] args) {
		String input;
		Scanner scanner = new Scanner(System.in);
		Map<String, String> contactBook = new java.util.HashMap<>();

		while (true) {
			showUsage();

			input = getUserString(scanner);
			switch (input) {
				case "1" -> addContacts(contactBook, scanner);
				case "2" -> showContacts(contactBook);
				case "3" -> searchInContacts(contactBook, scanner);
				case "4" -> editContact(contactBook, scanner);
				case "5" -> deleteContact(contactBook, scanner);
				case "6" -> deleteAllContacts(contactBook);
				case "7" -> addSampleContacts(contactBook);
				case "8" -> {
					scanner.close();
					return;
				}
				default -> showUsage();
			}
		}
	}
}
