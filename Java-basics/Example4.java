// Understand the execution flow of the following code
public class Example4
{
	public static void main(String []args)
	{			
		Parent3 p=new Parent3(34);
		p.toString();
		Child3 obj=new Child3(45);
		obj.toString();		
	}
}
class Parent4
{
	int x=20;
	Parent4(int xx)
	{
		this.x=xx;System.out.println("Parent Constructor called");
	}		
}
class Child4 extends Parent4
{
	int y=30;
	Child4() 
	{   super(0);
		System.out.println("Child Constructor called");
	}
	Child4(int yy)  
	{
		super(yy);
		this.y=yy;		
	}
}

