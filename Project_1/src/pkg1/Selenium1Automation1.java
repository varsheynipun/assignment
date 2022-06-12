package pkg1;

public class Selenium1Automation1 extends Selenium1
{
 public void m3()
 {
	 System.out.println("I am child method");
 }
	public static void main(String[] args)
	{
		Selenium1Automation1 s=new Selenium1Automation1();	
		s.m1();
		s.m2();
		s.m3();
	}
	
}
