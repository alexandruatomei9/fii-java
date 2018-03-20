package real.exc;

public class UnknownWalkingBehaviour extends Exception {

	private final String message;
	/**
	 * serial id
	 */
	private static final long serialVersionUID = 1L;
	public UnknownWalkingBehaviour(String message) {
		super(message);
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	
	
}
