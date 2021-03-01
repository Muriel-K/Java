interface List1
{	
	void add();
	void add_first();
	static void showType(){ System.out.println("I am List");}
}
interface Array1
{
	void add(); 
	void show();
	static void showType(){ System.out.println("I am Array");}
}
class Array_List1 implements Array1,List1
{   
	public void add(){ System.out.println("Add of array_list called"); }
	public void add_first(){ System.out.println("Add at first of array_list called"); }	
	public void show(){ System.out.println("show of array_list called"); }	
}
public class Example9
{
	public static void main(String []args)
	{		
		showType();  // Find reason of error? Remove Line.
		List1.showType();
		Array1.showType();
	}
}

