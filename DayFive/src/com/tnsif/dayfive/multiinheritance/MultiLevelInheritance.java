package com.tnsif.dayfive.multiinheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		
		//create object of country/state/city
		
		City c=new City();
		c.setArea(200897.67f);
		c.setCountryName("India");
		c.setCapital("Delhi");
		c.setCityname("Pune");
		c.setLanguage("Marathi");
		c.setStatename("maharshtra");
		
		System.out.println(c);

	}

}
