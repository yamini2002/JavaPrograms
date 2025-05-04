package number_solving;

import java.util.Scanner;

public class FactorialOfNum {
	
	public int factorial(int a) {
		if(a<=1) {
			return 1;
		}else {
			return factorial(a-1)*a;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		FactorialOfNum obj = new FactorialOfNum();
		System.out.println("The factorial of "+a+" is "+obj.factorial(a));
		

	}

}
