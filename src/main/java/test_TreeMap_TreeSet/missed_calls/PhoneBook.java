package test_TreeMap_TreeSet.missed_calls;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
	
	Map<String, Map<String, Contact>> map = new HashMap<>();
	
	public void addGroup(String name) {
		map.put(name, new HashMap<>());
	}
	
	public void addContacts(String groupName, Contact... contacts) {
		Map<String, Contact> contactMap = map.get(groupName);
		if (contactMap == null) {
			System.out.println("Группы " + groupName + " не существует");
		} else {
			for (Contact contact : contacts) {
				contactMap.put(contact.getTelephoneNumber(), contact);
			}
		}
	}
	
	public Collection<Contact> getContacts(String name) {
		return map.get(name).values();
	}
	
	public Contact getContact(String number) {
		for (Map.Entry<String, Map<String, Contact>> entry : map.entrySet()) {
			Map<String, Contact> contacts = entry.getValue();
			Contact contact = contacts.get(number);
			if (contact != null) {
				return contact;
			}
		}
		return null;
	}
	
	public List<Contact> getAllContacts() {
		return map.values().stream().flatMap(map -> map.values().stream()).toList();
	}
	// Доработайте коллекцию в классе PhoneBook таким образом, чтобы поиск контакта по номеру
	// внутри группы был за O(1). Перебор самих групп оставляем как есть.
	// При отображении списка пропущенных организуйте поиск контакта через данный метод.
}
