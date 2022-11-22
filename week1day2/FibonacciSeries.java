package week1day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum =1;
		int sum = 0;
		for (int i = 0; i <=11; i++) {
			System.out.println(sum);
			sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
		}
	}

}
