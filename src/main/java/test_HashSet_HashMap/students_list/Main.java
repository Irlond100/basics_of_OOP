package test_HashSet_HashMap.students_list;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
		Scanner scanner = new Scanner(System.in);
		HashSet<Student> set = new HashSet<>();
		while (true) {
			String line = scanner.nextLine();
			if (line.equals("end")) {
				break;
			}
			String[] strings = line.split(", ");
			Student student = new Student(strings[0], strings[1], Integer.parseInt(strings[2]));
			if (!set.add(student)) {
				System.out.println("Данный студент существует");
			}
			System.out.println("Введите информацию о студенте (для завершения работы программы введите \"end\")");
		}
		for (Student element : set) {
			System.out.println(element.toString());
			}
	}
	
}
