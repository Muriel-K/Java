/* Understand the execution flow of the following code after 
 removing the error at line 45. */
public class Example6
{
	public static void main(String []args)
	{
		Child6 c=new Child6();
		c.show();		
	}
}
class GrandParent6
{
	private int x=20;
	GrandParent6()
	{
		System.out.println("Grand Parent Constructor called");
	}
	public void show()
	{
		System.out.println("Value of x:"+x);
	}
	protected int getX() // getter method
	{
		return (x-2);
	}
	protected void setX(int amt) // setter method
	{
		this.x=amt;
	}
}
class Parent6 extends GrandParent6
{
	int y=20;
	Parent6()
	{
		System.out.println("Parent Constructor called");
	}		
}
class Child6 extends Parent6
{
	private int z=30;
	Child6()
	{
		System.out.println("Child Constructor called");
	}
	public void show()  
	{
		super.show();
		setX(1000);
		System.out.println(getX());
		//System.out.println("Value of X:"+x); // Reason of error ?Remove the line.
		System.out.println("Value of Y:"+y); // Why no error for y ?
		System.out.println("Value of Z:"+z);
	}
}
