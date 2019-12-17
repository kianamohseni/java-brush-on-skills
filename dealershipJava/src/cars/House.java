package cars;

public class House {
	private double price;
	private int	age;
	private String owner;
//	private boolean currently_for_sale;
	
	public House(double d, int i, String owner) {
		
		this.set_price(d);
//		this.age = i;
		this.owner = owner;
//		System.out.println(this.price + this.age + this.owner);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		House other = (House) obj;
		if (age != other.age)
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	public void set_price(double price) {
		this.price = price;
	}
	
	public double get_price() {
		return this.price;
	}
	public String toString() {
		return (this.get_price() + this.age + this.owner + this.hashCode() );
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

}
