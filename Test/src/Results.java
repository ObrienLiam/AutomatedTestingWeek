
public class Results {
	private int Phy, Chem, Math;
	private float Tot, Per;
	
	public void Physics(int A)
	{		

		if (A >= 0 & A <= 150)
		{
			Phy = A;
		}
		else 
		{
			System.out.println("Values out of range for physics, please try again ");	
			Phy = -1;
		}		
		
	}
	
	public void Chemistry(int A)
	{		
		if (A >= 0 & A <= 150)
		{
			Chem = A;
		}
		else 
		{
			System.out.println("Values out of range for chemistry, please try again ");	
			Chem = -1;
		}	
	}
	
	public void Math(int A)
	{				
		if (A >= 0 & A <= 150)
		{
			Math = A;
		}
		else 
		{
			System.out.println("Values out of range for maths, please try again ");	
			Math = -1;
		}	

		
	}
	
	public void TotResults()
	{
		float PhyPer = Phy*100f/150f, ChemPer = Chem*100f/150f, MathPer = Math*100f/150f;
		int count = 0;
		String course =  "";
		
		if (PhyPer < 60)
		{
			count++;
			course = "Physics";
		}
		
		if (ChemPer < 60)
		{
			count++;	
			course = "Chemistry";
		}

		if (MathPer < 60)
		{
			count++;	
			course = "Maths";
		}

		if (PhyPer < 0 | ChemPer < 0 | MathPer < 0)
			count = -1;
		
		switch (count) {
		
		case 1: System.out.println("Retake the " + course + " exam");
				break;
		case 2: System.out.println("Repeat the course");
				break;
		case 3: System.out.println("Just go home");
		 		break;
		case -1: System.out.println("Error in input marks");
				break;
		case 0:	
			Tot = Phy + Chem + Math;
			Per = Tot * 100 / 450;
			
			System.out.println("Total marks: " + Tot);
			System.out.println("Total percentage: " + Per);	
		
		}

	}
}
