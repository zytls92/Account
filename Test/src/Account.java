
public class Account {
	
	private double balance;
	public Account(){
		
		balance=100.00;
	}
	
 void Credit(double money)
 {
	 this.balance+=money;
	 
 }
 void Debit(double money)
 {
	 if(this.balance<money)
	 {
		 System.out.print("Debit amount exceeded account balance\n");
	 }
	 else{
	 this.balance-=money;
	 }
 }
 double getBalance()
 {
	 return this.balance;
 }
 protected void setBalance(double a){
	 balance=a;
	 
 }
}
