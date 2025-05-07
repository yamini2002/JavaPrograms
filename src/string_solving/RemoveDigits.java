package string_solving;

import java.util.Scanner;

public class RemoveDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input : ");
		String s = sc.nextLine();
		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if ((ch[i] >= 'a') && (ch[i] <= 'z') || (ch[i] >= 'A') && (ch[i] <= 'Z')) {
				System.out.print(ch[i]);
			}
		}

	}

}
