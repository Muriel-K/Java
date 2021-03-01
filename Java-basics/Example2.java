public class Example2 
{
	public static void main(String []args)
	{
		Object obj;
		obj=new Parent2();
		//obj.show_x(); // Reason: why showing error
		obj=new Child2();
		obj.toString();
		
		//obj.show_y();  // Reason : why showing error
		Parent2 p=new Parent2();
		p.show_x();
		Child2 c=new Child2();
		c.show_y();	
		
	}
}
class Parent2
{
	int x=20;
	Parent2()
	{
		System.out.println("Parent Constructor called");
	}	
	public String toString()
	{
		return "x:"+x;
	}
	public void show_x()
	{
		System.out.println("Value of x:"+x);
	}
}
class Child2 extends Parent2
{
	int y=30;
	Child2()
	{
		System.out.println("Child Constructor called");
	}
	public String tostring()  // Remove public and check it
	{
		return "y:"+y;
	}
	public void show_y()  // Remove public keyword then check it
	{
		System.out.println("Value of Y:"+y);
	}
}
