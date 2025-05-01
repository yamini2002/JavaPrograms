package java_programs;

public class Factorial {

	public static void main(String[] args) {
		
		int input = 8;
		int output = 1;
		
		for(int i=1;i<=input;i++) {
			 output = output*i;
			
		}
         System.out.println("The factorial of number "+input+ " is: "+output);
	}

}
