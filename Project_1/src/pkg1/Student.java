package pkg1;

public class Student 
{ // boundary of the class
	int a=222; //variable 12, 555
	public void Nipun()    //method name ----Nipun
	{  // boundary of the method
		System.out.println("Welcome to all of you");
	}
    public static void main(String[] args) 
    {
	Student abc = new Student();
	abc.Nipun();//called the method Nipun
	System.out.println(abc.a);
	abc.a = 123;
	System.out.println(abc.a);
    abc.a = 456;
    System.out.println(abc.a);
	}
}
