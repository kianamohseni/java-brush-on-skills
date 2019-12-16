package cars;

public class employee {
	int employee_id;
	String employee_name;
	int employee_bonus;
	int employee_salary;
	int cars_sold_this_year = 0;
	
	public void employee(int id, String name, int bonus, int salary) {
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
	
}
