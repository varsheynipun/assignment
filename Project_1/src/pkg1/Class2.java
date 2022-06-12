package pkg1;

public class Class2 
{
public int sum(int a, int b)
{
	int c;
	c=a+b;
	System.out.println("kailash");
	System.out.println("sum result is "+c);
	return c;
}
public int sub(int x, int y)
{
	int z;
	z=x-y;
	System.out.println("substract result is "+z);
	return z;
}
public void multi(int x1, int y1)
{
	int z1;
	z1=x1*y1;
	System.out.println("final result is "+z1);
}
public static void main(String[] args) 
{
    Class2 ob= new Class2();
    int sumresult=ob.sum(10,2);
    int subresult=ob.sub(10, 2);
    ob.multi(sumresult, subresult);
}
}
