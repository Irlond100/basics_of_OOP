package polymorphism.shooter_game;

import games.Weapon.Automaton;
import games.Weapon.Pistol;
import games.Weapon.RPG;
import games.Weapon.Slingshot;
import games.Weapon.WaterGun;
import games.Weapon.Weapon;

public class Player {
	
	private static Weapon[] weaponSlots;
	
	public Player() {
		weaponSlots = new Weapon[]{
			new Automaton(),
			new RPG(),
			new Pistol(),
			new Slingshot(),
			new WaterGun()
		};
	}
	
	public int getSlotsCount() {
		// length - позволяет узнать, сколько всего слотов с оружием у игрока
		return weaponSlots.length;
	}
	
	public static void shotWithWeapon(int slot) {
		// TODO проверить на выход за границы
		// если значение slot некорректно, то
		// выйти из метода написав об этом в консоль
		
		// Получаем оружие из выбранного слота
		Weapon weapon = weaponSlots[slot];
		// Огонь!
		weapon.shot();
	}
	
}
