
public class Product {
	String productName = "Mobile";
	String productBrand = "Apple iPhone";
	int productQuantity = 100;
	String productColour = "White";
	int productSerialNo = 234567;
	
	public void orderDetails() {
		int orderId = 888;
		String orderName = "Computers";
		String orderAddress = "Nashik";
		System.out.println(orderId);
		System.out.println(orderName);
		System.out.println(orderAddress);
	}
	
public static void main(String[] args) {
	Product p = new Product();
	System.out.println(p.productName);
	System.out.println(p.productBrand);
	System.out.println(p.productQuantity);
	System.out.println(p.productColour);
	System.out.println(p.productSerialNo);
	p.orderDetails();
}
}
