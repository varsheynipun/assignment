package pkg1;

public class Class8 
{
	int deepak;   //global variable
	public void m1(int deep)    //local
	{
		deep=deepak;
	}
	public static void main(String[] args) 
	{
		Class8 ref=new Class8();
		ref.m1(1222);
		ref.deepak=888;	
		System.out.println(ref.deepak);
	}
}