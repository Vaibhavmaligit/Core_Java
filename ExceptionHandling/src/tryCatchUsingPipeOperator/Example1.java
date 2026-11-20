package tryCatchUsingPipeOperator;

public class Example1 {
	public static void main(String[] args) {
		System.out.println("MAIN METHOD STARTS");
		try {
			String s = args[0];
			System.out.println(s);
			int j = Integer.parseInt(s);
			int i = 10/j;
			System.out.println("VALUE OF I : "+ i);
			String s1 = null;
			System.out.println(s1.length());
			
		}catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException  e) {
			System.out.println("TRY CATCH USING PIPE OPERATOR");
			e.printStackTrace();
		}
		System.out.println("MAIN METHOD ENDS");
	}
}
