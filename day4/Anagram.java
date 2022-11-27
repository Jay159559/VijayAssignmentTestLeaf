package week1.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String input1 = "stops";
		String input2 = "potsss";
		
		int lengthinput1 = input1.length();
		int lengthinput2 = input2.length();
		
		if (lengthinput1 == lengthinput2 ) {
			
			char[] chinput1 = input1.toCharArray();
			char[] chinput2 = input2.toCharArray();
			
			Arrays.sort(chinput1);
			Arrays.sort(chinput2);
			
			System.out.println(chinput1);
			System.out.println(chinput2);
			
			if(String.valueOf(chinput1).equals(String.valueOf(chinput2))){
				System.out.println("Both the given Inputs - Input 1 : " + input1 + " Input2 : " + input2 + " are same");
			}
			
		}
		else {
			System.out.println("Both the given Inputs - Input 1 : " + input1 + " Input2 : " + input2 + " are not same");
		} 
		

	}

}
