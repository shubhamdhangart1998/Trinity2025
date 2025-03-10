package com.tnsif.daytwelve.synchronization;

public class Account implements Bank {

	
	private int accNo;
	private String name;
	private double balance;
	
	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}

	
	
	public Account(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public Account() {
		super();
	}

	@Override
	public void deposit(int amt) throws DepositLimitException {
		if(amt> 25000)
		{
			throw new DepositLimitException("Daily limit exceeded ........");
		}
		else {
			balance +=amt;
			System.out.println("Amount Deposit ......"+ amt );
		}
		
	}

	//my account at a time i m also withdroawing from gpay + my friend is withra atm + emi is also getting cutting 
	//30000 =20k + 25K + 15k
	
	
	@Override
	public synchronized void withdraw(int amt) throws InsufficientBalanceException {
		
		
		if(balance - amt < MINBAL)
		{
			throw new InsufficientBalanceException();
		}
		else {
			balance =balance-amt;
			System.out.println("After withdrawing RS: "+ amt + " Current Balance is Rs: "+ balance);
			
		}
		
	}

}
