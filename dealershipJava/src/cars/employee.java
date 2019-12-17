package cars;

public class employee implements Comparable<employee>{
	int employee_id;
	String employee_name;
	int employee_bonus;
	int employee_salary;
	int cars_sold_this_year = 0;
	
	public employee(int id, String name, int bonus, int salary) {
		this.employee_id = id;
		this.employee_name = name;
		this.employee_bonus = bonus;
		this.employee_salary = salary;
	}
	
	public void sold_a_car () {
		this.cars_sold_this_year++;
		this.employee_bonus+=100;
		
		System.out.println("bonus: " + this.employee_bonus);
		System.out.println("cars sold: " + this.cars_sold_this_year);

	}
	public static void sort() {
	
	}
	
	
	@Override
	public String toString() {
		return "employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_salary="
				+ employee_salary + "]";
	}

	@Override
	public int compareTo(employee o) {
		if (this.employee_salary < o.employee_salary) {
			return -1;
		} else if (this.employee_salary > o.employee_salary) {
			return 1;
		}
		return 0;
	}
	
}
