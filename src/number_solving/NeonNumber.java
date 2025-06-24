package number_solving;

import java.util.Scanner;

public class NeonNumber {

	public void neonnum(int a) {
		int square = a * a;
		int sum = 0;

		while (square > 0) {
			int tem = square % 10;
			sum = sum + tem;
			square = square / 10;
		}
		
		if (sum == a) {
			System.out.println(a + " is a Neon Number.");
		} else {
			System.out.println(a + " is not a Neon Number.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input number : ");
		int input = sc.nextInt();
		
		NeonNumber obj = new NeonNumber();
		obj.neonnum(input);
	}

}
