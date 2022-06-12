package pkg1;

public class Class4 
{     //((((10+2)+2)-2)*2)\2)
public int sum(int a, int b)
{
	int c;
	c=a+b;
	System.out.println("sum result is "+c);
	return c;
}
public int sum2(int d,int e)
{
	int c;
	c=d+e;
	System.out.println("sum result is "+c);
	return c;
}
public int sub(int f, int g)
{
	int c;
	c=f-g;
	System.out.println("substract result is "+c);
	return c;
}
public int multi(int i, int j)
{
	int c;
	c=i*j;
	System.out.println("multiplication result is "+c);
	return c;
}
public void div(int k, int l)
{
	int c;
	c=k/l;
	System.out.println("multiplication result is "+c);
}
public static void main(String[] args) 
{
    Class4 ob= new Class4();
    int sumresult=ob.sum(10,2);
    int sumresult1=ob.sum2(sumresult,2);
    int subresult=ob.sub(sumresult1,2);
    int multiplyresult=ob.multi(subresult,2);
    ob.div(multiplyresult, 2);    
}
}