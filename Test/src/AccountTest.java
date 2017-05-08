import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class AccountTest {
	public static void main(String args[])throws Exception{
		CheckingAccount account1=new CheckingAccount(100,50,0.01,0.07);
		SavingsAccount account2 = new SavingsAccount(100,0.05);
		ArrayList<Account> accountList = new ArrayList<Account>();
		accountList.add(account1);
		accountList.add(account2);
		System.out.println("��ü ������ �ܾ� �ջ�:"+Account.sumForAccount(accountList));
		System.out.println("��ü ������ 12���� �� ����");
		Account.passTimeForList(accountList,12);
		System.out.println("��ü ������ �ܾ� �ջ�:"+Account.sumForAccount(accountList));
		
		
	}
}
/*public class AccountTest {
	public static void main(String args[]) throws Exception{
		
		
		 * �޼ҵ� �����ε��� ���� �׽�Ʈ �ϴ� �ڵ��Դϴ�.
		 * ������ �� �޼ҵ�� �� �ٸ� �κ��� ���� �������� ������.
		 
		
		Scanner scan = new Scanner(System.in);
		
		Valuable[] objectList = new Valuable[4];
		
		objectList[0] = new CheckingAccount(100,50,0.01,0.07);
		objectList[1] = new SavingsAccount(100,0.05);
		objectList[2] = new Human("Mark", 20);
		objectList[3] = new Car("MyCar", 5000);
		
		for(Valuable objectItem : objectList){
			System.out.printf("%s \n", objectItem.toString());
			System.out.printf("1 month later Value (Method Overloding, no parameter) : %.2f\n", objectItem.estimateValue());
			System.out.printf("5 month later Value : %.2f\n\n", objectItem.estimateValue(5));
		}
		
		
		
		 * ������� �߰���� ���������� �ǽ��� ��ü������ �׽�Ʈ�մϴ�.
		 * ������ �� �޼ҵ�� �� �ٸ� �κ��� ���� �������� ������.
		 
		
		Account account1 = new CheckingAccount(100,50,0.01,0.07);
		Account account2 = new SavingsAccount(100,0.05);
		CheckingAccount c_account1 = (CheckingAccount)account1;
		
		int cmd;
		do{
			double amount = 0;
			cmd = scan.nextInt();
			switch(cmd){
				//CheckingAccount �׽�Ʈ 
				case 1 : 
					try{ 
						System.out.println("$100 �Ա�");
						account1.credit(100);
						System.out.printf("Account1�� �ܾ� : $%.2f\n",account1.getBalance());
						System.out.printf("Account1�� ��ݰ��ɾ� : $%.2f\n",account1.getWithdrawableAccount());
						System.out.println("------------------------------------------------------");
						
						System.out.println("$150 ���");
						account1.debit(150);
						System.out.printf("Account1�� �ܾ� : $%.2f\n",account1.getBalance());
						System.out.printf("Account1�� ��ݰ��ɾ� : $%.2f\n",account1.getWithdrawableAccount());
						if(c_account1.isBankrupted()==true)
							System.out.println("�Ļ�");
						System.out.println("------------------------------------------------------");
						
						account1.passTime();
						System.out.printf("1���� �� ��ġ��ȭ �� Account1�� �ܾ� : $%.2f\n",account1.getBalance());
						System.out.printf("Account1�� ��ݰ��ɾ� : $%.2f\n",account1.getWithdrawableAccount());
						if(c_account1.isBankrupted()==true)
							System.out.println("�Ļ�");
						System.out.println("------------------------------------------------------");
							
					
						System.out.println("$80 ���");
						account1.debit(80);
						System.out.printf("Account1�� �ܾ� : $%.2f\n",account1.getBalance());
						System.out.printf("Account1�� ��ݰ��ɾ� : $%.2f\n",account1.getWithdrawableAccount());
						if(c_account1.isBankrupted()==true)
							System.out.println("�Ļ�");
						System.out.println("------------------------------------------------------");
						
						System.out.print("5���� �� ��ġ : ");
						account1.passTime(5);
						System.out.printf("5���� �� ��ġ ��ȭ �� Account1�� �ܾ� : $%.2f\n",account1.getBalance());
						System.out.printf("Account1�� ��ݰ��ɾ� : $%.2f\n",account1.getWithdrawableAccount());
						if(c_account1.isBankrupted()==true)
							System.out.println("�Ļ�");
						System.out.println("------------------------------------------------------");
						
						System.out.println("amount�� �����Է�");
						account1.debit(-1);
						System.out.println("------------------------------------------------------");
						
					}catch(InputMismatchException e){
						System.out.println("���ܹ߻� " + e.toString() + ": ���ڸ� �Է��ϼ���\n");
					}
					catch(Exception e){
						System.out.println("���ܹ߻�   "+e.toString());
					}
					
					break;
			
				
				//SavingsAccount �׽�Ʈ 
				case 2 : 
					try{ 
						System.out.println("$150 ���");
						account2.debit(150);
						System.out.printf("Account2�� �ܾ� : $%.2f\n",account2.getBalance());
						System.out.printf("Account2�� ��ݰ��ɾ� : $%.2f\n",account2.getWithdrawableAccount());
						
					}catch(InputMismatchException e){
						System.out.println("���ܹ߻� " + e.toString() + ": ���ڸ� �Է��ϼ���\n");
					}
					catch(Exception e){
						System.out.println("���ܹ߻�   "+e.toString());
					}
					break;
					
				case 3 :
					try{ 
						account2.passTime();
						
						System.out.printf("1���� �� ��ġ��ȭ �� Account2�� �ܾ� : $%.2f\n",account2.getBalance());
						System.out.printf("Account2�� ��ݰ��ɾ� : $%.2f\n",account2.getWithdrawableAccount());
						System.out.printf("1���� °�� ��ġ : %.2f\n",account2.estimateValue());
						System.out.println("------------------------------------------------------");
		
						account2.passTime(5);
						System.out.printf("5���� �� ��ġ ��ȭ �� Account2�� �ܾ� : $%.2f\n",account2.getBalance());
						System.out.printf("Account1�� ��ݰ��ɾ� : $%.2f\n",account2.getWithdrawableAccount());
						System.out.printf("6���� °�� ��ġ : %.2f\n",account2.estimateValue(6));
						System.out.println("------------------------------------------------------");
						
						account2.passTime(5);
						System.out.printf("5���� �� ��ġ ��ȭ �� Account2�� �ܾ� : $%.2f\n",account2.getBalance());
						System.out.printf("Account2�� ��ݰ��ɾ� : $%.2f\n",account2.getWithdrawableAccount());
						System.out.printf("11���� °�� ��ġ %.2f\n",account2.estimateValue(11));
						System.out.println("------------------------------------------------------");
						
						account2.passTime();
						System.out.printf("1���� �� ��ġ��ȭ �� Account2�� �ܾ� : $%.2f\n",account2.getBalance());
						System.out.printf("Account2�� ��ݰ��ɾ� : $%.2f\n",account2.getWithdrawableAccount());
	
						System.out.println("------------------------------------------------------");
						
						System.out.println("amount�� �����Է�");
						account1.debit(-1);
						System.out.println("------------------------------------------------------");
						
					}catch(InputMismatchException e){
						System.out.println("���ܹ߻� " + e.toString() + ": ���ڸ� �Է��ϼ���\n");
					}
					catch(Exception e){
						System.out.println("���ܹ߻�   "+e.toString());
					}		
					break;
					
				case 0 : System.out.println("��");
			}	
		}while(cmd!=0);		
	} 
}
*/