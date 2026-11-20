package tryCatchFinallyBlock;

public class tryWithFinally {
public static void main(String[] args) {
	System.out.println("MAIN STARTS");
	try {
		System.out.println("---TRY BLOCK---");
		int i = 20/0;
		System.out.println(i);
	} finally {
		System.out.println("--FINALLY BLOCK---");
	}
 
}
}