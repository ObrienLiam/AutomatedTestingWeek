
public class Accounts {

	public void CalcSal(int sal, int abs) throws Boom
	{
		float net = 0;
		if (abs >= 8)
		{
			//Boom ABC = new Boom();
			throw new Boom();
		}
		net = sal*10f;
		System.out.println(net);
	}
}
