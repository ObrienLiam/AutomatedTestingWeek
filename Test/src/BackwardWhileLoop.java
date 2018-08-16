
public class BackwardWhileLoop {
	public static void main(String[] args) {
		int A = 10, B;
		

		
		while (A >= 1)
		{
			B = 1;
			while (B < A)
			{
				System.out.print(B+",");
				++B;				
			}
			System.out.print(B+".");
			--A;
			System.out.println();
		}
		


	}
}
