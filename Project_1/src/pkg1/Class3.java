package pkg1;

public class Class3 
{
public Class3()
{
	this(1,2,3);
	System.out.println("Default Constructor");
}
public Class3(int a)
{
	this(23,24);
	System.out.println("one parametirized Constructor");
}
public Class3(int a, int b)
{
	this();
	System.out.println("two parametirized Constructor");
}
public Class3(int a, int b,int c)
{
	System.out.println("three parametirized Constructor");
}
public Class3(int a, int b,int c,int d)
{
    this(10);
	System.out.println("four parametirized Constructor");
}
public static void main(String[] args) 
{
Class3 ref=new Class3(12,13,14,15);
}
}

