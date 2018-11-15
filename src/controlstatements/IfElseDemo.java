package controlstatements;

/**
 * 
 * if
 * 
 * if else
 * 
 * 
 * 
 * if else if else
 * 
 * @author Venu
 *
 */
public class IfElseDemo {

	public static void main(String[] args) {

		int age = 12;

		if (age > 18) {
			// true block
			System.out.println(" Elegible for vote ...!");
		} else {
			// false block
			System.out.println(" NotElegible for vote ...!");
		}

		String name = "";

		name = "venu";

		if (name.equals("mourya")) {
			System.out.println("Your name is Mourya");

		} else if (name.equalsIgnoreCase("venu")) {
			System.out.println("venu logic");
		} else if (name.equalsIgnoreCase("venu")) {
			System.out.println("venu logic");
		} else if (name.equalsIgnoreCase("venu")) {
			System.out.println("venu logic");
		} else if (name.equalsIgnoreCase("venu")) {
			System.out.println("venu logic");
		} else {
			System.out.println("Your name is " + name);
		}

	}

}
