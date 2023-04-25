package polymorphism.shooter_game.Weapon;

public class WaterGun extends Weapon {
	@Override
	public void shot() {
		System.out.println("Звук выстрела водного пистолета");
	}
}
