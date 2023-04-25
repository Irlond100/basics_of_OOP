package test_TreeMap_TreeSet.missed_calls;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		PhoneBook phoneBook = new PhoneBook();
		MissedCalls missedCalls = new MissedCalls();
		missedCalls.call("70900000");
		Thread.sleep(10);
		missedCalls.call("23456789");
		Thread.sleep(10);
		missedCalls.call("0000");
		phoneBook.addGroup("Работа");
		phoneBook.addGroup("Семья");
		phoneBook.addContacts("Работа", new Contact("Саша", "70900000"));
		phoneBook.addContacts("Семья", new Contact("Мама", "23456789"),
			new Contact("Папа", "234567890"));
		
		missedCalls.getMissedCalls(phoneBook);
	}
	
}
