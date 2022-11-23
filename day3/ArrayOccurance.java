package week1.day3;

public class ArrayOccurance {

	public static void main(String[] args) {
		int[] mark= {23,5,67,89,67,43,56,22,57,78,98,87,45,34,56,78,78,90,78,78,78,89,78 ,
                67,78,44,55,66,77,88,99,99,00,12,323,321,34,55,78,78};
		
		System.out.println("Selenium Assignment Week 1 Day 3 Classroom Assignment 1 - Array Occurance" + '\n'); 
		int marklength = mark.length;
		System.out.println("Length of the Array Input : " + marklength);
		
		int occurance = 0;
		int num=78;
		
		for (int i = 0; i < mark.length; i++) {
			
			if (mark [i] == num) {
				occurance++;
			
		}
	
	}
		System.out.println("Occurance of the given input " + num + " is " + occurance );
		

	}}
