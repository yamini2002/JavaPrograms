package java_programs;

public class RightTriangle {
	
	public void triangle(int num) {
		for(int i =0;i<=num;i++) {
			for(int j =0; j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int num = 5;
		RightTriangle obj = new RightTriangle();
		obj.triangle(num);

	}

}
