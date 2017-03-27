
public class SavingAccount extends Account  {

	private double savingInterest;
	private int time;
	public SavingAccount(double balance, double interest){
			super(balance); 
			this.savingInterest=interest;
	}
	@Override
	public void debit(double money){
		if(this.time<12){
			System.out.println("아직 출금할 수 없습니다.");
		} else{
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
	public void passTime(int a){
		time+=a;
		if(time==12){
			balance=balance*Math.pow((1+savingInterest), time);
	    }
		else{
			balance=balance;
		}
			
	}
}
