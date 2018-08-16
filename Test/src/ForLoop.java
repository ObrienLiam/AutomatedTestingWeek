
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		
		x = 1;

		
		for (; x<=10;x++)
		{
			System.out.println("Times Table of " + x);
			System.out.println("_ _ _ _ _ _ _ _ __ _");
			
			for (y=1; y<=10; y++)
			{
				System.out.println(x + "x" + y + "=" + (x*y));
			}
		}
	
	}

}
