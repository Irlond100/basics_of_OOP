package abstractions_and_interfaces.bank_accounts;

public abstract class Account {
	protected int balance;
	
	public abstract void pay(int amount);
	
	public abstract void transfer(Account account, int amount);
	
	public abstract void addMoney(int amount);
}

