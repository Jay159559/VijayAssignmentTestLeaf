package week1.day1;

public class TwoWheeler {
	
	int noOfWheels;
	float mileage;
	boolean isPunctured;
	char bikeNameFristLetter;
	 
	 public static void main(String[] args) {
		
		 TwoWheeler objTwoWheeler = new TwoWheeler();
		 objTwoWheeler.noOfWheels = 2;
		 System.out.println("Selenium Assignment Week 1 Day 1 Assignment 2 - TwoWheeler" + '\n');
		 System.out.println("Number of Wheels : "+ objTwoWheeler.noOfWheels + '\n');
		 
		 objTwoWheeler.mileage=45.5f;
		 System.out.println("Two Wheeler Mileage :" + objTwoWheeler.mileage + '\n' );
		 
		 objTwoWheeler.isPunctured=true;
		 System.out.println("Two Wheeler Puncture : " + objTwoWheeler.isPunctured +'\n');
		 
		 objTwoWheeler.bikeNameFristLetter='B';
		 System.out.println("Two Wheeler Bike Name First Letter :" + objTwoWheeler.bikeNameFristLetter);
	}

}
