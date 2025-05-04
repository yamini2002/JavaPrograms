package number_solving;

import java.util.Scanner;

public class FibboSeries {

	public void fibbonacci(int num) {
		int a = 0;
		int b = 1;
		int tem = 0;
		System.out.println(a);
		System.out.println(b);
		for (int i = 2; i < num; i++) {
			tem = a + b;
			a = b;
			b = tem;
			System.out.println(tem);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		FibboSeries obj = new FibboSeries();
		System.out.println("The Fibbonacci Series of " + a + " are : ");
		obj.fibbonacci(a);
	}

}
