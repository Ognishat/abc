package org.jsp.bank_atm;

public class Account {
String account_holder_name;
String dob;
String pin;
double money;
long accountno;
public Account(String account_holder_name, String dob, String pin, double money, long accountno) {
	super();
	this.account_holder_name = account_holder_name;
	this.dob = dob;
	this.pin = pin;
	this.money = money;
	this.accountno = accountno;


}
public void accountDetail() {
	System.out.println(account_holder_name);
	System.out.println(dob);
	System.out.println(pin);
	System.out.println(money);
	System.out.println(accountno);
}
}
