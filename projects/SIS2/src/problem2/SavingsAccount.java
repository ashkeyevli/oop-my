package problem2;

public class SavingsAccount extends Account{

	double interestRate;
	
	public SavingsAccount(int accNumber, double interestRate) {
		super(accNumber);
		this.interestRate=interestRate;
	}
	
	
	public void addInterest() {
		deposit(getBalance()*interestRate);
	}

	public void deposit(double sum) { 
		super.deposit(sum);
	}
	
	public void withdraw(double sum) {
		super.withdraw(sum);
	}

}