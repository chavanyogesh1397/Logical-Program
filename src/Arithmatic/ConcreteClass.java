package Arithmatic;

public class ConcreteClass extends AbstractClassEx
{
	public void color()
	{
		System.out.println("White");
	}
	
	public static void main(String[] args) 
	{
		AbstractClassEx c = new ConcreteClass();
		c.color();
	}
}
