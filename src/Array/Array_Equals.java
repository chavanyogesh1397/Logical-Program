package Array;

import java.util.Arrays;

public class Array_Equals 
{
	public static void main(String[] args) 
	{
		int abc[]= {10,20,30};
		int xyz[]= {10,20,40};
		int pqr[]= {10,20,30};
		 boolean result = Arrays.equals(abc, pqr); //Arrays.equals();
		 System.out.println(result);
	}
}
