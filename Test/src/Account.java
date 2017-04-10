
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

	public void debit(double money)throws Exception {
		if(balance>=money) {
			balance -= money;
		} else if(balance-money<0) {
			  throw new Exception("출력 불가");
		}
	}

	public double getBalance() {
		return balance;
	}
	public abstract double getWithdrawableAccount();
		
	public abstract void passTime(int time);
	

}
