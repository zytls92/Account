import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account account1 = new Account();
		Account account2 = new Account();
		System.out.print("How much money do you put into account1:");
		double amount1 = input.nextDouble();
		account1.Credit(amount1);
		System.out.print("How much money do you put into account2:");
		double amount2 = input.nextDouble();
		account2.Credit(amount2);
		System.out.print("account1 balance:"+account1.Balance()+"\n");
		System.out.print("account2 balance:"+account2.Balance()+"\n");
		System.out.print("Enter withdrawl amount for account1:");
		double amount3 = input.nextDouble();
		System.out.printf("subtracting"+" "+amount3+"from account1 balance\n");
		account1.Debit(amount3);
		System.out.print("account1 balance:"+account1.Balance()+"\n");
		System.out.print("account2 balance:"+account2.Balance()+"\n");
		System.out.print("Enter withdrawl amount for account2:");
		double amount4 = input.nextDouble();
		System.out.printf("subtracting"+" "+amount4+"from account2 balance\n");
		account2.Debit(amount4);
		System.out.print("account1 balance:"+account1.Balance()+"\n");
		System.out.print("account2 balance:"+account2.Balance()+"\n");
	}
}
