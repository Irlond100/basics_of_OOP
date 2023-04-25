package abstractions_and_interfaces.library;

public class Main {
	
	public static void main(String[] args) {
		ReaderImp reader = new ReaderImp("Александр");
		SupplierImp supplier = new SupplierImp("Глеб");
		LibrarianImp librarian = new LibrarianImp("Карл");
		AdministratorImp administrator = new AdministratorImp("Марк");
		
		reader.takeBook(administrator, " Игра престолов");
		Book book = administrator.findAndGiveBook(reader, "Игра престолов");
		librarian.ordersBook(supplier, "Игра престолов");
		supplier.supplyBook(librarian, "Игра престолов");
		administrator.overdueNotification(reader);
		reader.revivesBook(administrator, book);
	}
	
}
