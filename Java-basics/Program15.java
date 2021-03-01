
public class Program15 
{
  public static void main(String []args)
  {
	display();
	display(1,2);
	display(1,2,3);
  }
  static void display(int ... values)
  {  	 
	  for(int s:values)
	  {  
	   System.out.print(s);  
	  }
	  System.out.println();
  }
}

