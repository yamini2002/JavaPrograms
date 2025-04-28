package java_programs;

public class StringPalinedrome {
	
	public void palinedrome(String a){
		String word = a;
		String rword = "";
		for(int i =word.length()-1;i>=0;i--) {
			 rword = rword +word.charAt(i);
		}
		System.out.println(rword);
		if(rword.equalsIgnoreCase(word)) {
			System.out.println("The given string "+ word+ " is a palinedrome string");
		}else {
			System.out.println("The given string "+ word+ " is not a palinedrome string");
		}
	}

	public static void main(String[] args) {
		String a = "Madam";
		StringPalinedrome obj = new StringPalinedrome();
		obj.palinedrome(a);
	}

}
