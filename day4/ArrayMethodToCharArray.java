package week1.day4;

public class ArrayMethodToCharArray {
public static void main(String[] args) {
	String name = "Test Leaf";
	char[] chars = name.toCharArray();
	
	System.out.println(chars);
	
	for (int i = 0; i < chars.length; i++) {
		System.out.print(chars[i]);
	}
}
}
