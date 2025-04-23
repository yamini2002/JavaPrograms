package java_programs;

public class DuplicateNumber {

	public void DuplicateNum(int len, int[] a) {
		int count = 1;

		System.out.println("The Duplicate numbers present in the array are :");

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = -1; // to avoid recounting
					if (a[i] != -1) {
						System.out.println(" No of times the number " + a[i] + " repeated : " + count);
						break;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		DuplicateNumber obj = new DuplicateNumber();
		int a[] = { 1, 10, 4, 7, 3, 14, 75, 36, 10, 3, 44, 3, 23 };
		int len = a.length;
		obj.DuplicateNum(len, a);

	}

}
