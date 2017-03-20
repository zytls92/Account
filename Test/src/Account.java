
public class Account {
	private double balance;

	Account() {
		balance=100;
	}

	public void Credit(double money) {
		balance += money;
	}

	public void Debit(double money) {
		if(balance>money){
		balance -= money;
		}
		else{
		System.out.print("Debit amount exceeded account balance\n");
		}
	}

	public double getBalance() {
		return balance;

	}

}
