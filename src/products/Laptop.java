package products;

public class Laptop extends Product {

	private String screen;
	private String processor;
	
	@Override
	double getPrice(int quantity) {
		if (quantity < 3) {
			return this.getPrice() * quantity;
		} else if (quantity >=3 & quantity < 5) {
			return this.getPrice() * quantity * 0.8;
		} else {
			return this.getPrice() * quantity * 0.5;
		}
	}
	
	

	public Laptop(String name, double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	

	public Laptop(String name, double price, String screen, String processor) {
		super(name, price);
		this.screen = screen;
		this.processor = processor;
	}



	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	public String toString() {
		return this.getClass().getName() + " " + this.getName() + " " + this.getProcessor() + " " + this.getScreen() + ": " + this.getPrice();
	}

}
