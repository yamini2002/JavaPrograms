package java_programs;

public class CountOfDigits {

	public static void main(String[] args) {
		
		int num = 27379;
		int count =0;
		int temp =num;
		while(num!=0) {
		num = num/10;
		
		count++;
		}
		System.out.println("The count of "+temp+ " is : " + count);

	}

}
