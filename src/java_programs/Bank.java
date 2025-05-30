package java_programs;

import java.io.IOException;
import java.util.Scanner;

public class Bank {

	ReadProperty readObject = new ReadProperty();

	public void debitAmount(Scanner scanner) {
		System.out.println("Enter the amount to Debit...");
		int debitAmount = scanner.nextInt();
		int currentBalance = readObject.getValue("balance");
		if (debitAmount <= currentBalance) {
			int updatedBalance = currentBalance - debitAmount;
			readObject.setValue("balance", Integer.toString(updatedBalance));
			System.out.println("Amount debited successfully. New Balance: " + updatedBalance);
		} else {
			System.out.println("Insufficient balance. Transaction declined.");
		}

	}

	public void checkBalance() throws IOException { // to check the balance in you account
		int balance = readObject.getValue("balance");
		System.out.println("Balance in account is " + balance);
	}

	public void addBalance(Scanner scanner) {
		System.out.println("Enter the amount to Credit...");
		int creditAmount = scanner.nextInt();
		System.out.println("Re-Enter the amount to Confirm...");
		int confirmCredAmount = scanner.nextInt();
		if (creditAmount == confirmCredAmount) {
			int currentBalance = readObject.getValue("balance");
			int updatedBalance = currentBalance + creditAmount;
			System.out.println(updatedBalance);
			readObject.setValue("balance", Integer.toString(updatedBalance));
			System.out.println("Amount added successfully");
		} else {
			System.out.println("Entered wrong amount...Please try again...");
			return;
		}
	}

	public void verifyThePin(Scanner scanner) {
		System.out.println("Entered the pin number here...");
		int pinCode = 1234;
		int attempts =3;
		while (attempts > 0) {
			int pinNumber = scanner.nextInt();

			if (pinCode == pinNumber) {
				System.out.println("The Entered PIN is valid...");
			} else {
				System.out.println("You have entered invaild");
				attempts--;
				if (attempts > 0) {
	                System.out.println("Incorrect PIN. Attempts remaining: " + attempts);
	            } else {
	                System.out.println("Too many incorrect attempts. Access denied.");
	            }
			}
		}

	}

	public static void main(String[] args) throws IOException {
		Bank obj = new Bank();
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			// Display the bank banner and menu options
			System.out.println("\n*******************************************");
			System.out.println("*       Welcome to YAM Bank               *");
			System.out.println("*-----------------------------------------*");
			System.out.println("* 1. Check Balance                        *");
			System.out.println("* 2. Add Balance                          *");
			System.out.println("* 3. Debit Balance                          *");
			System.out.println("* 4. Exit                                 *");
			System.out.println("*******************************************");
			System.out.print("\nPlease enter your choice (1-4): ");

			// Read user choice
			while (!scanner.hasNextInt()) {
				System.out.print("Invalid input. Please enter a number between 1 and 3: ");
				scanner.next(); // Clear the invalid input
			}
			choice = scanner.nextInt();

			// Process the user's choice
			switch (choice) {
			case 1:
				obj.verifyThePin(scanner);
				obj.checkBalance();
				break;
			case 2:
				obj.verifyThePin(scanner);
				obj.addBalance(scanner);
				break;
			case 3:
				obj.verifyThePin(scanner);
				obj.debitAmount(scanner);
				break;
			case 4:
				System.out.println("Thank you for using YAM Bank. Goodbye!");
				break;
			default:
				System.out.println("Invalid choice. Please select a valid option.");
			}
		} while (choice != 3);

		scanner.close();
	}
}
