package cars;

public class car {
	private String model;
	private int year;
	private double listed_price;
	private double sale_price;
	private customer owner;
	private employee sales_person;
	
	public void car(String model, int year, int price, customer owner) {
		this.model = model;
		this.year = year;
		this.listed_price = price;
		this.owner = owner;
	}
	
	public void set_listed_price(double price) {
		this.listed_price = price;
	}
	
	public double get_listed_price() {
		return (this.listed_price);
	}
	public void new_price (int price) {
		this.listed_price = price;
	}
	
	public void car_got_sold (employee seller, customer buyer, double price) {
		this.sales_person = seller;
		this.owner = buyer;
		this.sale_price = price;
	}
	public void print_sale_details() {
		String customer_name = this.owner.get_customer_name();
		System.out.println(customer_name);
	}
}
