package Inheritance;

public class chicken extends bird implements flyer{

	public chicken(int weight, int height) {
		super(weight, height);
		// TODO Auto-generated constructor stub
	}
	public void fly() {
		System.out.println("can't fly ...");
	}
	public void move() {
		System.out.println("chicken walks ...");
	}
}
