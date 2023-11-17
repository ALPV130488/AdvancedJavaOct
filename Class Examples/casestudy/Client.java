package casestudy;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Client {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		HashMap<Long, Account> accounts = new HashMap<Long, Account>();

		HashMap<Integer, Transaction> transactions = new HashMap<Integer, Transaction>();

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

				System.out.println("Congrats your account is sucessfully created with the account Number:-" + accNo);

				break;

			}

			case 2: {
				System.out.println("******Check your Balance****");

				System.out.print("Enter your Account number:-");

				accNo = scan.nextLong();

				account = accounts.get(accNo);

				float balance = account.getAccBalance();

				System.out.println("Your account Balance is :-" + balance);

				break;
			}

			case 3: {
				System.out.println("*****Deposit Your Amount****");

				System.out.print("Enter your account number:-");
				accNo = scan.nextLong();

				System.out.println("Enter your deposit amount:-");
				float depositAmount = scan.nextFloat();

				account = accounts.get(accNo);

				float existingAmount = account.getAccBalance();

				float finalAmount = existingAmount + depositAmount;

				account.setAccBalance(finalAmount);

				accounts.put(accNo, account);

				System.out.println("Sucessfully your amount is created into your account");

				System.out.println("your current account balance is :-" + finalAmount);

				LocalDate date = LocalDate.now();

				Random random = new Random();

				int transId = random.nextInt();

				Transaction transaction = new Transaction(accNo, "Deposit", date, 0, depositAmount, finalAmount,
						transId);

				transactions.put(transId, transaction);

				break;
			}

			case 4: {

				System.out.println("*******Amount withdrawl*******");

				System.out.print("Enter your account number:-");
				accNo = scan.nextLong();

				System.out.print("Enter the withdrawl amount:-");
				float withdrawlAmount = scan.nextFloat();

				account = accounts.get(accNo);

				float existingBalance = account.getAccBalance();

				float finalAmount = existingBalance - withdrawlAmount;

				account.setAccBalance(finalAmount);

				accounts.put(accNo, account);

				System.out.println("Amount is sucessfully debited from ur Account");

				System.out.println("the current existing balance is:-" + finalAmount);

				LocalDate date = LocalDate.now();

				Random random = new Random();

				int transId = random.nextInt();

				Transaction transaction = new Transaction(accNo, "withdraw", date, withdrawlAmount, 0, finalAmount,
						transId);

				transactions.put(transId, transaction);

				break;
			}

			case 5: {

				System.out.println("*******Fund Transfer**********");

				System.out.print("Enter your from account number:-");

				long accNoFrom = scan.nextLong();

				System.out.print("Enter your to account number:-");

				long accNoTo = scan.nextLong();

				System.out.print("Enter your amount to transfer:-");

				float transferAmount = scan.nextFloat();

				Account fromAccount = accounts.get(accNoFrom);

				Account toAccount = accounts.get(accNoTo);

				float fromAccountBalance = fromAccount.getAccBalance();

				float toAccountBalance = toAccount.getAccBalance();

				fromAccountBalance = fromAccountBalance - transferAmount;

				toAccountBalance = toAccountBalance + transferAmount;

				fromAccount.setAccBalance(fromAccountBalance);

				toAccount.setAccBalance(toAccountBalance);

				accounts.put(accNoFrom, fromAccount);

				accounts.put(accNoTo, toAccount);

				System.out.println("Amount is sucessfully transfered");

				System.out.println("the current balance is:-" + fromAccountBalance);

				LocalDate date = LocalDate.now();

				Random random = new Random();

				int transId = random.nextInt();

				Transaction transaction = new Transaction(accNoFrom, "Fundtransfer", date, transferAmount, 0, fromAccountBalance,
						transId);

				transactions.put(transId, transaction);

				break;
			}
			
			case 6:{
				
				System.out.println("*******Bank Statement**********");
				
				
				System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s","transId","AccountNo","Balance","Date","DepBal","WitBal");
				
				System.out.println();
				Set<Integer> set = transactions.keySet();
				
				Iterator itr = set.iterator();
				
				while(itr.hasNext()) {
					
					int key = (int) itr.next();
					
					Transaction trans = transactions.get(key);
					
					System.out.println(trans.getTransId() +"  "+trans.getAccNo() +"  "+trans.getBalance() + "  "+trans.getDate() +"  "+trans.getDepositAmount() +"  "+trans.getWithdrawlAmount());
					
					
				}
				
				value = false;
				break;
				
			}

			default: {

				System.out.println("*****Thank you for choosing our bank ******");
				System.out.println();
				
				System.out.println("Please visit us again");
				value = false;
				break;
			}
			}

		}
	}

}
