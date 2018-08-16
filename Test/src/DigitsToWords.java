
public class DigitsToWords

{
	public void Words(int Digit)
	{
		int Div = Digit / 10, Rem = Digit % 10, check1 = 0, check2 = 0, check3 = 0;
		int Chars;
		Chars = (int)Math.log10(Digit) + 1;
		String Val = "";
		switch (Chars)
		{
		case 9:
			
		
		case 8:
			if (Div/1000000 == 1 && (Div/100000)%10 != 0)
				{
				Val += (DigEX((Div/100000)%10) + "MILLION, ");
				}
			else 
				{
				Val += (Dig2(Div/1000000) + Dig1((Div/100000)%10) + "MILLION, ");
				}
			check3 = 1;
			Div = Div % 100000;
		
		case 7: 
			
			if (check3 == 0) 
				{
				Val += (Dig1(Div/100000) + "MILLION, ");
				Div = Div % 100000;
				}
			
		case 6:
			
			Val += (Dig1(Div/10000) + "HUNDRED AND ");
			Div = Div % 10000;
			
		case 5:

			if (Div/1000 == 1 & Div %100 != 0)
				{
					Val += (DigEX((Div/100)%10) + "THOUSAND ");
				}
			else 
				{
					Val += (Dig2(Div/1000) + Dig1((Div/100)%10) + "THOUSAND ");
				}
			Div = Div % 100;
			check2 = 1;			
		

		case 4:
			
			if (check2 == 0 & check3 == 0)
			{
				Val += (Dig1(Div/100) + "THOUSAND ");
				Div = Div%100;
			}
			
		case 3: 
			
			if ((Div/10)%10 != 0) Val += (Dig1(Div/10) + "HUNDRED ");
			
			if (Digit%100!=0 )
			{
				Val += "AND ";
			}
			Div = Div % 10;

		case 2: 
			
			if (Div == 1 & Rem!=0)
			{
				Val += DigEX(Rem);
				check1 = 1;
			}
			else
			{
				Val += Dig2(Div);
			}
			
		case 1: 
			
			if (check1 == 0)
			{
				Val += Dig1(Rem);
				break;
			}
			else break;
		}
		

		System.out.println(Val);
			
	}
	
	private String Dig1 (int Digit)
	{
		String Digit1;
		
		switch (Digit)
		{
		case 1: Digit1 = "ONE ";
				break;
		case 2: Digit1 = "TWO ";
				break;
		case 3: Digit1 = "THREE ";
				break;
		case 4: Digit1 = "FOUR ";
				break;
		case 5: Digit1 = "FIVE ";
				break;
		case 6: Digit1 = "SIX ";
				break;
		case 7: Digit1 = "SEVEN ";
				break;
		case 8: Digit1 = "EIGHT ";
				break;
		case 9: Digit1 = "NINE ";
				break;
		default: Digit1 = "";
		}
		return Digit1;		
	}
	
	private String Dig2 (int Digit)
	{
		String Digit2;
		
		switch (Digit)
		{
		case 1: Digit2 = "TEN ";
				break;
		case 2: Digit2 = "TWENTY ";
				break;
		case 3: Digit2 = "THIRTY ";
				break;
		case 4: Digit2 = "FOURTY ";
				break;
		case 5: Digit2 = "FIFTY ";
				break;
		case 6: Digit2 = "SIXTY ";
				break;
		case 7: Digit2 = "SEVENTY ";
				break;
		case 8: Digit2 = "EIGHTY ";
				break;
		case 9: Digit2 = "NINETY ";
				break;
		default: Digit2 = "";
		}
		return Digit2;		
	}
	
	private String DigEX (int Digit)
	{
		String Digit1;
		
		switch (Digit)
		{
		case 1: Digit1 = "ELEVEN ";
				break;
		case 2: Digit1 = "TWELVE ";
				break;
		case 3: Digit1 = "THIRTEEN ";
				break;
		case 4: Digit1 = "FOURTEEN ";
				break;
		case 5: Digit1 = "FIFTEEN ";
				break;
		case 6: Digit1 = "SIXTEEN ";
				break;
		case 7: Digit1 = "SEVENTEEN ";
				break;
		case 8: Digit1 = "EIGHTEEN ";
				break;
		case 9: Digit1 = "NINETEEN ";
				break;
		default: Digit1 = "";
		}
		return Digit1;		
	}

}
