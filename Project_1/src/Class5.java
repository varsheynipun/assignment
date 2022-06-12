
public class Class5 
{
		public void m1()
		{
			System.out.println("I am first method");
			this.m2();
		}
		public void m2()
		{
			System.out.println("Iam second method");
		}
		public static void main(String[] args) 
		{
		Class5 ref=new Class5();
		ref.m1();
		}
}
