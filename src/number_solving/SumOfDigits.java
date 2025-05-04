package number_solving;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a;
		int sum = 0;
		while (b > 0) {
			int temp = b % 10;
			sum = temp + sum;
			b = b / 10;

		}
		System.out.println("The sum of given number " + a + " is : " + sum);
	}

}
