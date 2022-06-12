package pkg1;

public class Class6 

	{
	public void m1()
	{
		System.out.println("Default Constructor");
		this.m2(22);
	}
	public void m2(int a)
	{
		System.out.println("one parametirized Constructor");
		this.m3(34,67);
	}
	public void m3(int a, int b)
	{
		System.out.println("two parametirized Constructor");
		this.m5(1, 3, 7, 5);
	}
	public void m4(int a, int b,int c)
	{
		System.out.println("three parametirized Constructor");
		this.m1();
	}
	public void m5(int a, int b,int c,int d)
	{
		System.out.println("four parametirized Constructor");
	}
	public static void main(String[] args) 
	{
	Class6 ref=new Class6();
	ref.m4(1,2,3);
	}
}
