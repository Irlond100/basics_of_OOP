package abstractions_and_interfaces.library;

public class AdministratorImp extends User implements Administrator {
	
	public AdministratorImp(String name) {
		super(name);
	}
	
	@Override
	public Book findAndGiveBook(Reader reader, String bookName) {
		System.out.printf("%s нашел книгу %s и выдал ее читателю %s \n", this, bookName, reader);
		return new Book(bookName);
	}
	
	@Override
	public void overdueNotification(Reader reader) {
		System.out.printf("%s предупреждает читателя %s о задолженности \n", this, reader);
	}
	
}
