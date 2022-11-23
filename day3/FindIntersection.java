package week1.day3;

public class FindIntersection {

	public static void main(String[] args) {
		int[] input1 = {3,2,11,4,6,7};
		int[] input2 = {1,2,8,4,9,7};
		
		int input1length = input1.length;
		int input2length = input2.length;
		
		System.out.println("Selenium Assignment Week 1 Day 3  Assignment 1 - FindIntersection" + '\n'); 
				
		System.out.println("Length of the given input 1 : " + input1length + '\n' );
		System.out.println("Length of the given input 2 : " + input2length + '\n' );
		
		for (int i = 0; i < input1.length; i++) {
			for (int j = 0; j < input2.length; j++) {
				
				if(input1[i] == input2[j]) {
					
					System.out.println("Common Numbers are : " + input1[i] );
				}
				
			}
			
		}

	}

}
