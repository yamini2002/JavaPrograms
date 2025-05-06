package number_solving;

import java.util.Scanner;

public class PerfectNumber {

	public void perfect(int a) {
		int res =0;
		for(int i=1;i<=a/2;i++) {
			if(a%i==0) {
				res = res+i;
			}
		}if(res ==a) {
		System.out.println(res+" is a perfect number");
		}else {
			System.out.println(res+" is not a perfect number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input number : ");
		int input = sc.nextInt();
        PerfectNumber obj = new PerfectNumber();
        obj.perfect(input);
	}

}
