package access_modifiers_inheritance.hierarchy_book_statuses;

public class FromOverduedStatusMover extends BookMover {
	
	@Override
	protected void moveToStatus(Book book, Status requestedStatus) {
		if (book.getStatus() != Status.OVERDUED) {
			failInfo(book.getStatus(), requestedStatus);
			return;
		}
		switch (requestedStatus) {
			case ARCHIVED, AVAILABLE -> {
				super.moveToStatus(book, requestedStatus);
				book.setStatus(requestedStatus);
			}
			default -> failInfo(book.getStatus(), requestedStatus);
		}
		
	}
	
}
