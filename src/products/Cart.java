package products;

import java.util.Map;
import java.util.HashMap;

public class Cart {

	private Map<Product, Integer> products = new HashMap<Product, Integer>();
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}
	
	public void addProduct(Product p, int quantity) {
		products.put(p, new Integer(quantity));
	}
	

	public double calculatePrice() {
		double price = 0;
		for (Map.Entry<Product, Integer> entry : products.entrySet()) {
			price += entry.getKey().getPrice(entry.getValue());
		}
		
		return price;
	}
	
	public String toString() {
		String aux = new String();
		for (Product p : products.keySet()) {
			aux += p + "\n\r";
		}
		aux += ">>> Price: " + calculatePrice();
		
		return aux;
	}
	
}
