import products.*;


public class L1 {

	public static void main(String[] args) {
		Product p1 = new Laptop("HP TouchSmart", 20.00, "15", "Intel i7"); 
		Product p2 = new Mobile("HTC mini 2", 100.00, "HTC");
		Product p3 = new Laptop("Dell XPS", 50.00, "17", "Intel i7"); 
		
		Cart c = new Cart();
		c.addProduct(p1, 5);
		c.addProduct(p2, 1);
		c.addProduct(p3, 1);
		
		System.out.println(c);
	
	}

}
