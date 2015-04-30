package exceptions;

public class ConnectionErrorException extends Exception {

	private static final long serialVersionUID = 1L;

	public ConnectionErrorException() {

	}

	public ConnectionErrorException(String message) {
		super(message);
	}

	public ConnectionErrorException(Throwable cause) {
		super(cause);
	}

	public ConnectionErrorException(String message, Throwable cause) {
		super(message, cause);
	}

}
