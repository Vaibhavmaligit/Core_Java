package tryCatchFinallyBlock;


public class TryCatchFinallyReturnTypeExample {
	 
		public static int m1() {
		try {
			System.out.println("--TRY BLOCK--");
			int i = 10/0;
			return 5;
			
			
		} catch (Exception e) {
			System.out.println("--CATCH BLOCK--");
			e.printStackTrace();
			return 10;
		}
		finally {
			return 20;	
		}
	}
		public static void main(String[] args) {
			System.out.println(m1());
		}
}
