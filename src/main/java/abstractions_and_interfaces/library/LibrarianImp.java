package abstractions_and_interfaces.library;

public class LibrarianImp extends User implements Librarian{
	
	public LibrarianImp(String name) {
		super(name);
	}
	
	@Override
	public void ordersBook(Supplier supplier, String bookName) {
		System.out.printf("%s заказывает книгу %s у поставщика %s \n", this, bookName, supplier);
	}
	
}
