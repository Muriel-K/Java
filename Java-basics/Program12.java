
public class Program12
{
	
	public static void main(String []args)
	{
		System.out.println("pi 3:"+pi);
		System.out.println("pi 4:"+Test.pi);
		Test t;
		System.out.println("pi 5:"+t.pi);
		t=new Test();
		System.out.println("pi 6:"+t.pi);
	}
}
class Test
{
	public static final double pi = 3.14;
	Test()
	{   pi=3.14;
		System.out.println("pi 1:"+pi);
		System.out.println("pi 2:"+Test.pi);
	}
}
