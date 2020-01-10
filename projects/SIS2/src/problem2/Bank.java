package problem2;
import java.util.Vector;


public class Bank {
	
Vector<Account> accounts = new Vector<Account>();
	public void update(int sum) {
		for (Account account : accounts) {
			account.deposit(sum);
			if(account instanceof SavingsAccount) ((SavingsAccount) account).addInterest();
			else if (account instanceof CheckingAccount) ((CheckingAccount) account).deductFee();
		}
	}

	public void openAccount(Account account) {
		accounts.addElement(account);
	}
	
	public void closeAccount(Account account) {
		accounts.remove(account);
	}

	public String toString() {
		String string = "";
		for (Account account : accounts) {
			string += account.toString() + "\n";
		}
		return string;
	
	}
}
