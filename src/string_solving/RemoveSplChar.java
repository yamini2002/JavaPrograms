package string_solving;

import java.util.Scanner;

public class RemoveSplChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input : ");
		String s = sc.nextLine();

		String a = s.replaceAll("\\s",""); // removes space
		System.out.println(a);
		
		String b = s.replaceAll("[^a-zA-Z0-9]", ""); // removes spl chars
		System.out.println(b);
	}
}
