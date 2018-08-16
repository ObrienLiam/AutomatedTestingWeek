
public class Bank {
	static int Dollar;
	
	public void SetDollar(int Doll)
	{
		Dollar = Doll;		
	}
	
	static public void Reset()
	{
		Dollar = 0;
		System.out.println("Dollar value reset");
	}

	
}
