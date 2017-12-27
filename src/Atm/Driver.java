package Atm;

//import java.util.Scanner;

public class Driver{
	


	public static void main(String[] args) {
		boolean verification=false;
		clearConsole();
		while(verification!=true) {
		Login lgn =  new Login();
		lgn.LoginMenu();
		User person = new User(lgn.getCcnumber(),lgn.getCcpin());
		verification = lgn.LoginVerification(person.getCcnumber(), person.getCcpin());
		clearConsole();
		if(verification==true) 
		{
			System.out.println("Entered to system succesfully.\n");
		}
		else 
			System.out.println("You entered wrong information!\n");
		}
		
		Transaction transaction =new Transaction();
		transaction.TransactionMenu();
		
		
        switch (transaction.getIndex()) {
            case 1: Deposit Item1 =new Deposit();
    				System.out.println(Item1.toString());
                     break;
            case 2: Withdraw Item2 = new Withdraw();
            System.out.println(Item2.toString());
                     break;
            case 3: Feedback Item3 = new Feedback();
            System.out.println(Item3.toString());
                     break;
            case 4: SendMoney Item4 = new SendMoney();
            System.out.println(Item4.toString());
                     break;
            case 5: clearConsole();
            		clearConsole();
                     break;
            default: clearConsole();
    				 clearConsole();	break;
        }
	}

	public final static void clearConsole()
	{
		for(int clear = 0; clear < 29; clear++)
		  {
		     System.out.println("\n") ;
		  }
	}

}
