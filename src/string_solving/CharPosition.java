package string_solving;

import java.util.Scanner;

public class CharPosition {

	public void charAt(String s) {
		char a = s.charAt(3);
		System.out.println("The char value og given string is : " + a);
	}

	public void indecOf(String s) {
		int b = s.indexOf("ini");
		System.out.println("The index value og given string is : " + b);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input : ");
		String s = sc.nextLine();

		CharPosition obj = new CharPosition();
		obj.charAt(s);
		obj.indecOf(s);
	}

}
