package controlstatements;

public class SwitchDemo {

	
	public static void main(String[] args) {
		
		String name="K";
		
		switch(name) {
		case "A":{
			System.out.println("A block");
			break;
		}
		case "B":{
			System.out.println("B block");
			break;
			
		}
		case "C":{
			System.out.println("C block");
			break;
			
		}
		 default :{
			 System.out.println("Default block");
				break;
		 }
		}

	}
}
