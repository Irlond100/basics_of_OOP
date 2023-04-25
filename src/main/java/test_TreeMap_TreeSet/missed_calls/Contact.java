package test_TreeMap_TreeSet.missed_calls;

public class Contact {
	
	private String name;
	private String telephoneNumber;
	
	public Contact(String name, String telephoneNumber) {
		this.name = name;
		this.telephoneNumber = telephoneNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
	@Override
	public String toString() {
		return "Контакты: " + name + " " + telephoneNumber;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		Contact contact = (Contact) o;
		
		return telephoneNumber.equals(contact.telephoneNumber);
	}
	
	@Override
	public int hashCode() {
		return telephoneNumber.hashCode();
	}
	
}
