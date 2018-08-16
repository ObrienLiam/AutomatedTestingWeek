
public class TryCatch {

	public static void main(String x[]) {
		// TODO Auto-generated method stub
		int Result=0, A=0, B=0;
		
		try
		{
			A = Integer.parseInt(x[0]);
			B = Integer.parseInt(x[1]);
			
			Result = A/B;
			
			System.out.println(Result);			
			
		}
		catch(NumberFormatException y)
		{
			System.out.println("Digits Only");
		}
		catch(ArrayIndexOutOfBoundsException y)
		{
			System.out.println("Need 2 parameters");
		}
		catch(ArithmeticException y)
		{
			System.out.println("Can't divide by 0");
		}
		

	}

}
