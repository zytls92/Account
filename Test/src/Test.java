import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CheckingAccount account1 = new CheckingAccount();
		CheckingAccount account2 = new CheckingAccount();
		System.out.print("How much money do you put into account1:");
		double amount1 = input.nextDouble();
		account1.Credit(amount1);
		System.out.print("How much money do you put into account2:");
		double amount2 = input.nextDouble();
		account2.Credit(amount2);
		System.out.print("account1 balance:"+account1.getBalance()+"\n");
		System.out.print("account2 balance:"+account2.getBalance()+"\n");
		System.out.print("Enter withdrawl amount for account1:");
		double amount3 = input.nextDouble();
		System.out.printf("subtracting"+" "+amount3+"from account1 balance\n");
		account1.Debit(amount3);
		System.out.print("account1 balance:"+account1.getBalance()+"\n");
		System.out.print("account2 balance:"+account2.getBalance()+"\n");
		System.out.print("Enter withdrawl amount for account2:");
		double amount4 = input.nextDouble();
		System.out.printf("subtracting"+" "+amount4+"from account2 balance\n");
		account2.Debit(amount4);
		System.out.print("account1 balance:"+account1.getBalance()+"\n");
		System.out.print("account2 balance:"+account2.getBalance()+"\n");
		account1.nextMonth();
		account2.nextMonth();
		System.out.print("next month!\n");
		System.out.print("account1 balance:"+account1.getBalance()+"\n");
		System.out.print("account2 balance:"+account2.getBalance()+"\n");
		
	}

}
