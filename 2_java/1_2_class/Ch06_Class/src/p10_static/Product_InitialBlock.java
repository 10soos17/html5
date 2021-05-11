package p10_static;

public class Product_InitialBlock {

	public static void main(String[] args) {
		System.out.println("0. main()");
		Product p1 = new Product();
		System.out.println(p1.serialNo);

		Product p2 = new Product();
		System.out.println(p2.serialNo);
	}

}
