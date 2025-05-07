package string_solving;

import java.util.Scanner;

public class WordsCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input : ");
		String s = sc.nextLine();
		
		int count=1;
		for(int i =0;i<s.length()-1;i++) {
			if((s.charAt(i)==' ') && (s.charAt(i+1) !=' ')) {
				count++;
			}
			
	}
		System.out.println("The count of given string is : "+ count);

}
}