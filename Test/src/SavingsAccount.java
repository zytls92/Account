public class SavingsAccount extends Account {

	private double savingInterest;
	private int time;
	public SavingsAccount(double balance, double interest){
			super(balance); 
			this.savingInterest=interest;
	}
	@Override
	public void debit(double money) throws Exception{
		if(this.time<12){
			throw new Exception("아직 출금 불가");
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

		if(this.time>=12){
			balance=balance*Math.pow((1+savingInterest), 12);
	    }
			
	}
	@Override
	public double estimateValue(int month)
	{
		return balance*Math.pow((1+savingInterest),month);
		
	}
	public String toString()
	{
		return String.format("SavingAccount_Balance:"+balance);
		
	}
	public void passTime() {
		
		this.time+=1;
		if(this.time==12)
		{
			balance=balance*Math.pow((1+savingInterest), this.time);
			
		}
	}
	public double estimateValue() {

		return balance*Math.pow((1+savingInterest),1);
	}
}