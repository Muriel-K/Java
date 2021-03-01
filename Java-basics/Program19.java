public class Program19
{
	public static void main(String []args)
	{
        Rational r=new Rational(7,9);
        System.out.println("Rational:"+r.toString());
       
	}
}
class Rational
{
	int p,q;
	Rational(int p,int q)
	{
		this.p=p;this.q=q;
	}
	 // Open the below commented section and execute once and get the result	
	/*public String toString()
	{
		return (p+"/"+q);
	}*/
}
