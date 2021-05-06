package Arithmatic;

public class NoOfVowelsInString 
{
	public static void main(String[] args) 
	{
		String s1 ="is beautiful enjoy it";
		int count=0;
		char[] chr = s1.toCharArray();
		for(char ex :chr)
		{
			switch(ex)
			{
			case 'a':
			case 'o':
			case 'u':
			case 'i':
			case 'e':
			count++;
			break;
			default:
			}
		}
		System.out.println(count);
	}
}
