package number_solving;

import java.util.Scanner;

public class NumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a;
		int count =0;
		while(a>0) {
			int mod = a%10;
			count++;
			a = a/10;
		}
		System.out.println("The count of digits of the given number "+ b +" is : " + count);
	}

}
