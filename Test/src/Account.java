import java.util.ArrayList;
import java.util.List;
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
			  throw new Exception("출금 불가");
		}
	}

	public double getBalance() {
		return balance;
	}
	public abstract double getWithdrawableAccount();
		
	public abstract void passTime(int time);
	public abstract void passTime();
	public static double sumForAccount(ArrayList<? extends Account>list){
		double sum=0;
		for(Account account:list){
			sum+=account.getBalance();
			
		}
		return sum;
	}
	public static void passTimeForList(ArrayList<? extends Account>list,int month){
		
		for(Account account:list){
			
			account.passTime(month);
		}
	}

}