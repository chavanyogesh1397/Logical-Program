package Arithmatic;

public class PalindromeString 
{
	public static void main(String[] args) 
	{
		String s1 ="madam";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			 char chr = s1.charAt(i);
			 rev =rev+chr;
		}
	System.out.println(rev);	
	if(s1.equals(rev))
	{
		System.out.println("no is palindrome");
	}
	else
	{
		System.out.println("No is not palindrome");
	}
	}
}
