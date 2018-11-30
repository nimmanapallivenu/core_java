package oops;

import java.util.Iterator;

public class Enum_Demo {

	enum Seasion {
		
		WINTER("clod"), SPRING("raining"), SUMMER("hot"), FALL("raining");
		
		
		private String name;
		
		Seasion(String name){
			this.name=name;
		};
		
		public String getValue() {
			return this.name;
		}
		
	}

	enum Direction {
		SOUTH, NORTH, WEST, EAST
	}

	enum Weekdays {
		SAN, MON, TUE, WED, THUR, FRI, SAUT
	}

	public static void main(String[] args) {

		/*
		 * Employee venu = new Employee(); venu.name = "venu"; venu.id = 123;
		 * venu.gender = Gender.MALE; venu.salaryType = SalaryType.SALARIED;
		 * 
		 * System.out.println(venu.toString());
		 */

		
		for (Seasion seasion : Seasion.values()) {
			System.out.println( seasion +" is " +seasion.getValue());
		}

	}

	static enum ClassName {

	}

}
