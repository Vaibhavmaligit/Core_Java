package tryWithMultipleCatchBlock;

public class Example1 {
public static void main(String[] args) {
	System.out.println("MAIN METHOD STARTS");
	try {
		String s = args[0];
		System.out.println(s);
		int j = Integer.parseInt(s);
		int i = 10/j;
		System.out.println("VALUE OF I : "+ i);
		String s1 = "VAIBHAV";
		System.out.println(s1.length());
		
	} catch (ArrayIndexOutOfBoundsException ae) {
		System.out.println("--HANDLE ArrayIndexOutOfBoundsException--");
		ae.printStackTrace();
	}catch (ArithmeticException ae1) {
		System.out.println("--HANDLE ArithmeticException--");
		ae1.printStackTrace();
		
	}catch (NullPointerException ne) {
		System.out.println("--HANDLE NullPointerException--");
		ne.printStackTrace();
	}catch (Exception e) {
		System.out.println("EXCEPTION");
		e.printStackTrace();
	}
	System.out.println("MAIN METHOD ENDS");
}
}
