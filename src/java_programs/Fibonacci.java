package java_programs;

public class Fibonacci {

	public void fibonacci(int num) {
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for(int i =2;i<=num;i++) {
			int temp =a+b;
			a=b;
			b=temp;
			System.out.println(temp);
		}
	}
	public static void main(String[] args) {
		int num = 10;
		Fibonacci obj = new Fibonacci();
		obj.fibonacci(num);

	}

}
