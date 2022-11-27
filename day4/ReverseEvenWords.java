package week1.day4;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester"; 
		String[] str1 = test.split(" ");
		for (int i = 0; i < str1.length; i++) 
		{
			if((i+1)%2==0)
			{
				String  s =str1[i];
				char[] ch = s.toCharArray();
				String output="";
				for (int j = ch.length-1; j >=0; j--) 
				{
					output=output+ch[j];
				}
				str1[i]=output;
			}	
		}
		for (int i = 0; i < str1.length; i++) 
		{
			System.out.print(str1[i]+" ");
		}

	}

}
