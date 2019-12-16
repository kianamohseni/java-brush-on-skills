package Inheritance;

public abstract class animal {

		int weight;
		int height;
		
		public animal(int weight, int height) {
			this.weight = weight;
			this.height = height;
		}
		
		public void eat() {
			System.out.println("eats ...");
		}
		
		public void weighs() {
			System.out.println("weighs at: " + weight + " lbs.");
		}
		
		public abstract void move();
}
