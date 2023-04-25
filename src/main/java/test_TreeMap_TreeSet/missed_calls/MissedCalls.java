package test_TreeMap_TreeSet.missed_calls;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {
	
	private final Map<LocalDateTime, String> missedCalls = new TreeMap<>();
	
	public void getMissedCalls(PhoneBook phoneBook) {
		
		for (Map.Entry<LocalDateTime, String> entry : missedCalls.entrySet()) {
			String tel = entry.getValue();
			Contact contact = phoneBook.getContact(tel);
			if (contact != null) {
				System.out.println(entry.getKey() + " : " + contact.getName());
			} else {
				System.out.println(entry.getKey() + " : " + tel);
			}
			
		}
	}
		public void call (String number){
			missedCalls.put(LocalDateTime.now(), number);
		
	}
	
}