package pkg1;

public class Student1 
{ 
	int rollno;
	int age;   
	public void display1()    
	{  
		System.out.println("Your rollno is");
	}
	public void display2()    
	{  
		System.out.println("Your age is");
	}
    public static void main(String[] args) 
    {
	Student1 Nipun = new Student1();
	Nipun.display1();  
	Nipun.rollno = 52012092;
	System.out.println(Nipun.rollno);
	Nipun.display2();  
	Nipun.age = 28;
	System.out.println(Nipun.age);
	}
}
