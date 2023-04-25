package abstractions_and_interfaces.library;

public class ReaderImp extends User implements Reader{
	
	public ReaderImp(String name) {
		super(name);
	}
	
	@Override
	public void takeBook(Administrator administrator, String bookName) {
		System.out.printf("%s просит у %s книгу %s \n", this,administrator , bookName);
	}
	
	@Override
	public void revivesBook(Administrator administrator, Book book) {
		System.out.printf("%s возвращает %s книгу %s \n", this, administrator, book.getName());
	}
	
}
