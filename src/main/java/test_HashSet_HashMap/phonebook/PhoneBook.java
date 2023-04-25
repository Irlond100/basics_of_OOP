package test_HashSet_HashMap.phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
	
	Map<String, List<Contact>> map = new HashMap<>();
	
	public void addGroup(String name) {
		map.put(name, new ArrayList<>());
	}
	
	public void addContacts(String name, Contact... contact) {
		List<Contact> list = map.get(name);
		if (list == null) {
			System.out.println("Группы " + name + " не существует");
		} else {
			list.addAll(List.of(contact));
		}
	}
	
	public List<Contact> getContacts(String name) {
		return map.get(name);
	}
	
	public Contact getContact(int number) {
		for (Map.Entry<String, List<Contact>> entry : map.entrySet()) {
			for (Contact contact : entry.getValue()) {
				if (contact.getTelephoneNumber() == number) {
					return contact;
				}
			}
		}
		return null;
	}
	
}
