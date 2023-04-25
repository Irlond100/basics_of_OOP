package test_HashSet_HashMap.phonebook;

public class Main {
	
	public static void main(String[] args) {
		PhoneBook phoneBook = new PhoneBook();
		phoneBook.addGroup("Работа");
		phoneBook.addGroup("Семья");
		phoneBook.addContacts("Работа", new Contact("Саша", 70900000));
		phoneBook.addContacts("Семья", new Contact("Мама", 23456789), new Contact("Папа", 234567890));
		System.out.println(phoneBook.getContact(70900000));
		System.out.println(phoneBook.getContact(4567890));
		System.out.println(phoneBook.getContacts("Семья"));
		System.out.println(phoneBook.getContacts("Семьяф"));
	}
	
}
