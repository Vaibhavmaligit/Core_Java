package customException;

public class IncorrectInputException extends Exception {

	
	
	public IncorrectInputException(String msg) {
		super(msg);
		int i = Integer.parseInt(msg);
	}
}
