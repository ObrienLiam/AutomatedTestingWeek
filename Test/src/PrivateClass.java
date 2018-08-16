
public class PrivateClass {
	static PrivateClass x;
	
	private PrivateClass() {}
	
	static PrivateClass GetInstance() {
		if (x == null)
		{
			x = new PrivateClass();
		}
		return x;
	}
}

