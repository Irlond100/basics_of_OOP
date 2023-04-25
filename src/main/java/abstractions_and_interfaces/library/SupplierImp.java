package abstractions_and_interfaces.library;

public class SupplierImp extends  User implements Supplier{
	
	public SupplierImp(String name) {
		super(name);
	}
	
	@Override
	public String supplyBook(Librarian librarian, String bookName) {
		System.out.printf("%s передает библиотекарю %s книгу\n", this, librarian);
	return bookName;
	}
	
}
