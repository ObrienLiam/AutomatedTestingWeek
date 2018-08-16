
public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int No;
		
		No = 562;
		
		if (No > 1000) 
		{
			System.out.println("A");
			
			if (No > 5000) System.out.println("B");
			else System.out.println("C");
			System.out.println("E");
			
			if (No < 2000)
			{
				System.out.println("F");
				System.out.println("G");
			}
		}
		else
		{
			if (No < 500)
			{
				System.out.println("1");
				System.out.println("2");
			}
			if (No > 200)
			{
				System.out.println("3");
				
				if (No > 300) System.out.println("4");
				else System.out.println("5");
			}
		}
		System.out.println("6");
	}

}
