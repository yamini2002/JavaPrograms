package java_programs;

public class PrimeNumbers {

	public void prime(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (i > 1) {

				int count = 0;
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						count++;
						break;
					}
				}
				if (count == 0) {

					System.out.println(i);
				}
			}
		}
	}

	public static void main(String[] args) {
		int start = 1;
		int end = 100;

		PrimeNumbers obj = new PrimeNumbers();
		obj.prime(start, end);
	}

}
