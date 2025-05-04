package number_solving;

import java.util.Scanner;

public class ReverseTheDigits {

	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a;
		int sum =0;
		while(b>0){
			int temp = b%10;
			sum = sum*10+temp;
			b = b/10;
		}
		System.out.println("The reverse number of given input "+ a+" is : "+sum);
	}
}
