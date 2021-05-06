package Arithmatic;

public class ReverseStringByWords 
{
	public static void main(String[] args) 
	{
		String word="is beautiful enjoy it";
		String[] chr = word.split(" ");
		for(int i=chr.length-1;i>=0;i--)
		{
			System.out.println(chr[i]);
		}
	}
}
