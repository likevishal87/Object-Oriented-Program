package com.bridgelabz;

import java.util.Scanner;

public class AccountDebit {
	public static void main(String[] args) {
		int amount;
		int debit;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount");
		amount = scanner.nextInt();
		System.out.println("Enter the debit");
		debit = scanner.nextInt();

		Account1 object = new Account1(amount, debit);
		object.debit();

	}
}

class Account1 {
	int AccountBalance;
	int debit;

	public Account1(int AccountBalance, int debit) {

		this.AccountBalance = AccountBalance;
		this.debit = debit;
	}

	@Override
	public String toString() {
		return "Account1 [AccountBalance=" + AccountBalance + "]";
	}

	public int getAccountBalance() {
		return AccountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		AccountBalance = accountBalance;
	}

	void debit() {
		if (AccountBalance < debit) {
			System.out.println("Debit amount exceeded account balance");
		} else {
			System.out.println("Ammount debited is " + debit);
			System.out.println("Remaining balance is " + (AccountBalance - debit));
		}

	}

}
