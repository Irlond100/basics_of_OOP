package polymorphism.shooter_game;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Player player = new Player();
		// Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
		System.out.format("У игрока %d слотов с оружием,"
				+ " введите номер, чтобы выстрелить,"
				+ " -1 чтобы выйти%n",
			player.getSlotsCount()
		);
		while (true) {
			int slot = scanner.nextInt();
			if (slot == -1) {
				System.out.println("Game over!");
				break;
			}
			if (slot > -1 && slot < player.getSlotsCount()) {
				Player.shotWithWeapon(slot);
			} else {
				System.out.println("Нет такого оружия");
			}
			
		}
	}
	
}