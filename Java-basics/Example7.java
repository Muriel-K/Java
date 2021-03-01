
interface Vehicle
{	
	public final int no_of_seats=2;
	void speedUp(); // Find reason of error ? Fix the error.
	void speedDown();	
}
class Bike implements Vehicle
{   int current_speed=0; 
	Bike()
	{
		//no_of_seats=3; // Find reason of error ? Fix it.
	}
	public void speedUp() // Find reason of error ? Fix the error.
	{		current_speed++;	}
	public void speedDown()
	{       current_speed--;    }
	public void showSpeed()
	{ System.out.println("Current Speed is:"+current_speed);}	
}
public class Example7
{
	public static void main(String []args)
	{
		Bike b=new Bike();
		b.speedUp();b.speedUp();b.speedUp();b.speedUp();
		b.speedDown();b.speedUp();
		b.showSpeed();
	}
}

public
default-protected-public
protected-public










