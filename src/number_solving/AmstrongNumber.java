package number_solving;

import java.util.Scanner;

public class AmstrongNumber {
	
	public void number(int a) {
		int n = a;
		int temp=0;
		while(a>0) {
			int b = a%10;
			 temp = temp+(b*b*b);
			 a = a/10;
		}
		if(n==temp){
		System.out.println(temp +" is an Armstrong number.");
		}else {
		System.out.println(temp +" is not an Armstrong number.");	
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int input = sc.nextInt();
		AmstrongNumber obj = new AmstrongNumber();
		obj.number(input);		
	}
}
