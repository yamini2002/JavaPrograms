package java_programs;

public class RemoveLeadingZeros {

	public String remove(String input) {
		int len = input.length();
		int i=0;
		while(i<len && input.charAt(i)=='0') {
			i++;
		}
		String remove = input.substring(i,len);
		return remove;
	}
	public static void main(String[] args) {
		String input = "00000123456";
		
		RemoveLeadingZeros obj = new RemoveLeadingZeros();
		//obj.remove(input);
		System.out.println(obj.remove(input));
	}

}
