public class CheckingAccount extends Account {
	private double creditLimit;
	private double interest;
	private double loanInterest;

	CheckingAccount(double balance, double limit, double interest, double loanInterest) {
		super(balance);
		creditLimit = -limit;
		this.interest = interest;
		this.loanInterest = loanInterest;
		setBalance(balance);
	}

	public void nextMonth() {
		if (balance >= 0) {
			balance = balance * (1 + interest);

		} else {
			balance = balance * (1 + loanInterest);
		}
	}

	@Override
	public void debit(double money) throws Exception {
		if (money < 0) {
			throw new Exception("음수 입력!!");
		} else {
			if (balance - money >= creditLimit) {
				balance = balance - money;
			}

			else {
				throw new Exception("한도 초과입니다");
			}
		}
	}

	public double getWithdrawableAccount() {
		if (balance > creditLimit) {
			return balance - creditLimit;
		} else {
			return 0;
		}

	}

	public void passTime(int time) {
		if (balance >= 0) {
			balance = balance * (Math.pow(1 + interest, time));
		} else {
			balance = balance * (Math.pow(1 + loanInterest, time));
		}

	}
	

	public boolean isBankrupted() {
		if (balance < creditLimit) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public double estimateValue(int month) {

		return balance * (Math.pow(1 + interest, month));
	}
	public void passTime() {
		if (balance >= 0) {
			balance = balance * (Math.pow(1 + interest, 1));
		} else {
			balance = balance * (Math.pow(1 + loanInterest, 1));
		}

	}
	public double estimateValue() {

		return balance * (Math.pow(1 + interest, 1));
	}

	public String toString() {
		return String.format("CheckingAccount_Balance:" + balance);

	}
}