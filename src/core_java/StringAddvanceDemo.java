package core_java;

public class StringAddvanceDemo {
	
	public static void main(String[] args) {
		
		System.out.println(20+30);
		// string + any integer + number 
		System.out.println("20+30 \t"+20+30);
		
		// string + any integer + number 
		System.out.println("20+30 \t"+(20+30));
		
		
		// right  string + any integer + number left
		System.out.println(20+30 +"20+30 \t");
		
		// syntax evalution start from right to left 
		
		System.out.println("hello "+"world ");
		
		String name="venu";
		
		String namenew ="venu";
		
		System.out.println(name.hashCode());
		
		System.out.println(namenew.hashCode());
		
		// String is immutable
		
		String xName = new String("venu");
		
		System.out.println(xName);
		System.out.println(xName.hashCode());
		
		
		String yName = new String("venuz");
		
		System.out.println(yName);
		System.out.println(yName.hashCode());
		
		// one object x
		String x= "200";
		
		System.out.println(" X before concatination  "+x.hashCode());
		// two objects 
		x= x+"100";
		
		System.out.println("X after concatination "+x.hashCode());
		
		// 100 plus object will be created 
		
	}

}
