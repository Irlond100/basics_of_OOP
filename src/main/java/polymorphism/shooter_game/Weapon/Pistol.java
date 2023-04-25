package polymorphism.shooter_game.Weapon;

public class Pistol extends Weapon {
	@Override
	public void shot() {
		System.out.println("Звук выстрела Пистолета");
	}
}
