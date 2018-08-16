
public class TotalPer {
	public static void main(String[] args) {
		int iPhy, iChem, iMath, iTotal;
		float fPer;
		
		iPhy = 80;
		iChem = 80;
		iMath = 100;
		
		iTotal = iPhy + iChem + iMath;
		fPer = (float) iTotal * 100 / 450;
		
		System.out.println("Total marks:" + iTotal);
		System.out.println("Total percentage:" + fPer);
	}
}
