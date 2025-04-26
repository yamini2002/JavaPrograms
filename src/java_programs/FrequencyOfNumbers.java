package java_programs;

public class FrequencyOfNumbers {
	public void frequency(int[] a) {
		int[] fr = new int[a.length];
		int count;
		System.out.println("The frequency of numbers present in the array");
		for (int i = 0; i < a.length; i++) {
			if (a[i] == -1) {
				continue; 
			}
			count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = -1;
				}
			}
			System.out.println("Number: " + a[i] + ", Frequency: " + count);

		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 1, 1, 6, 5, 9, 6, 3, 10 };
		FrequencyOfNumbers obj = new FrequencyOfNumbers();
		obj.frequency(a);
	}

}
