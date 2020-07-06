package Strings;

public class Ex3 {
	public static void main(String[] args) {
		String str = "Wipro";
		int n = str.length();
		
		String r= "";
		
		if (n < 2) r = str;
		else r= str.substring(0, 2);
		
		String output = "";
		
		for (int i = 0; i < n; i++) {
			output +=r;
		}
		
		System.out.println(output);

	}

}
