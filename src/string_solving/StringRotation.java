package string_solving;

import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first input : ");
		String s1 = sc.nextLine();
		System.out.print("Enter the second input : ");
		String s2 = sc.nextLine();
		
		if(s1.length()==s2.length()) {
			String s = s1+s1;
			boolean a = s.contains(s2);
			System.out.println(a);
		}else
			System.out.println("false");

	}

}
