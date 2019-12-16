package cars;

public class House {
	private double price;
	private int	age;
	private String owner;
	private boolean currently_for_sale;
	
	public House(double d, int i, String string) {
		
		this.set_price(price);
		this.age = age;
		this.owner = owner;
	}
	
	public void set_price(double price) {
		this.price = price;
	}
	
	public double get_price() {
		return this.price;
	}
	public String toString() {
		return (this.price + this.age + this.owner);
	}
}
