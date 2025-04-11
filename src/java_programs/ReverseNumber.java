package java_programs;

public class ReverseNumber {
	public static void main(String args[]) {
		int input = 235;
		int temp = 0;
		int temp1 =0;
		
		while(input!=0) {
		temp = input%10;
		temp1 =input/10;
		input = temp1;
		System.out.print(temp);
		}
	}
}
