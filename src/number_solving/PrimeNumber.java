package number_solving;

import java.util.Scanner;

public class PrimeNumber {

	public void prime(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (i > 1) {
				Boolean prime = true;
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						prime=false;
						break;
					}
				}
				if (prime) {
					System.out.println(i+" : is a Prime number");
				}
			}
		}

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		System.out.println("Enter the Second number : ");
		int b = sc.nextInt();
		PrimeNumber obj = new PrimeNumber();
		obj.prime(a, b);
	}

}
