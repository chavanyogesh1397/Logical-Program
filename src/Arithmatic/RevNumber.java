package Arithmatic;

public class RevNumber 
{
	public static void main(String[] args) 
	{
		int num=125;
		int rev =0;
		while(num!=0)
		{
			int r = num%10;
			rev=rev*10+r;//52
			
			num =num/10;
		}
		System.out.println(rev);
	}
}
