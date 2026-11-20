package customException;

public class IncorrectEmailIdFormatException extends Exception {

	public IncorrectEmailIdFormatException(String msg) {
		super(msg);
	}
}
