package cars;

import java.util.ArrayList;
import java.util.LinkedList;

public class dealership {

	public static void main(String[] args) {
		
		House house1 = new House(10000.0, 19, "Kiana");
		House house2 = new House(20000.0, 20, "Claudia");
		
		ArrayList<House> houses = new ArrayList<House>();
		houses.add(house1);
		houses.add(house2);
		
		for (House value: houses) {
			System.out.println(value.toString());
		}
		
		}
	}
