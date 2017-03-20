
public class Account {
	private String name;
	private double money;
	
 void Credit(double money)
 {
	 this.money+=money;
	 
 }
 void Debit(double money)
 {
	 if(this.money<money)
	 {
		 System.out.print("Debit amount exceeded account balance\n");
	 }
	 else{
	 this.money-=money;
	 }
 }
 double Balance()
 {
	 return this.money;
 }
}
