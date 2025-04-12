package java_programs;

public class ReverseNumber {
	public static void main(String args[]) {
		int input = 235;
		int a = input;
		int temp = 0;
		int sum =0;
		
		while(a!=0) {
		temp = a%10; 
		sum = sum*10+temp ;
		a = a/10; 
		
		}
		System.out.print("The reverse of " + input + " is  : " + sum);
	}
}
