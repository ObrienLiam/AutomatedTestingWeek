
public class Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name;
		float Salary, Tax, Net_Salary;
		
		Name = "Bob Strider";
		Salary = 1800f;
		Tax = 0f;
		
		if (Salary >= 2000)
			Tax = Salary * 0.21f;
		
		if (Salary < 2000)
			Tax = Salary * 0.19f;
		
		Net_Salary = Salary - Tax;
		
		System.out.println(Name + ", your salary is £" + Salary + " with a tax of £" + Tax);
		System.out.println("Your net Salary is £" + Net_Salary);
	}

}
