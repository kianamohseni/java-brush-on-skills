package Inheritance;

public class zoo {

	public static void main(String[] args) {

		int weight;
		int height;
		
		weight = 1;
		height = 2;
		animal chick1 = new chicken(weight, height);
		chick1.eat();
//		chick1.fly();
		chick1.move();
		weight = 3;
		height = 4;
		animal eagle1 = new eagle(weight, height);
		eagle1.eat();
		eagle1.weighs();
//		eagle1.fly();
		eagle1.move();
		weight = 5;
		height =6;
		fish goldfish = new fish(weight,height);
		goldfish.weighs();
		chick1.move();
		eagle1.move();
		
		moveAnimal(chick1);
		moveAnimal(eagle1);
	}
	public static void moveAnimal(animal anim) {
		anim.move();
	}
}
