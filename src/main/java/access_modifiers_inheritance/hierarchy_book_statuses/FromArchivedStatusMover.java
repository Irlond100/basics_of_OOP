package access_modifiers_inheritance.hierarchy_book_statuses;

public class FromArchivedStatusMover extends BookMover {
	
	@Override
	protected void moveToStatus(Book book, Status requestedStatus) {
		if (book.getStatus() != Status.ARCHIVED) {
			failInfo(book.getStatus(),requestedStatus);
			return;
		}
		if (requestedStatus == Status.AVAILABLE) {
			super.moveToStatus(book, requestedStatus);
			book.setStatus(requestedStatus);
		} else {
			failInfo(book.getStatus(),requestedStatus);
		}
		
	}
	
}
