package core_java;

import oops.Employee;
import oops.Gender;
import oops.SalaryType;

public class EnumDemo {

	public static void main(String[] args) {

		Employee venu = new Employee();
		venu.name = "venu";
		venu.id = 123;
		venu.gender = Gender.MALE;
		venu.salaryType =SalaryType.valueOf("SALARIED");
		
		System.out.println(venu.toString());
		
	}
}
