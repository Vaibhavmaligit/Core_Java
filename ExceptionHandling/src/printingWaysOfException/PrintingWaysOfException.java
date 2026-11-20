package printingWaysOfException;

public class PrintingWaysOfException {
	public static void main(String[] args) {
		System.out.println("THIS STATEMENT WILL BE EXECUTED");
		try {
			System.out.println("==TRY BLOCK==");
			int i = 20/0;
			System.out.println("VALUE OF I : "+i);
		} catch (Exception e) {
			System.out.println("==CATCH BLOCK==");
			e.printStackTrace();     //1st way for printing exception
			e.getMessage();          // 2nd way for printing exception
			System.out.println(e.toString()); // 3rd way for printing exception
		}
		System.out.println("NOW THIS STATEMENT WILL ALSO BE EXECUTED");
	}
}
