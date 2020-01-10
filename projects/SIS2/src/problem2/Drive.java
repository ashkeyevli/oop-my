package problem2;

public class Drive {

	public static void main(String[] args) {
		Bank bank = new Bank();
		SavingsAccount savingsAccount = new SavingsAccount(1, 0.5);
		CheckingAccount checkingAccount = new CheckingAccount(2,5,3);
		Account account = new Account(3);
		bank.openAccount(savingsAccount);
		bank.openAccount(checkingAccount);
		bank.openAccount(account);
		
		bank.update(500);
		System.out.println(bank.toString());
		account.transfer(40, checkingAccount);
		bank.closeAccount(savingsAccount);
		System.out.println(bank.toString());
	}

}
