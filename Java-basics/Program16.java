public class Program16 
{
	public static void main(String []args)
	{
		Test t2=new Test(40);
		t2.show();
		t2=new Test(50);
		t2.show();
	}
}
class Test
{
	int x=10,y=20;
	Test() { System.out.println("Default Constutor");}
	Test(int x)
	{   
		this();
		this.x=this.y=this.x+x;
	}
	Test(int x,int y)
	{
		if(x==y)
			this(x);
		else
		{
			this.x=this.x+x;
			this.y=this.y+y;
		}
	}
	void show()
	{
		System.out.println("x:"+x+"  y:"+y);
	}
}
