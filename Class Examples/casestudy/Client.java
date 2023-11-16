package casestudy;

import java.util.HashMap;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		HashMap<Long, Account> accounts = new HashMap<Long, Account>();

		long accNo;

		String accHolderName;

		long contactNo;

		float accBalance = 1;

		String typeOfAccount;

		System.out.println("Welcome to the Bank Application");

		boolean value = true;

		Account account;

		while (value) {
			System.out.println("*****************************");

			System.out.println("1.Create a new bank Account");
			System.out.println("2.Check Balance");
			System.out.println("3.Deposit");
			System.out.println("4.Withdraw");
			System.out.println("5.FundTransfer");
			System.out.println("6.Print Bank Statement");
			System.out.print("Please enter your option:-");
			int option = scan.nextInt();
			switch (option) {
			case 1: {

				System.out.println("***Account Registration*****");

				System.out.print("Enter your name:-");
				accHolderName = scan.next();

				System.out.print("Enter your contact Number:-");
				contactNo = scan.nextLong();

				System.out.print("Enter your type of Account:-");
				typeOfAccount = scan.next();

				accNo = contactNo - 1000000;

				account = new Account(accNo, accHolderName, contactNo, typeOfAccount, accBalance);

				accounts.put(accNo, account);

				System.out.println("Congrats your account is sucessfully created with the account Number:-"+accNo);

				break;

			}
			
			case 2:{
				System.out.println("******Check your Balance****");
				
				System.out.print("Enter your Account number:-");
				
				accNo=scan.nextLong();
				
				account = accounts.get(accNo);
				
				float balance =account.getAccBalance();
				
				System.out.println("Your account Balance is :-"+balance);
				
				
				break;
			}
			
			case 3:{
				System.out.println("*****Deposit Your Amount****");
				
				System.out.print("Enter your account number:-");
				accNo=scan.nextLong();
				
				System.out.println("Enter your deposit amount:-");
				float depositAmount = scan.nextFloat();
				
				account = accounts.get(accNo);
				
				float existingAmount =account.getAccBalance();
				
				float finalAmount = existingAmount +depositAmount;
				
				account.setAccBalance(finalAmount);
				
				accounts.put(accNo, account);
				
				System.out.println("Sucessfully your amount is created into your account");
			
				System.out.println("your current account balance is :-"+finalAmount);
				
				
				
				break;
			}

			default: {

				value = false;
				break;
			}
			}

		}
	}

}
