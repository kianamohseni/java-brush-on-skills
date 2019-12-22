package adt;

public class Counter {
	private Integer counter;
	private String name;
	
	public Counter(String str) {
		this.counter = 0;
		this.name = str;
	}
	
	public Integer increment() {
		counter++;
		return counter;
	}
	
	public int getCurrentValue() {
		return counter;
	}
	
	public String toString() {
		
		return name + " is " + counter;
	}
}
