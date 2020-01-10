package problem2;

public class CheckingAccount extends Account{

	int freeTransactions;
	int count;
	
	public CheckingAccount(int accNumber,int freeTransactions, int count) {
		super(accNumber);	
		this.freeTransactions = freeTransactions;
		this.count=count;
	}
	public void deposit(double sum) { 
		super.deposit(sum);
	}
	
	public void withdraw(double sum) {
		super.withdraw(sum);
	}
	
	public void deductFee() {
		if(freeTransactions < count) {
			withdraw(0.02);
		}
		count++;
		freeTransactions--;
	}

}
