package cars;

public class customer {
	private int customer_number;
	private String customer_name;
	private String customer_address;
	private int customer_loan;
	private double cash_on_hand;
	
	public void customer(int customer_number, String customer_name, String customer_address, int loan) {
		this.customer_number = customer_number;
		this.customer_name = customer_name;
		this.customer_address = customer_address;
		this.customer_loan = loan;
	}
	
	public void set_customer_number(int number) {
		this.customer_number = number;
	}
	
	public int get_customer_number() {
		return (this.customer_number);
	}
	public void set_customer_name(String buyer) {
		this.customer_name = buyer;
	}
	
	public String get_customer_name() {
		return (this.customer_name);
	}
	public void change_address(String new_address) {
		this.customer_address = new_address;
	}
	
	public void set_cash_on_hand(double cash) {
		this.cash_on_hand = cash;
	}
	public double get_cash_on_hand() {
		return(this.cash_on_hand);
	}
	public void give_financing(int loan) {
		this.customer_loan = loan;
	}
	public boolean runCreditHistory(double loan_amount) {
		return (true);
	}
}
