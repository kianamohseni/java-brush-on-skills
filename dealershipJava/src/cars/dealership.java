package cars;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class dealership {

	public static void main(String[] args) {
		
		House house1 = new House(10000.0, 19, "Kiana");
		House house2 = new House(20000.0, 20, "Claudia");
		House house3 = new House(10000.0, 19, "Kiana");
		
		House house4 = new House(50000.0, 111, "Sassan");
		House house5 = new House(2345.0, 9, "Charlie");
		House house6 = new House(999.0, 3, "Jones");
		
		House house7 = new House(10000.0, 19, "Kiana");
		House house8 = new House(333, 90, "Joe");
		
		HashSet<House> houses = new HashSet<House>();
		houses.add(house1);
		houses.add(house2);
		houses.add(house3);
		
		for (House value: houses) {
			System.out.println(value.toString());
		}
		
		System.out.println("End");
		
		HashSet<House> newHouses = new HashSet<House>();
		houses.add(house4);
		houses.add(house5);
		houses.add(house6);
		
		houses.addAll(newHouses);
		for (House value: houses) {
			System.out.println(value.toString());
		}
		System.out.println("End");

		
		HashSet<House> goneHouses = new HashSet<House>();
		goneHouses.add(house7);
		goneHouses.add(house8);
		houses.removeAll(goneHouses);
		
//		System.out.println(house1.equals(house2));
//		System.out.println(house1.equals(house3));
		
		for (House value: houses) {
			System.out.println(value.toString());
		}
	}
	}
