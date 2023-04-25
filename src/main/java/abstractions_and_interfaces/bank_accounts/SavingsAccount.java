package abstractions_and_interfaces.bank_accounts;

public class SavingsAccount extends Account {
	
	public SavingsAccount() {
		balance = 0;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println("Вы не можете оплатить со сберегательного счета");
	}
	
	@Override
	public void transfer(Account account, int amount) {
		if (balance >= amount) {
			balance -= amount;
			account.addMoney(amount);
			System.out.println("Перевод выполнен успешно");
		} else {
			System.out.println("Недостаточно средств");
		}
	}
	
	@Override
	public void addMoney(int amount) {
		balance += amount;
		System.out.println("Деньги успешно добавлены");
	}
	
}
