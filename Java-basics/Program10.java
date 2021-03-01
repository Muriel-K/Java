public class Program10
{
	public static void main(String []args)
	{
		new Test();
	}
}
class Test
{   int x=10;
    static int y;
	Test() 
	{ 
		static int x=20;
		System.out.println("x:"+x+" y:"+y);
	}
}
