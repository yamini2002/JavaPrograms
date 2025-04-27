package java_programs;

public class Palindrome {

	public void palindrome(int a) {
		int num = a;
		int temp;
		int sum = 0;
		while (num >= 1) {
			temp = num % 10;
			sum = sum * 10 + temp;
			num = num / 10;
		}
		System.out.print(sum);

		if (sum == a) {
			System.out.print(" : The given number is a palindrome.");
		} else {
			System.out.print(" : The given number is not a palindrome.");
		}
	}

	public static void main(String[] args) {
		int a = 1221;
		Palindrome obj = new Palindrome();
		obj.palindrome(a);
	}

}
