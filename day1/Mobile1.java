package week1.day1;

public class Mobile1 {
	char mobileLogo;
	short noOfMobilePiece;
	int modelNumber;
	float mobilePrice;
	boolean isDamaged;
	
	
	public static void main(String[] args) {
		Mobile1 objMobile1 = new Mobile1();
		 System.out.println("Selenium Assignment Week 1 Day 1 Assignment 3 - Mobile" + '\n');
		
		 objMobile1.mobileLogo='A';
		 System.out.println("Mobile Logo :" + objMobile1.mobileLogo + '\n');
		 
		 objMobile1.noOfMobilePiece=12;
		 System.out.println("Mobile Pieces :" + objMobile1.noOfMobilePiece + '\n');
		
		 objMobile1.modelNumber=5;
		 System.out.println("Mobile Number :" + objMobile1.modelNumber + '\n');
		 
		 objMobile1.mobilePrice=15000.5f;
		 System.out.println("Mobile Price :" + objMobile1.mobilePrice + '\n');
		 
		 objMobile1.isDamaged=false;
		 System.out.println("Mobile is Damaged :" + objMobile1.isDamaged + '\n');
	}
}
