package exceptions_stacktrace.checking_access_to_resource;

public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException(String text) {
		super(text);
	}
	
}
