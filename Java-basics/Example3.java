 class A
{
	 public void f1(){ };
}


public class Example3
{
	public static void main(String []args)
	{			
		//Parent3 p=new Parent3(34);
		//p.toString();
		//Child3 obj=new Child3(45);
		//System.out.println(obj.toString());
		new A();//anonymous object
		
	}
}
class Parent3
{
	int x=20;
	Parent3(int xx)
	{
		this.x=xx;System.out.println("Parent Constructor called");
	}	
	
}
class Child3 extends Parent3
{
	int y=30;
	
	Child3(int yy)  // Error:Reason , Fix it
	{   super(yy);
		this.y=yy;		
	}
}






