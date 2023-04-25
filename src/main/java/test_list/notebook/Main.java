package test_list.notebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		while (true) {
			System.out.println("""
				Выберите действие:
				1. Добавить задачу
				2. Вывести список задач
				3. Удалить задачу
				0. Выход""");
			Scanner scanner = new Scanner(System.in);
			Scanner info = new Scanner(System.in);
			switch (scanner.nextInt()) {
				case 1 -> {
					System.out.println("Введите задачу для планирования:");
					list.add(info.nextLine());
				}
				case 2 -> {
					System.out.println("Список задач:");
					for (int i = 0; i < list.size(); i++) {
						System.out.println(i + 1 + ".  " + list.get(i));
					}
					System.out.println();
				}
				case 3 -> {
					System.out.println("Введите номер задачи:");
					list.remove(info.nextInt() - 1);
					System.out.println("Задача удалена.");
				}
				case 0 -> {
					return;
				}
			}
			
		}
	}
	
}
	

