package palindrome;

import java.util.Scanner;

public class String_Palindrome_or_Not 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = s.next();
		String temp = "";
		for(int i=st.length()-1;i>=0;i--)
		{
			char ch = st.charAt(i);
			temp = temp + ch;
		}
		if(temp.equals(st))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
