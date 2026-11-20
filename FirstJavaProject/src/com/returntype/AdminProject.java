package com.returntype;

public class AdminProject {

	
	public static void main(String[] args) {
		ProductDetails pd = new ProductDetails();
		Product p = pd.addProduct();
		System.out.println(p.pid+"  "+p.pname+"  "+p.pprice);
		Order o = pd.addOrders();
		System.out.println(o.oid+"  "+o.oname+"  "+o.oaddress);
		Customer c = pd.addCustomer();
		System.out.println(c.ccontact+"  "+c.cname+"  "+c.cemailid);
		
		
	}
}
