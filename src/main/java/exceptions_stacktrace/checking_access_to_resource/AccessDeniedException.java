package exceptions_stacktrace.checking_access_to_resource;

public class AccessDeniedException extends RuntimeException {
	
	public AccessDeniedException(String text) {
		super(text);
	}
	
}
