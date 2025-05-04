package number_solving;

import java.util.Scanner;

public class PrimeNumber {

	public void prime(int num) {
			if (num > 1) {
				Boolean prime = true;
				for (int i = 2; i <= num / 2; i++) {
					if (num % i == 0) {
						prime=false;
						break;
					}
				}
				if (prime) {
					System.out.println(num+" : is a Prime number");
				}else {
					System.out.println(num+" : is not a Prime number");
				}
			}
		}



	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		PrimeNumber obj = new PrimeNumber();
		obj.prime(a);
	}

}
