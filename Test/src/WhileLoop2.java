
public class WhileLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String A;
		
		n = 1;
		A = Integer.toString(n);
		
		
		while (n <= 10)
		{
			System.out.println(A + ".");
			++n;
			A = A + "," + n;			
		}

	}

}
