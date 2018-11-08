package core_java;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String name="mourya,venu,hello,hai";
		
		System.out.println("String length " + name.length());
		System.out.println("UpperCase "+ name.toUpperCase());
		System.out.println("LowerCase "+ name.toLowerCase());
		
		String[] arrayName= name.split(",");
	
		for (int i = 0; i < arrayName.length; i++) {
			System.out.println("--------");
			
			System.out.println("| "+ i +" | "+ arrayName[i] + "|");
		}
		System.out.println("--------");
		
		String text ="         hell          ";
		
		System.out.println(text);
		
		System.out.println(text.trim());
		
		System.out.println(text.trim().indexOf("o"));
		
		String value="venu";
		
		System.out.println(value.equals("Venu"));
		
		System.out.println(value.equalsIgnoreCase("Venu"));
		
		
		System.out.println("substring(2)"+value.substring(1));
		// value = "mourya";
		System.out.println(value.substring(1, 3));
		
		System.out.println(value.isEmpty());
		
		System.out.println("".isEmpty());
		
		System.out.println(value.startsWith("ve"));
		
		System.out.println(value.startsWith("vx"));
		
		
		System.out.println(value.endsWith("u"));
		
		System.out.println(value.endsWith("c"));
		
		
		
		
	}
	
	

}
