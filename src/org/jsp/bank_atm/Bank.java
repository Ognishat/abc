package org.jsp.bank_atm;

public class Bank {
	String name;
	String loc;
	String ifsc_code;
	Account a = new Account(ifsc_code, ifsc_code, ifsc_code, 0, 0);

	public Bank(String name, String loc, String ifsc_code) {
		super();
		this.name = name;
		this.loc = loc;
		this.ifsc_code = ifsc_code;
	}

	public void bankDetail() {
		System.out.println("name : " + name);
		System.out.println("loc: " + loc);
		System.out.println("ifsc_code: " + ifsc_code);

		if (a != null) {
			System.out.println("name " + a.account_holder_name);
			System.out.println("dob " + a.dob);
			System.out.println("pin " + a.pin);
			System.out.println("money " + a.money);
		} else {
			System.out.println("Open an acoount First");
		}
	}

	public void createAccount(Account a) {
		if (this.a == null) {
			this.a = a;
			System.out.println("Account created succesfully");
		} else {
			System.out.println("Account alredy exists");
		}
	}

	public void Deposit(long accountno, double money) {
		if (a.accountno == accountno) {
			if (money != 0) {
				a.money = a.money + money;
				System.out.println("Deposit amount is " + money);
				System.out.println("Total balance is " + a.money);
			} else {
				System.out.println("Enter a valid amount to add in account");
			}
		} else {
			System.out.println("Enter a Valid account number");
		}
	}

	public void Withdraw(long accountno, double money) {
		if (a.accountno == accountno) {
			if (a.money >= money) {
				a.money = a.money - money;
				System.out.println("Withdraw amount is " + money);
				System.out.println("total balance is " + a.money);
			} else {
				System.out.println("enter a valid amount to withdraw from acount");
			}
		}
	}

	public void DeleteAccount() {
		this.a = null;
		System.out.println("Account Deleted");
	}

}
