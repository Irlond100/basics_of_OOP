package abstractions_and_interfaces.library;

public interface Reader {
	
	void takeBook(Administrator administrator, String bookName);
	
	void revivesBook(Administrator administrator, Book book);
	
}
