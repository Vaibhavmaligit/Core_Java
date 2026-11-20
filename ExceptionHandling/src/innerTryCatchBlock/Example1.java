package innerTryCatchBlock;

public class Example1 {
public static void main(String[] args) {
	System.out.println("MAIN METHOD ENTRY");
	try {
		System.out.println("OUTER TRY BLOCK");
		String name = "VAIBHAV";
		System.out.println(name.length());
		
		try {
			System.out.println("INNER TRY BLOCK");
			int i = 10/0;
			System.out.println("VALUE OF I : "+i);
		} catch (NumberFormatException ne) {
		System.out.println("INNER CATCH BLOCK");
		ne.printStackTrace();
		}
		System.out.println("OUTER TRY BLOCK ENDS");
	} catch (Exception e) {
		System.out.println("OUTER CATCH BLOCK");
		e.printStackTrace();
	}
	System.out.println("MAIN METHOD ENDS");
	
}
	
	
}
