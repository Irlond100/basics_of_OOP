package abstractions_and_interfaces.bank_accounts;

public class Main {
	public static void main(String[] args) {
		Account savingsAccount = new SavingsAccount();
		Account creditAccount = new CreditAccount();
		Account checkingAccount = new CheckingAccount();
		
		savingsAccount.addMoney(1000);
		creditAccount.addMoney(5000);
		checkingAccount.addMoney(2000);
		
		savingsAccount.transfer(checkingAccount, 500);
		checkingAccount.pay(1000);
		creditAccount.pay(3000);
		
		System.out.println("Savings account balance: " + savingsAccount.balance);
		System.out.println("Credit account balance: " + creditAccount.balance);
		System.out.println("Checking account balance: " + checkingAccount.balance);
	}
}
