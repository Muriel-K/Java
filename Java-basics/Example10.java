interface ListA
{	
	void function1();	
}
interface ListB extends ListA
{
	void function2();
}
abstract class Test10 implements ListB // reason of error? Fix it.
{   
	public void function2()
	{ 
		System.out.println("I am function 2");
	}
}
class Test11 extends Test10
{
	public void function1()
	{ 
		System.out.println("I am function 1");
	}
}
public class Example10
{
	public static void main(String []args)
	{		
		Test10 t=new Test11();
		t.function1();
		t.function2();
	}
}

