package com.tnsif.dayeleven.throwsexception;

public class greaterValueException extends Exception {

	
	public greaterValueException(String string)
	{
		super(string);
	}
	
	public greaterValueException()
	{
		super("Percentage should not bemore then 100  ");
	}
	
}
