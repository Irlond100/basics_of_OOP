package abstractions_and_interfaces.library;

public interface Administrator {
	
	Book findAndGiveBook(Reader reader, String bookName);
	
	void overdueNotification(Reader reader);
	
}
