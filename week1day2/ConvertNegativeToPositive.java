package week1day2;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		int input = -40;
		System.out.println("Selenium Assignment Week 1 Day 2 Assignment 1 - ConvertNegativeToPositive"+'\n');
		if (input <0) {
			System.out.println("Given Number " + input + " is a negative number" + '\n');
			int convert = -(input);
			System.out.println("Converted Number " + convert);
		} else {
			System.out.println("Given Number " + input + " is not a negative number" + '\n');
		}

	}

}
