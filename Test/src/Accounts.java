
public class Accounts {

	private float Tax (int Salary)
	{
		float TotTax = 0, Remaining=Salary, check = 0;
		int Band;
		
		if (Salary < 1000) Band = 0;
		else if (Salary >= 1000 & Salary < 2000) Band = 1;
		else Band = 2;
		
		switch (Band)
		{
		case 2:
			Remaining = Salary - 2000;
			TotTax = TotTax + Remaining*0.21f;
			check = 1;
		case 1:
			if (check == 1) TotTax = TotTax + 1000*0.15f;
			else
			{
				Remaining = Salary - 1000;
				TotTax = TotTax + Remaining*0.15f;				
			}

		case 0:
			break;
		}

		return TotTax;
	}
	
	public void NetSalary(int Salary)
	{
		System.out.println("Your Tax: " + Tax(Salary));
		System.out.println("Net Salary: " + (Salary - Tax(Salary)));
	}
}
