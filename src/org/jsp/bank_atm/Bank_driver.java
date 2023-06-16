package org.jsp.bank_atm;

import java.util.Scanner;

public class Bank_driver {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = s.next();
		System.out.println("Enter the address of the bank");
		String loc = s.next();
		System.out.println("Enter the bank ifsc_code");
		String ifcs = s.next();
		Bank b = new Bank(name, loc, ifcs);
Account a=new Account(ifcs, ifcs, ifcs, 0, 0);
		boolean option = true;
		while (option) {
			System.out.println("Enter your Choice");
			System.out.println("enter 1.For Open an account");
			System.out.println("enter 2.For The acoount details");
			System.out.println("enter 3.For Deposting Amount");
			System.out.println("enter 4.For Withdrwaing Amount");
			System.out.println("enter 5.For Deleting the account");
			System.out.println("enter 6.for exit & close");

			int choice = s.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter The Name");
				String name1 = s.next();
				System.out.println("Enter DoB");
				String dob = s.next();
				System.out.println("Enter pin");
				String pin = s.next();
				System.out.println("Enter Money to deposit");
				double money = s.nextDouble();
				System.out.println("Enter the account number of your choice");
				long accountno = s.nextLong();
				b.createAccount(new Account(name, dob, pin, money, accountno));
				System.out.println("______________________________________");
			}
				break;
			case 2: {
				b.bankDetail();
				System.out.println("___________________________________");
			}
				break;
			case 3: {
				System.out.println("enter the account number to deposit money");
				long accountno1 = s.nextLong();
				System.out.println("Enter how much money you want to deposit");
				double money1 = s.nextDouble();
				b.Deposit(accountno1, money1);
				System.out.println("_______________________________________");
			}
				break;
			case 4: {
				System.out.println("Enter the account number to witdraw money");
				long accountno1 = s.nextLong();
				System.out.println("Enter how much money you want to withdraw");
				double money1 = s.nextDouble();
				b.Withdraw(accountno1, money1);
				System.out.println("______________________________________");
			}
				break;
			case 5: {
				b.DeleteAccount();
			}
				break;

			case 6: {
				System.out.println("thankyou for using " + name);
				System.out.println("Have a Good Day!!!!!");
				option = false;
			}
				break;
			default: {
				System.out.println("Enter a Valid Choice");
				break;
			}
			}

		}
		
	}
}
