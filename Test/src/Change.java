
public class Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float Bill, Paid, Return;
		
		Bill = 20.20f;
		Paid = 108.93f;
		
		Return = Paid - Bill;

		
		System.out.println("Total Change: £" + Return);
		
		if (Return/50 >=1) 
			{
			System.out.println("£50 = " + (int)Return/50);
			Return = Return % 50;
			}
		if (Return/20 >=1)
			{
			System.out.println("£20 = " + (int)Return/20);	
			Return = Return % 20;
			}
		if (Return/10 >=1) 
			{
			System.out.println("£10 = " + (int)Return/10);	
			Return = Return % 10;
			}
		if (Return/5 >=1)
			{
			System.out.println("£5 = " + (int)Return/5);	
			Return = Return % 5;
			}
		if (Return/2 >=1) 
			{
			System.out.println("£2 = " + (int)Return/2);
			Return = Return % 2;
			}
		if (Return/1 >=1) 
			{
			System.out.println("£1 = " + (int)Return/1);	
			Return = Return % 1;
			}
		
		if (Return/0.5f >= 1)
			{
			System.out.println("50p = " + (int)(Return/0.5f));
			Return = Return % 0.5f;
			}
		
		if (Return/0.2f >= 1)
			{
			System.out.println("20p = " + (int)(Return/0.2f));
			Return = Return % 0.2f;
			}
		
		if (Return/0.1f >= 1)
			{
			System.out.println("10p = " + (int)(Return/0.1f));
			Return = Return % 0.1f;
			}
		
		if (Return/0.05f >= 1)
			{
			System.out.println("5p = " + (int)(Return/0.05f));
			Return = Return % 0.05f;
			}
		
		if (Return/0.02f >= 1)
			{
			System.out.println("2p = " + (int)(Return/0.02f));
			Return = Return % 0.02f;
			}
		
		if (Return/0.01f >= 1)
			{
			System.out.println("1p = " + (int)(Return/0.01f));
			Return = Return % 0.01f;
			}
				
			
	}

}
