package week1day2;

public class IsPrime {

	public static void main(String[] args) {
		int primecounter=0;
		int input = 3;
		System.out.println("Selenium Assignment Week 1 Day 2 Assignment 3 - IsPrime");
		for (int i = 1; i < (input-1); i++) {
			if (input % i ==0) {
				primecounter=primecounter+1;
			}
		}
			if (primecounter>1) {
				System.out.println("Given Input " + input +" is not a Prime Number");
			}
			else { 
				System.out.println("Given Input " + input +" is a Prime Number");
			
		}

	}

	}

