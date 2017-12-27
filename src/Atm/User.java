package Atm;

public class User{
	private String ccnumber;
	private int ccpin;
	public User(String ccnumber,int ccpin) 
	{
		this.ccnumber = ccnumber;
		this.ccpin = ccpin;
	}
	public String getCcnumber() {
		return ccnumber;
	}
	public int getCcpin() {
		return ccpin;
	}
}
