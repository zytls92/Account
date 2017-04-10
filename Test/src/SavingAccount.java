
public class SavingAccount extends Account {

	private double savingInterest;
	private int time;
	public SavingAccount(double balance, double interest){
			super(balance); 
			this.savingInterest=interest;
	}
	@Override
	public void debit(double money) throws Exception{
		if(this.time<12){
			throw new Exception("아직 출금할 수 없습니다");
		} 
		else{
			balance=balance-money;
		}
		
	}
	public double getWithdrawableAccount(){
		if(this.time<12){
			return 0;
		} else{
			return balance;
		}
	}
	public void passTime(int time){
		this.time+=time;

		if(this.time==12){
			balance=balance*Math.pow((1+savingInterest), this.time);
	    }
		else{
			balance=balance;
		}
			
	}
	@Override
	public double EstimateValue(int month)
	{
		return balance*Math.pow((1+savingInterest),month);
		
	}
	public String toString()
	{
		return String.format("SavingAccount_Balance:"+balance);
		
	}
}
