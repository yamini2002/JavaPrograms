package number_solving;

import java.util.Scanner;

public class GCD {

	public void gcdnum(int a, int b) {
		int min = a > b ? a : b;
		while (min > 1) {
			if ((a % min == 0) && (b % min == 0)) {
				System.out.println("The GCD of "+a+" and "+b+" is : "+min);
				break;
			}
			min--;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int a = sc.nextInt();
		System.out.print("Enter the second number : ");
		int b = sc.nextInt();
		GCD obj = new GCD();
		obj.gcdnum(a, b);
	}

}
