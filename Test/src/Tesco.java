
public class Tesco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String product;
		int Quantity;
		float Price, Amount;
		
		product = "7UP";
		Quantity = 5;
		Price = 1.25f;
		Amount = Quantity * Price;
		
		System.out.println("Product: " + product);
		System.out.println("Quantity: " + Quantity);
		System.out.println("Price: " + Price);
		System.out.println("Amount: " + Amount);
		System.out.println("VAT:" + Amount*0.21);
	}

}
