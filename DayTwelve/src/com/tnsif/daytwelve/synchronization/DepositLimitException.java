package com.tnsif.daytwelve.synchronization;

public class DepositLimitException extends Exception {

	public DepositLimitException ()
	{
		super("daily limit deposit is exceeded.....");
	}
	
	public DepositLimitException (String message)
	{
		super(message);
	}
}
