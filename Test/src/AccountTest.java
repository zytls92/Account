import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
			checkingAccount Account1 =new checkingAccount();
			checkingAccount Account2 =new checkingAccount();
			System.out.print("Account1 balance:"+Account1.getBal()+"\n");
			System.out.print("Account2 balance:"+Account2.getBal()+"\n");
			System.out.print("Enter deposit amount for Account1:");
			double mo1=input.nextDouble();
			Account1.Credit(mo1);
			System.out.print("Account1 balance:"+Account1.getBal()+"\n");
			System.out.print("Account2 balance:"+Account2.getBal()+"\n");
			System.out.print("Enter withdrawal amount for Account2:");
			double mo2=input.nextDouble();
			Account2.Debit(mo2);
			System.out.print("Account1 balance:"+Account1.getBal()+"\n");
			System.out.print("Account2 balance:"+Account2.getBal()+"\n");
			System.out.print("next month!\n");
			Account1.nextMonth();
			Account2.nextMonth();
			System.out.print("Account1 balance:"+Account1.getBal()+"\n");
			System.out.print("Account2 balance:"+Account2.getBal()+"\n");
	}
}
