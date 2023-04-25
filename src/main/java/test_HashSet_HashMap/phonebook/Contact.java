package test_HashSet_HashMap.phonebook;

public class Contact {
	
	private String name;
	private int telephoneNumber;
	
	public Contact(String name, int telephoneNumber) {
		this.name = name;
		this.telephoneNumber = telephoneNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getTelephoneNumber() {
		return telephoneNumber;
	}
	
	public void setTelephoneNumber(int telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
	@Override
	public String toString() {
		return "Контакты: " + name + " " + telephoneNumber;
	}
	
}
