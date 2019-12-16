package Inheritance;

public class fish extends animal implements seaCreatures{

	public fish(int weight, int height) {
		super(weight, height);
		// TODO Auto-generated constructor stub
	}
	public void move() {
		System.out.println("moving is swimming ...");
	}
		
	public void swim() {

		System.out.println("swiming ...");
	}

}
