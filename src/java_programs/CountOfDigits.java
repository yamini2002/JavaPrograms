package java_programs;

public class CountOfDigits {

	public static void main(String[] args) {
		
		int num = 27379;
		int count =0;
		int temp =0;
		while(num!=0) {
		temp = num/10;
		num = temp;
		count++;
		}
		System.out.println("The count is : " + count);

	}

}
