package pkg1;

public class Automation2 
{
public Automation2() 
{
	this(1,9,7);	
	System.out.println("Parent Default Constructor");
}
public Automation2(int a) 
{
	this();
	System.out.println("Parent one parametrized Constructor");
}
public Automation2(int a, int b) 
{		
	this(2);
	System.out.println("Parent two parametrized Constructor");
}
public Automation2(int a, int b, int c) 
{
	System.out.println("Parent three parametrized Constructor");	
}
}
