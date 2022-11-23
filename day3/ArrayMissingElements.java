package week1.day3;

import java.util.Arrays;

public class ArrayMissingElements {

	public static void main(String[] args) {
	 int[] input1= {1,2,3,4,7,6,8};
	 
	 int input1length = input1.length;
			
		System.out.println("Selenium Assignment Week 1 Day 3  Assignment 2 - ArrayMissingElements" + '\n'); 
				
		System.out.println("Length of the given input 1 : " + input1length + '\n' );
		
		Arrays.sort(input1);
		
		//System.out.println("Sorted Array Input Numbers : "+ input1);
		int j=0;
		for (int i = input1[0]; i < input1length-1; i++) {
			
			if( i==input1[j]) {
				j++;
				System.out.println(i);
				
			}else {
				System.out.println("Missing Numbers are " + i );
			}
			
		}

	}

}
