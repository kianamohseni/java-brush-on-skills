package cars;

import java.util.ArrayList;
import java.util.Collections;

public class sorted {

	public static void main(String[] args) {

		Integer id1;
		Integer id2;
		id1 = 1;
		id2 = 2;
		
		employee employee1 = new employee(1, "Roger", 10000, 3333);
		employee employee2 = new employee(2, "Sabrina", 20000, 2222);
		employee employee3 = new employee(3, "Angela", 30000, 1111);
		
		ArrayList<employee> employeeList = new ArrayList<employee>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);

		System.out.println(employeeList.toString());
		
		Collections.sort(employeeList);
		
		System.out.println(employeeList.toString());

		System.out.println(id1.compareTo(id2));
;
	}

}
