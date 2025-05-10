package string_solving;

import java.util.Scanner;

public class Substring {

	public void start(String s) {
		boolean a = s.startsWith("ya");
		System.out.println(a);
	}

	public void end(String s) {
		boolean b = s.endsWith("ni");
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input : ");
		String s = sc.nextLine();

		Substring obj = new Substring();
		obj.start(s);
		obj.end(s);

	}

}
