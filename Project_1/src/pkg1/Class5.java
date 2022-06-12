package pkg1;

public class Class5 
{
    //((((10-2)+2)-2)*2)\2)
		public int sub(int f, int g)
		{
			int c;
			c=f-g;
			System.out.println("substract result is "+c);
			return c;
		}
		public int sum(int a, int b)
		{
			int c;
			c=a+b;
			System.out.println("sum result is "+c);
			return c;
		}
		public int sub2(int x, int y)
		{
			int c;
			c=x-y;
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
			System.out.println("Final result is "+c);
		}
		public static void main(String[] args) 
		{
		    Class5 ob= new Class5();
		    int subresult=ob.sub(10,2);
		    int sumresult=ob.sum(subresult,2);
		    int subresult1=ob.sub(sumresult,2);
		    int multiplyresult=ob.multi(subresult1,2);
		    ob.div(multiplyresult, 2);    
		}
		}

