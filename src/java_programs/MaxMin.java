package java_programs;

public class MaxMin {
// To find Largest number in an array :
	public void max(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("The largest number is : "+max);
	}

// To find Smallest number in an array :
	
	public void min(int[] a) {
		int min = a[0];
		for(int j =0;j<a.length;j++) {
			if(min>a[j]) {
				min = a[j];
			}
		}
		System.out.println("The smallest number is : "+min);
	}
	public static void main(String[] args) {
		int a[] = { 61, 89, 33, 654, 86, 23, 90, 10, 3, 28 };
		MaxMin obj = new MaxMin();
		obj.max(a);
		obj.min(a);
	}

}
