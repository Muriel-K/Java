public class Program9
{
	public static void main(String []args)
	{
		new Test();
		Test t=new Test();
		t.x=45;
		t=new Test();
		System.out.println("x:"+x);
	}
}
class Test
{   int x=10;
    static int no_of_objects;
	Test() 
	{ 
		no_of_objects++;
		System.out.println(no_of_objects+" Object Created");
	}
}
