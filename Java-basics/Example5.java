public class Example5
{
	public static void main(String []args)
	{
		
		Parent5 p=new Parent5();
		p.show();
		System.out.println("**************************");
		Child5 c=new Child5();
		c.show();		
	}
}
class Parent5
{
	int x=20;
	Parent5()
	{
		System.out.println("Parent Constructor called");
	}	
	public void show()
	{
		System.out.println("Value of x:"+x);
	}
}
class Child5 extends Parent5
{
	int y=30;
	Child5()
	{
		System.out.println("Child Constructor called");
	}
	public void show()  // Remove public keyword then explain the reason.
	{
		super.show();
		System.out.println("Value of Y:"+y);
	}
}


