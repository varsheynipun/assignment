package pkg1;

public class Selenium2 extends Automation2
{
	public Selenium2() 
	{
		super(12,45);
		System.out.println("Child Default Constructor");
	}
	public Selenium2(int a) 
	{
		this(67,27);
		System.out.println("Child one parametrized Constructor");
	}
	public Selenium2(int a, int b) 
	{
		this(19,20,28);
		System.out.println("Child two parametrized Constructor");
	}
	public Selenium2(int a, int b, int c) 
	{
		this();	
		System.out.println("Child three parametrized Constructor");
	}
	public static void main(String[] args) 
	{
		Selenium2 s=new Selenium2(12);
	}
}
