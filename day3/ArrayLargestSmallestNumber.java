package week1.day3;

public class ArrayLargestSmallestNumber {
	
	public static void main(String[] args) {
		int[] mark= {4,6,7,10,56,87};
		
		System.out.println("Selenium Assignment Week 1 Day 3 Classroom Assignment 2 - Array Largest and Smallest Number" + '\n'); 
		int marklength = mark.length;
		System.out.println("Length of the Array Input : " + marklength);
		
		System.out.println("Second Number in Array : "+ mark[1]);
		//int secondlast = marklength-2;
		System.out.println("Second number from last " + mark[(mark.length-2) ]  );
	}

}
