
public class Test2 extends Test1{
	
	public Test2()
	{
		System.out.println("Second empty");
	}
	
	public Test2(int A)
	{
		System.out.println("Second int");
	}
	
	public Test2(int A, int B)
	{
		super(2);
		System.out.println("Second doubly");
	}

	
}
