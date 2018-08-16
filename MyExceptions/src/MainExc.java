
public class MainExc {
	
	public static void main (String[] args)
	{
		Accounts Peter = new Accounts();
		
		try
		{
			Peter.CalcSal(100, 9);
		}
		catch (Boom A)
		{
			System.out.println(A);
			A.xyz();
		}
	}

}
