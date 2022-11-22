package week1day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		System.out.println("Selenium Assignment Week 1 Day 2 Assignment 2 - MyCalculator");
		Calculator objcalc = new Calculator();
		int add = objcalc.add(1,50, 60);
		System.out.println("Addition of the given input : "+ add + '\n');
		
		int sub = objcalc.sub(150, 60);
		System.out.println("Subtraction of the given input : "+ sub + '\n');
		
		double multiply = objcalc.mul(4,3);
		System.out.println("Multiplication of the given input : "+ multiply + '\n');
		
		float division = objcalc.divide(4,3);
		System.out.println("Division of the given input : "+ division + '\n');

	}

}
