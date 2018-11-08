package core_java;

public class StringBuilderDemo {

	public static void main(String[] args) {

		
		StringBuilder sb = new StringBuilder();
		
		sb.append("venu");
		
		sb.append("reddy");
		
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		StringBuilder sb1 = new StringBuilder("venu");
		sb1.append("reddy");
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
		
		String x="hello";
		long startTime =System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			x = x+"x";
		}
		long endTime = System.currentTimeMillis();
		System.out.println(x);
		System.out.println("String "+(endTime-startTime));
		
		
		StringBuilder y = new StringBuilder();
		long startTime1 =System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			y.append("x");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println(y);
		System.out.println("StringBuilder"+(endTime1-startTime1));
		
		// String builder methods
		
		StringBuilder builder = new StringBuilder("welcometojava");
		
		System.out.println(builder);
		System.out.println(builder.reverse());
		
		
		
		
	}

}
