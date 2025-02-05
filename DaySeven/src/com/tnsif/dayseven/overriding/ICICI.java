package com.tnsif.dayseven.overriding;

public class ICICI extends RBI {

	@Override
	public float getRateOfInterested()
	{
		System.out.println("Hello welcome to HDFC Bank");
		return 6.6f;
	}
}
