package string_solving;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input : ");
		String s = sc.nextLine();
		char ch[] = s.toCharArray();

		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if ((ch[i] >= 'a') && (ch[i] <= 'z') || (ch[i] >= 'A') && (ch[i] <= 'Z')) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
