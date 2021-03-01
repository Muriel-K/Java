public class Program18
{
	public static void main(String []args)
	{
		Test t2=new Test(40);
		t2.show();
		t2=new Test();
		t2.show();	
	}
}
class Test
{
	int x=10;
	Test(int x)
	{   
		this.x=x;
	}	
	void show()
	{
		System.out.println("x:"+x);
	}
}
