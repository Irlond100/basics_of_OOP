package access_modifiers_inheritance.hierarchy_book_statuses;

public class FromAvailableStatusMover extends BookMover {
	
	@Override
	protected void moveToStatus(Book book, Status requestedStatus) {
		if (book.getStatus() != Status.AVAILABLE) {
			failInfo(book.getStatus(), requestedStatus);
			return;
		}
		switch (requestedStatus) {
			 case BORROWED, ARCHIVED -> {
				super.moveToStatus(book, requestedStatus);
				book.setStatus(requestedStatus);
			}
			default -> failInfo(book.getStatus(), requestedStatus);
		}
		
	}
	
}
