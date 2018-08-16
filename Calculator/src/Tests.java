
public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test;
		int count;
		
		test = "10..3";
		count = test.length() - (test.replace(".","")).length();
		System.out.println(count);
	}

}
