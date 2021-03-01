interface List
{	
	void add();
	void add_first();	
}
interface Array
{
	void add(); 
	void show();	
}
class Array_List implements Array,List
{   
	public void add(){ System.out.println("Add of array_list called"); }
	public void add_first(){ System.out.println("Add at first of list called"); }	
	public void show(){ System.out.println("show of array called"); }	
}
public class Example8
{
	public static void main(String []args)
	{
		int x=10;
		x=30;
		List obj1=new Array_List();
		obj1=new Array_List();
		obj1.add();obj1.add_first();
		obj1.show();// find reason of error? Remove the line.
		Array_List al=new Array_List();
		al.show();
		Array obj2=new Array_List();
		obj2.add();obj2.show();
		obj2.add_first()// find reason of error? Remove the line.
		Array_List obj3=new Array_List();
		obj3.add();obj3.add_first();obj3.show();
	}
}





