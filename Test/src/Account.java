
public abstract class Account implements Valuable{
	protected double balance;

	public Account(double initialBalance) {
		balance= initialBalance;
	}
	protected void setBalance(double balance)
	{
		this.balance=balance;
	}

	public void credit(double money) {
		balance += money;
	}

	public void debit(double money) {
		if(balance>money) {
			balance -= money;
		} else {
			System.out.print("Debit amount exceeded account balance\n");
		}
	}

	public double getBalance() {
		return balance;
	}
	public abstract double getWithdrawableAccount();
		
	public abstract void passTime(int time);
	

}
