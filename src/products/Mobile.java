package products;

public class Mobile extends Product {

	private String brand;
	
	public Mobile(String name, double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}
	
	

	public Mobile(String name, double price, String brand) {
		super(name, price);
		this.brand = brand;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	@Override
	double getPrice(int quantity) {
		if (quantity < 2) {
			return this.getPrice() * quantity;
		} else if (quantity >=2 & quantity < 5) {
			return this.getPrice() * quantity * 0.7;
		} else {
			return this.getPrice() * quantity * 0.6;
		}
	}

	
	public String toString() {
		return this.getClass().getName() + " " + this.getName() + " " + this.getBrand() + ": " + this.getPrice();
	}
}
