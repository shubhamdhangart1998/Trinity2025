package com.tnsif.dayfive.multiinheritance;

public class State extends Country{

	private String statename;
	private String language;
	
	//getter and setter method 
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "State [statename=" + statename + ", language=" + language + ", getCountryName()=" + getCountryName()
				+ ", getCapital()=" + getCapital() + "]";
	}
	
	
	
	
	
}
