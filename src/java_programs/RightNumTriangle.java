package java_programs;

public class RightNumTriangle {

	public void reverse(int a) {
		System.out.println("The reverse order : ");
		for(int i =0;i<=a;i++) {
			for(int j =0;j<=i;j++) {
				System.out.print(a--+" ");
			}
			System.out.println(" ");
		}
	}
	
	public void order(int a) {
		System.out.println("The usual way of num triangle : ");
		for(int i =0;i<=a;i++) {
			for(int j =0;j<=i;j++) {
				System.out.print(j+1 +" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int a = 9;
		RightNumTriangle obj = new RightNumTriangle();
		obj.reverse(a);
		System.out.println(" ");
		obj.order(a);
		}

}
