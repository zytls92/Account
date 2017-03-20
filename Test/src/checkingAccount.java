
public class checkingAccount extends Account {
	private double credit_limit;
	private double interest;
	private double loan_interst;
;	private double bal;

	checkingAccount() {
		
		credit_limit = -50;
		interest = 0.01;
		loan_interst = 0.07;
		bal= getBalance();
	}

	public void nextMonth() {
		if(bal>=0)
		{
			
			bal=bal*(1+interest);
		}
		else{
			bal=bal*(1+loan_interst);
		}
	}
@Override
	public void Debit(double money) {
		if ( bal- money >= credit_limit) {

			bal=bal-money;
		}
		else{
			System.out.print("오류입니다.");
			
		}
}
		double getBal(){
			return bal;
		}
	
}
