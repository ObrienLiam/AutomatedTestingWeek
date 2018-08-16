
public class SalaryAndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Salary;
		float Tax = 0, Net = 0;
		
		Salary = 2010;
		
		if (Salary < 1000) Tax = Salary * 0.5f;
		else if (Salary >= 1000 & Salary < 2000) Tax = Salary * 0.15f;
		else if (Salary >= 2000 & Salary < 3000) Tax = Salary * 0.17f;
		else if (Salary >=3000 & Salary < 4000) Tax = Salary * 0.21f;
		else Tax = Salary * 0.25f;
		
		Net = Salary - Tax;
		
		System.out.println("With a salary of £" + Salary + " you have a tax of £" + Tax + " and hence a net salary of £" + Net);
	}

}
