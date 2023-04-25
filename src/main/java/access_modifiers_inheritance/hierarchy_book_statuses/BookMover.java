package access_modifiers_inheritance.hierarchy_book_statuses;

public abstract class BookMover {
	
	protected void failInfo(Status currentStatus, Status newStatus) {
		System.out.println("Перевод книги из статуса '" + currentStatus + "' в статус '" + newStatus +
			"' невозможен");
	}
	
	protected void moveToStatus(Book book, Status requestedStatus) {
		System.out.println("Moving status...");
		
	}
	
}
