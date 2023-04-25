package abstractions_and_interfaces.bank_accounts;

public class CheckingAccount extends Account {
	public CheckingAccount() {
		balance = 0;
	}
	
	@Override
	public void pay(int amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Payment successful");
		} else {
			System.out.println("Insufficient funds");
		}
	}
	
	@Override
	public void transfer(Account account, int amount) {
		if (balance >= amount) {
			balance -= amount;
			account.addMoney(amount);
			System.out.println("Transfer successful");
		} else {
			System.out.println("Insufficient funds");
		}
	}
	
	@Override
	public void addMoney(int amount) {
		balance += amount;
		System.out.println("Money added successfully");
	}
}
