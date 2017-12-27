package Atm;

import java.util.Scanner;

public class Login{
	private String ccnumber;
	private int ccpin;

	public void LoginMenu() 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("-----ATM LOGIN-----\n");
		System.out.println("Enter Credict Card Number :");
		ccnumber = scan.next();
		System.out.println("Enter Pýn Code :");
		ccpin = scan.nextInt();
//		scan.close();
	}
	public String getCcnumber() {
		return ccnumber;
	}
	public void setCcnumber(String ccnumber) {
		this.ccnumber = ccnumber;
	}
	public int getCcpin() {
		return ccpin;
	}
	public void setCcpin(int ccpin) {
		this.ccpin = ccpin;
	}
	public boolean LoginVerification(String ccnumber, int ccpin) 
	{
		if(ccnumber.equals("11") &&ccpin==11) 
		{
			return true;
		}
		else
			return false;
	}
}
