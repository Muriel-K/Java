
// Understand the execution flow of the following code 
public class Example1 
{
	public static void main(String []args)
	{
		// Dynamic Polymorphism
		Object obj;
		obj=new Object();
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		System.out.println("******************");
		obj=new Parent1();
		System.out.println(obj.toString());
		obj=new Child1();
		System.out.println(obj.toString());		
	}
}
class Parent1
{
	int x=20;
	Parent1()
	{
		System.out.println("Parent Constructor called");
	}	
	public String toString()
	{
		return "x:"+x;
	}
}
class Child1 extends Parent1
{
	int y=30;
	Child1()
	{
		System.out.println("Child Constructor called");
	}
	public String toString()
	{
		return "y:"+y;
	}
}
