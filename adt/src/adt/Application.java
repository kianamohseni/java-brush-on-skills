package adt;

public class Application {

	public static void main(String[] args) {
		Counter myCounter = new Counter("countMe");
		myCounter.increment();
		myCounter.increment();
		myCounter.increment();
		myCounter.increment();

		System.out.println(myCounter);
		
	}

}
