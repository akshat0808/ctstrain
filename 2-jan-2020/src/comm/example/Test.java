package comm.example;
import comm.example.AccountType;

import java.util.Scanner;

import comm.example.Account;

public class Test {
	private static Scanner scanner= new Scanner(System.in);

	public static void main(String[] args) {
		int choice=-1;
		Account account = null;
		do {
			
		
		System.out.println("1.create account");
		System.out.println("2.display account");
		System.out.println("o.exit");
		System.out.print("enter your choice>>");
		choice=scanner.nextInt();
		switch(choice) {
		case 1:
			account=Account.createAccount(AccountType.CREDITCARD, 15000);
		break;
		case 2:
		System.out.println(account.displayAccount());
		break;
		case 0:
			System.out.println("exiting from the system..");
			System.exit(0);
			
		default:
				System.out.println("invalid choice..!!!");
		break;
		}
		}
		while(choice!=0);
	}

}
