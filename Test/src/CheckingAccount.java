
public class CheckingAccount extends Account {
	
private double credit_limit;
private double interest;
private double loan_interest;
private double balance;
public CheckingAccount(){
	credit_limit=50;
	interest=0.01;
	loan_interest=0.07;
	balance=100.0;
}
@Override
public void Credit(double money){
	
	balance+=money;
}
@Override
public void Debit(double money){
	
	balance-=money;
	if(balance<-100){
		
		System.out.print("출금 불가합니다\n");
		balance+=money;
	}
}
public void nextMonth(){
	if(balance>=0){
	balance=balance*(1+interest);
	}
	else{
		balance=balance*(1+loan_interest);
		}
}
@Override
public void setBalance(double b){
	
	balance=b;
}
@Override
public double getBalance(){
	return balance;

}
}
