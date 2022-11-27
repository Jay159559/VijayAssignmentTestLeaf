package week1.day4;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "madams";
		String rev ="";
		char[] chinput = input.toCharArray();
		int length = input.length();
		
		for (int i = length-1; i>= 0 ; i--) {
			
			rev=rev+chinput[i];
			System.out.println(rev);
			
		}
		
		if(rev.equalsIgnoreCase(input)) {
			System.out.println("Given Input - " + input + " - is a Palindrome");
		} else {
			System.out.println("Given Input - " + input + " - is not Palindrome");
		}

	}

}
