package Atm;

import java.util.Scanner;

public class Transaction {
	private int index;
	public void TransactionMenu() 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("1-) Deposit :");
		System.out.println("2-) Withdraw :");
		System.out.println("3-) Feedback :");
		System.out.println("4-) Send Money :");
		System.out.println("5-) Exit");
		index = scan.nextInt();
//		scan.close();
	}
	public int getIndex() {
		return index;
	}
}
