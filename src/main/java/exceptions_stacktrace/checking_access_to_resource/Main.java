package exceptions_stacktrace.checking_access_to_resource;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите логин: ");
		String login = scanner.nextLine();
		System.out.print("Введите пароль: ");
		String password = scanner.nextLine();
		
		User user = getUserByLoginAndPassword(login, password);
		
		validateUser(user);
		System.out.println("Доступ предоставлен");
	}
	
	public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
		User[] users = getUsers();
		for (User user : users) {
			if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
				return user;
			}
		}
		throw new UserNotFoundException("User not found");
	}
	
	public static User[] getUsers() {
		return new User[]{
			new User("Alex", "qwer", "alex@gmail.com", 18),
			new User("Goga", "qwerr", "asdf@mail.com", 15)
		};
	}
	
	public static void validateUser(User user) throws AccessDeniedException {
		if (user.getAge() < 18) {
			throw new AccessDeniedException("Ты мал");
		}
	}
	
}
