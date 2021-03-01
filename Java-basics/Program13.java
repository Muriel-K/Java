public class Program13
{
	public static void main(String []args)
	{
		Test t=new Test();
		new Test();
		t=new Test(3);
	}
}
class Test
{   
	int x , y;
	{ System.out.println("Initialization Block");}
	Test() { System.out.println("Default constructor"); }
	Test(int x) 
	{ 
	this.x=x;this.y=x;
	System.out.println("Parameterized const 1");
	}	
	Test(int x, int y) 
	{ 
	this.x=x;this.y=y;
	System.out.println("Parameterized const 2");
	}	
}