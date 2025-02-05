package com.tnsif.dayseven.overriding;

public class HDFC  extends RBI{
	
	@Override
	public float getRateOfInterested()
	{
		System.out.println("Hello welcome to HDFC Bank");
		return 6.2f;
	}

}
