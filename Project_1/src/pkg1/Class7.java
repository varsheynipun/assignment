package pkg1;

public class Class7 

{
	int deepak=212;   //global variable
	public void m1()
	{
		int deepak=122;
		deepak=deepak+1;
		System.out.println(deepak);
	}
	public static void main(String[] args) 
	{
		Class7 obj=new Class7();
		obj.m1();
	}
	 
}
