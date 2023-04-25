package test_Queue.elevator;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static int totalSeconds = 0;
	static int waitDoorsInSeconds = 10;
	static int waitMoveInSeconds = 5;
	static int previousFloor = -1;
	private static Queue<Integer> elevator = new ArrayDeque<>();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int previousFloorElev = 0;
		while (true) {
			System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
			int i = scanner.nextInt();
			if (i == 0) {
				elevator.offer(i);
				break;
			}
			if (i < 0 || i > 25) {
				System.out.println("Такого этажа нет в доме");
				continue;
			}
			if (previousFloorElev == i) {
				continue;
			}
			elevator.offer(i);
			previousFloorElev = i;
		}
		
		while (!elevator.isEmpty()) {
			int currentFloor = elevator.poll();
			if (previousFloor != -1) {
				totalSeconds += waitMoveInSeconds * Math.abs(currentFloor - previousFloor);
				totalSeconds += waitDoorsInSeconds;
			}
			previousFloor = currentFloor;
			if (currentFloor != 0) {
				System.out.print("этаж " + currentFloor + " -> ");
			} else {
				System.out.println("этаж " + currentFloor);
			}
		}
		System.out.println();
		System.out.println("Время затраченное лифтом на маршрут =: " + totalSeconds + " с.");
	}
	
}
