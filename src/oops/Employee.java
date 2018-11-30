package oops;

public class Employee {

	public String name;
	public int id;
	public Gender gender;
	public SalaryType salaryType;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", gender=" + gender + ", salaryType=" + salaryType + "]";
	}
	
	
	
}
