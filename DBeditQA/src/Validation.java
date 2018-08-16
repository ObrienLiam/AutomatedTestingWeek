
public class Validation {
	
	int chReg = 0, chName = 0, chMark = 0;

	String Name;
	int Reg = 0, Mark = 0;
	public Validation (String s1, String s2)
	{
		
		if (s1=="Name") chName = 1;
		Name = s2;
		
	}
	
	public Validation (String s1, int i1)
	{
		
		if (s1 == "RegNo") 
			{
				chReg = 1;
				Reg = i1;
			}
		
		if (s1 == "Mark") 
			{
				chMark = 1;
				Mark = i1;
			}
	}
	
	public Validation (String s1, String s2, String s3, int i1)
	{
		
		if (s1=="Name") 
			{
				chName = 1;
				Name = s2;
			}
		if (s3 == "RegNo") 
		{
			chReg = 1;
			Reg = i1;
		}
	
		if (s3 == "Mark") 
		{
			chMark = 1;
			Mark = i1;
		}
		
		
	}
	
	public Validation (String s1, int i1, String s2, String s3)
	{
		
		if (s1 == "RegNo") 
			{
				chReg = 1;
				Reg = i1;
			}
		
		if (s1 == "Mark") 
			{
				chMark = 1;
				Mark = i1;
			}
		if (s2 == "Name")
			{
				chName = 1;
				Name = s3;
			}
	}
	
	public Validation (String s1, int i1, String s2, int i2, String s3, String s4)
	{
		
		if (s1 == "RegNo" ) 
			{
				chReg = 1;
				Reg = i1;
			}
		if (s2 == "RegNo" ) 
			{
				chReg = 1;
				Reg = i2;
			}
		
		if (s1 == "Mark" ) 
			{
				chMark = 1;
				Mark = i1;
			}	
		if (s2 == "Mark" ) 
			{
				chMark = 1;
				Mark = i2;
			}
		if (s3 == "Name")
			{
				chName = 1;
				Name = s4;
			}
	}
	
	public Validation (String s1, int i1, String s2, String s3, String s4, int i2)
	{
		
		if (s1 == "RegNo" ) 
			{
				chReg = 1;
				Reg = i1;
			}
		if (s4 == "RegNo" ) 
			{
				chReg = 1;
				Reg = i2;
			}
		
		if (s1 == "Mark" ) 
			{
				chMark = 1;
				Mark = i1;
			}	
		if (s4 == "Mark" ) 
			{
				chMark = 1;
				Mark = i2;
			}
		if (s2 == "Name")
			{
				chName = 1;
				Name = s3;
			}
	}
	
	public Validation (String s1, String s2, String s3, int i1, String s4, int i2)
	{
		
		if (s3 == "RegNo" ) 
			{
				chReg = 1;
				Reg = i1;
			}
		if (s4 == "RegNo" ) 
			{
				chReg = 1;
				Reg = i2;
			}
		
		if (s3 == "Mark" ) 
			{
				chMark = 1;
				Mark = i1;
			}	
		if (s4 == "Mark" ) 
			{
				chMark = 1;
				Mark = i2;
			}
		if (s1 == "Name")
			{
				chName = 1;
				Name = s2;
			}
	}
	
	public void valid()
	{
		if (chReg==1)
		{
			System.out.println(Reg);
//			if (matches("[0-9]+") && text.length() > 2)
		}
		if (chMark==1)
		{
			System.out.println(Mark);
		}
		if(chName==1)
		{
			System.out.println(Name);
		}
	}
	
}
