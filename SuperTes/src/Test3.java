
public class Test3 extends Test2{

	public Test3()
	{
		System.out.println("Third empty");
	}
	
	public Test3(int A)
	{
		super(2);
		System.out.println("Third int");
	}
	
	public Test3(int A, int B)
	{
		super(2,3);
		System.out.println("Third doubly");
	}
}
