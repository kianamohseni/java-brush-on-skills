package Inheritance;

public class eagle extends bird implements flyer{

	public eagle(int weight, int height) {
		super(weight, height);
		// TODO Auto-generated constructor stub
	}
	public void fly() {
		System.out.println("flying ...");
	}
	public void move() {
		System.out.println("eagles soar ...");
	}
}
