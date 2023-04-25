package abstractions_and_interfaces.bank_accounts;

public class CreditAccount extends Account {
	public CreditAccount() {
		balance = 0;
	}
	
	@Override
	public void pay(int amount) {
		balance -= amount;
		System.out.println("Payment successful");
	}
	
	@Override
	public void transfer(Account account, int amount) {
		System.out.println("You cannot transfer from a credit account");
	}
	
	@Override
	public void addMoney(int amount) {
		if (balance < 0) {
			balance += amount;
			System.out.println("Money added successfully");
		} else {
			System.out.println("Cannot add money to a credit account with a positive balance");
		}
	}
}
