enum WorkingDays_Hrs
{   SUNDAY(1), TUESDAY(2), THURSDAY(3), FRIDAY(6);
	private int value;
	private WorkingDays_Hrs(int value) 
	{ this.value = value; } 	
}
public class Program14
{
	public static void main(String []args)
	{
		System.out.println(WorkingDays_Hrs.FRIDAY);
	}
}

