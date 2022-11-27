package week1.day4;

public class CharOccurance {

	public static void main(String[] args) {
	 String input = "Welcome to Chennai";
	 int count = 0;
	 char[] chinput = input.toCharArray();
	 int inputlength = input.length();
	 
	 for (int i = 0; i < inputlength; i++) {
		 
		 if(input.charAt(i) == 'e') {
			 count = count+1;
		 }
		
	}
	 System.out.println("Occurrance Count :" + count);	
	}

}
